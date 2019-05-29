package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessRi {
    Logger logger=LoggerFactory.getLogger(MessRi.class);
    @RequestMapping("/mes")
    public String mes(){
        logger.info("通过lombok快速整合日志打印!");
        return "success";
    }
}
