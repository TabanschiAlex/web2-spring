package com.streeling.homework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/second-exercise")
public class SecondExercisesController {
    @GetMapping("/a")
    public Cookie[] a(HttpServletRequest request) {
        return request.getCookies();
    }

    @GetMapping("/b")
    public String b(HttpServletRequest request) {
        return request.getHeader("headers");
    }

    @GetMapping("/c")
    public String c(HttpServletRequest request) {
        return request.getHeaderNames().toString();
    }
}
