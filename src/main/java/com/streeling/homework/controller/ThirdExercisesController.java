package com.streeling.homework.controller;

import com.streeling.homework.dto.Add;
import com.streeling.homework.dto.AddOptional;
import com.streeling.homework.dto.Concat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/third-exercise")
public class ThirdExercisesController {
    @PostMapping("/add")
    public Integer add(@RequestBody Add numbers) {
        return numbers.a + numbers.b;
    }

    @PostMapping("concat")
    public String concat(@RequestBody Concat concat ) {
        return concat.a + concat.b;
    }

    @PostMapping("/op")
    public Double op(@RequestBody AddOptional numbers) {
        return switch (numbers.operation) {
            case "+" -> (double) numbers.a + numbers.b;
            case "-" -> (double) numbers.a - numbers.b;
            case "/" -> (double) numbers.a / numbers.b;
            case "*" -> (double) numbers.a * numbers.b;
            default -> null;
        };
    }

    @GetMapping
    public String[] concatGet(HttpServletRequest request) {
        return request.getRequestURI().split("/");
    }
}
