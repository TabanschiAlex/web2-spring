package com.streeling.homework.controller;

import com.streeling.homework.model.MyList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
public class FifthExercisesController {
    @RequestMapping("/list")
    public String getList(@RequestParam Map<String, String> params, final Model model) {
        List<MyList> list = new LinkedList<>();

        params.forEach((String key, String value) -> list.add(new MyList(key, value)));
        model.addAttribute("list", list);

        return "default";
    }

    @RequestMapping(value = "/json", produces = "application/json")
    public String getJson(@RequestParam Map<String, String> params, final Model model) {
        List<MyList> json = new LinkedList<>();

        params.forEach((String key, String value) -> json.add(new MyList(key, value)));
        model.addAttribute("json", json);

        return "json";
    }
}
