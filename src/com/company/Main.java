package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Food food = new Food();
        food.setPrice(120);
        food.setCalories(150);
        food.setFat(3.5);
        System.out.println(food.getFat()+food.getCalories()+food.getFat());
    }
}


