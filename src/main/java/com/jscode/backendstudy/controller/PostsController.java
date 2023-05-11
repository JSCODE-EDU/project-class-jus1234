package com.jscode.backendstudy.controller;

import com.jscode.backendstudy.dto.PostsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {

    @PostMapping("/post")
    public ResponseEntity<String> post(
            @RequestParam PostsDto board
    ){



        return ResponseEntity.ok("Post Success");
    }
}
