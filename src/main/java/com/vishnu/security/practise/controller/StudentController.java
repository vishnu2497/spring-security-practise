package com.vishnu.security.practise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class StudentController {

    @GetMapping("test")
    String testMethof(){
        return "asdfdv";
    }
}
