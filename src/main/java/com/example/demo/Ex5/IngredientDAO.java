package com.example.demo.Ex5;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientDAO extends JpaRepository<Ingredient,Long> {
}
