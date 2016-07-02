package com.jp.base.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author: Jerzy Plocha on 27/06/16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        System.out.println(principal);

        model.addAttribute("username", principal);

        return "index";
    }
}
