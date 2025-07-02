package com.example.frex.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FrexController {
    @GetMapping("/hello")
    public ResponseEntity sayHello() {
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

    @GetMapping("/heyy")
    public ResponseEntity sayHey() {
        return new ResponseEntity<>("heyyy", HttpStatus.OK);
    }
}
