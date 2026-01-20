package com.example.SpringProject1.SpringBootProject1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController  {
    @GetMapping("/")
    public String student(){
        return "this is student class...";
    }
}

