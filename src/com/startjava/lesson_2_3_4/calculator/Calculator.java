package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        String[] elements = expression.split(" ");
        double num1 = Integer.parseInt(elements[0]);
        String sign = elements[1];
        double num2 = Integer.parseInt(elements[2]);
        switch (sign) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "%":
                return num1 % num2;
            case "^":
                return Math.pow(num1, num2);
            default:
                System.out.print("Ошибка: знак " + sign + " не поддерживается");
        }
        return Double.MIN_VALUE;
    }

}

