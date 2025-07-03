package com.example.frex.api.controller;

import com.example.frex.api.service.FrexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FrexController {
    @Autowired
    private FrexService frexService;

    @GetMapping("/hello")
    public ResponseEntity sayHello() {
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity sayHey() {
        return new ResponseEntity<>(frexService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/getAllId")
    public ResponseEntity projectId() {
        return new ResponseEntity<>("welcome", HttpStatus.OK);
    }
}
