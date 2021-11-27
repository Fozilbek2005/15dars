package com.company;

public class Food {
    private int price;
    private int calories;
    private double fat;

    public Food(int price, int calories, double fat) {
        this.price = price;
        this.calories = calories;
        this.fat = fat;
    }

    public Food() {
    }

    public int getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public double getFat() {
        return fat;
    }
}
