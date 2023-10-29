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

    public void setSign(String sign) {
        this.sign = sign;
    }

    public double calculate(String answer) {
        String[] mathExpression = answer.split(" ");
        setNum1(Integer.parseInt(mathExpression[0]));
        setSign(mathExpression[1]);
        setNum2(Integer.parseInt(mathExpression[2]));
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

}

