package com.hms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/")
public class RootController {
    @GetMapping
    public String root() {
        return "API Running and Deployed";
    }

}
