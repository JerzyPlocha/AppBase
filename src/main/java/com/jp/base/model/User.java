package com.jp.base.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Jerzy Plocha on 02/07/16.
 */
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private Boolean enabled;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<UserRole> roles = new HashSet<UserRole>();
}
