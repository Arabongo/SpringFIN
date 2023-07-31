package com.example.demo.Ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealController {

    private final MealService mealService;

    @Autowired
    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping("/insert-meal-test")
    public ResponseEntity<Void> insertMealTest() {
        mealService.insertMealTest();
        return ResponseEntity.ok().build();
    }
}
