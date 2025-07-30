package com.yw.pod.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PodController {

    @GetMapping("/test")
    public String test() {
        return "Hello World! 개발 브렌치 입니다.";
    }
}
