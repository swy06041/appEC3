package com.example.appec3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asd")
public class SampleController {

    @GetMapping("asd")
    public String[] hu() {
        return new String[]{"asd", "qwe", "zxc"};
    }
}
