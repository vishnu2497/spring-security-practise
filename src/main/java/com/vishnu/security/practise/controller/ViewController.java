package com.vishnu.security.practise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {

    @GetMapping("/login")
    String test() {
        return "login";
    }

    @GetMapping("/error")
    String error() {
        return "error";
    }

    @GetMapping("/noaccess")
    String noaccess() {
        return "noaccess";
    }

}
