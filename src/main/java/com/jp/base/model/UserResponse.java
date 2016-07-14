package com.jp.base.model;

/**
 * Author: Jerzy Plocha on 02/07/16.
 */
public class UserResponse {

    public String username;
    public String password;

    public UserResponse() {
    }

    public UserResponse(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
