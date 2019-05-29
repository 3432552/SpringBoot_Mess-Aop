package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrController {
    @RequestMapping("/a")
    public String index(int i){
        int j=1/i;
        return "success"+j;
    }
}
