package com.tigers.palmschool.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PingController {

    @RequestMapping("/")
    public boolean index() {
        return true;
    }
}