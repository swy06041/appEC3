package com.example.appec3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("asd")
public class SampleController2 {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }
}
