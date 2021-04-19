package com.tts;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double square(double a) {
        return a * a;
    }

}
class MagicCalculator extends  Calculator{
    public double sqrt(double num){
        return  Math.sqrt(num);
    }
    public double sin(double num){
        return  Math.sin(num);
    }
    public double cosine(double num){
        return  Math.cos(num);
    }
    public double tangent (double num){
        return  Math.tan(num);
    }
    public int factorial  (int num){
        if (num <= 2) {
            return num;
        }
        return num * factorial(num - 1);
    }

}
