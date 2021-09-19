package com.streeling.homework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/first-exercise")
public class FirstExercisesController {
    @GetMapping("/a")
    public String a(HttpServletRequest request) {
        return request.getServletPath();
    }

    @GetMapping("/b")
    public String b(HttpServletRequest request) {
        return request.getRequestURI();
    }

    @GetMapping("/c")
    public StringBuffer c(HttpServletRequest request) {
        return request.getRequestURL();
    }

    @GetMapping("/d")
    public String d(HttpServletRequest request) {
        return request.getContextPath();
    }

    @GetMapping("/e")
    public String e(HttpServletRequest request) {
        return request.getQueryString();
    }
}
