package com.example.buildincontainer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping(value = "/", produces = "application/json")
    public Map<String, String> index() {
        return Map.of("foo", "bar", "baz", "foobar");
    }
}