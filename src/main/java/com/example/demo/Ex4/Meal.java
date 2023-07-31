package com.example.demo.Ex4;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long  id;
    private String name;
    private String description;
    private double price;
    private boolean isSummerMeal;

    private boolean isWinterMeal;

    public Meal(String name, String description, double price, boolean isSummerMeal, boolean isWinterMeal) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.isSummerMeal = isSummerMeal;
        this.isWinterMeal=isWinterMeal;
    }
    public Meal(){

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSummerMeal() {
        return isSummerMeal;
    }

    public void setSummerMeal(boolean summerMeal) {
        isSummerMeal = summerMeal;
    }

    public boolean isWinterMeal() {
        return isWinterMeal;
    }

    public void setWinterMeal(boolean winterMeal) {
        isWinterMeal = winterMeal;
    }
}