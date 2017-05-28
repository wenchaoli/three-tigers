package com.tigers.palmschool.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PingController {

    @RequestMapping("/")
    public boolean index() {
        return true;
    }
}