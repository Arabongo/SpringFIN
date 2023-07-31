package com.example.demo.Ex4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealDAO extends JpaRepository<Meal, Long> {
    List<Meal> findByName(String name);
    List<Meal> findByIsSummerMeal(boolean isSummerMeal);
    List<Meal> findByIsWinterMeal(boolean isWinterMeal);
}