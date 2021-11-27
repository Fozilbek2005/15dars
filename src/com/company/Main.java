package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Food food = new Food(120,150,3.5);
        System.out.println(food.getPrice() + food.getCalories() + food.getFat());
    }
}