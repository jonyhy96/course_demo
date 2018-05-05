package com.wacai.springboot_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetHostname {
    @RequestMapping("/v1/gethostname")
    @ResponseBody
    public String gethostname() {
        System.out.println(System.getenv("HOSTNAME"));
        return System.getenv("HOSTNAME");
    }
}
