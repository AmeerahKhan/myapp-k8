package com.learn.kubernettes.myapp.gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class NameController {

    @GetMapping("/name")
    public ResponseEntity<String> getRandomName() {
        String name [] = {"Ameerah", "Yaqub"};

        return ResponseEntity.ok(name[new Random().nextInt(2)]);
    }
}
