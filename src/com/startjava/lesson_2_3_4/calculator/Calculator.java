package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static double num1;
    private static double num2;
    private static String sign;

    public static double calculate(String expression) {
        String[] elements = expression.split(" ");
        num1 = Integer.parseInt(elements[0]);
        sign = elements[1];
        num2 = Integer.parseInt(elements[2]);
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

