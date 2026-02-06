package com.example.MyOwnGit.controller;


import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class FunController {

    @GetMapping("/fun")
    public ResponseEntity<String>fun()
    {
        return ResponseEntity.status(HttpStatus.OK).body("hi there!");
    }
}
