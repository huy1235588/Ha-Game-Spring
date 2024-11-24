package com.shop.hagame.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/genres")
public class GenresController {
    // Hiện toàn bộ genres
    @GetMapping("/get")
    public ResponseEntity<String> getAllGenres() {
        return ResponseEntity.ok("All Genres");
    }
}
