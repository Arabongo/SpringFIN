package com.example.demo.Ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MealService {
    private final MealDAO mealDAO;


    @Autowired
    public MealService(MealDAO mealDAO) {
        this.mealDAO = mealDAO;
    }

    public void insertMealTest() {
        mealDAO.save(new Meal("Pizza", "Good", 4.8, true, false));
    }

    public void addMeal(Meal meal) {
        mealDAO.save(meal);
    }

}