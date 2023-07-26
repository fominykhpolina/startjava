package com.startjava.lesson_2_3_4.calculator;
public class Calculator {

    private double num1;
    private double num2;
    private String sign;

    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public void setSign (String sign) {
        this.sign = sign;
    }
    public double calculate() {
        switch (sign) {
            case "+" :
                return num1 + num2;
            case "-" :
                return num1 - num2;
            case "*" :
                return num1 * num2;
            case "/" :
                return num1 / num2;
            case "%" :
                return num1 % num2;
            case "^" :
                return Math.pow(num1, num2);
        }
        return 0;
    }
}

