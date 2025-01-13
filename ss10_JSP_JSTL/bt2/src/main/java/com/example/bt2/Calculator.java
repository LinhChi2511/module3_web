package com.example.bt2;

public class Calculator {
    public static double calculator(double num1, double num2, String operator) {
        switch (operator){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new RuntimeException("Can't divide by zero");
                }
                return num1 / num2;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }
}
