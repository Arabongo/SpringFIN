package com.example.demo.Ex5;

import com.example.demo.Ex4.MealDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {
    private final IngredientDAO ingredientDAO;
    @Autowired
    public IngredientService(IngredientDAO ingredientDAO) {
        this.ingredientDAO = ingredientDAO;
    }
    public List<Ingredient> getAllIngredients() {
        return ingredientDAO.findAll();
    }

    public Ingredient getIngredientById(Long id) {
        return ingredientDAO.findById(id).orElse(null);
    }

    public Ingredient saveIngredient(Ingredient ingredient) {
        return ingredientDAO.save(ingredient);
    }

    public void deleteIngredient(Long id) {
        ingredientDAO.deleteById(id);
    }
}
}
