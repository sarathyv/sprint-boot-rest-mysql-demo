package com.example.sprintbootrestmysqldemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value="/home")
    public String home() {
        return "home";
    }
}
