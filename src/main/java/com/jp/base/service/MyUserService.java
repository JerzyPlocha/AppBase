package com.jp.base.service;

import com.jp.base.model.User;
import com.jp.base.model.UserResponse;
import com.jp.base.model.UserRole;
import com.jp.base.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Author: Jerzy Plocha on 02/07/16.
 */
@Service
public class MyUserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void create(UserResponse userResponse){
        User user = new User();
        user.setUsername(userResponse.username);
        user.setPassword(passwordEncoder.encode(userResponse.password));
        user.setEnabled(true);
        Set<UserRole> roles = new HashSet<>();
        UserRole userRole = new UserRole();
        userRole.setRole("ROLE_ADMIN");
        roles.add(userRole);
        user.setRoles(roles);
        userRepository.save(user);
    }

    public List<UserResponse> findAll(){
        List<User> users = userRepository.findAll();
        List<UserResponse> usersResponse = users.stream().map(u -> new UserResponse(u.getUsername(), u.getPassword())).collect(Collectors.toList());
        return usersResponse;
    }


}
