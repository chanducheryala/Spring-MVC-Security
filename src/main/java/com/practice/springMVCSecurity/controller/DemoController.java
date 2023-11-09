package com.practice.springMVCSecurity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    // add a request mapping for managers
    @GetMapping("/leaders")
    public String showLeaders(){
        return "leaders";
    }

    // add a request mapping for Admins
    @GetMapping("/admins")
    public String showAdmins(){
        return "admins";
    }

    // add a request mapping for Access Denied
    @GetMapping("/access-denied")
    public String showAccessDeniedPage(){
        return "access-denied";
    }
}
