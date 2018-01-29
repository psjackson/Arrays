package com.example.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("Array of items sold at a Hot Dog Stand.");
        String[] hotDogStand = {"Hot Dog", "Bratwurst", "Hamburger", "Fries", "Soda"};
        for (String items : hotDogStand) {
            System.out.println(items);
        }
    }
}