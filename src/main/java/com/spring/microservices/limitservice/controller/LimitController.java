package com.spring.microservices.limitservice.controller;

import com.spring.microservices.limitservice.entity.Limit;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/users")
public class LimitController {

    @GetMapping
    public ResponseEntity<Limit> getUser() {
        return ResponseEntity.ok(new Limit(5,999));
    }
}
