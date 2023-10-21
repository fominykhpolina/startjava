package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);
    String[] mathExpression = new String[0];
    private double num1;
    private double num2;
    private String sign;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public double calculate() {
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
                break;
        }
        return Double.MIN_VALUE;
    }

    public void printResult() {
        double result = calculate();
        if (result != Double.MIN_VALUE) {
            if (result % 1 == 0) {
                System.out.print("Результат: " + (int) result);
            } else {
                System.out.printf("Результат: " + "%.3f", result);
            }
        }
    }
}

