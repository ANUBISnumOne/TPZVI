package ru.stepanov.security.FirstSecurityApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {



    @GetMapping("/home")
    public String sayHello() {
        return "home";
    }


    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }
    @GetMapping("/subscribder")
    public String subPage() {
        return "subscriber";
    }
}
