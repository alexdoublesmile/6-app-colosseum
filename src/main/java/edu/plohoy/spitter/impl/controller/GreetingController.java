package edu.plohoy.spitter.impl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String getGreeting(
            @RequestParam(name = "name", required = false, defaultValue = "World")
                    String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String getMain(Map<String, Object> model) {
        model.put("username", "Alexandr");
        return "index";
    }
}
