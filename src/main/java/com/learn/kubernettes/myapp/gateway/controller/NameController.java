package com.learn.kubernettes.myapp.gateway.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@Slf4j
public class NameController {

    @GetMapping("/name")
    public ResponseEntity<String> getRandomName() {
        String name [] = {"Ameerah", "Yaqub"};
        String selectedName = name[new Random().nextInt(2)];
        log.info("The selected name is {}", selectedName);

        return ResponseEntity.ok(selectedName);
    }
}
