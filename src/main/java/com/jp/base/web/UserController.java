package com.jp.base.web;

import com.jp.base.model.UserResponse;
import com.jp.base.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Jerzy Plocha on 02/07/16.
 */
@CrossOrigin
@RestController
public class UserController {

    @Autowired
    MyUserService myUserService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<UserResponse> getUsers() {
        return myUserService.findAll();
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void createUser(@RequestBody UserResponse userResponse) {
        System.out.println("receiving user:");
        System.out.println(userResponse.username);
        System.out.println(userResponse.password);
        myUserService.create(userResponse);
    }
}
