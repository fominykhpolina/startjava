package com.startjava.lesson_1.final;

public class Calculator {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 7;
        char sign = '^';
        int result = 1;
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '%') {
            result = num1 % num2;
        } else if (sign == '^') {
            for(; num2 > 0; num2--) {
                result *= num1;
            }
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}