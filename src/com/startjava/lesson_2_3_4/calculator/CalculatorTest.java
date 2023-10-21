package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Введите математическое выражение (пример: 2 + 10) : ");
            String str = scanner.nextLine();
            calculator.mathExpression = str.split(" ");
            calculator.setNum1(Integer.parseInt(calculator.mathExpression[0]));
            calculator.setSign(calculator.mathExpression[1]);
            calculator.setNum2(Integer.parseInt(calculator.mathExpression[2]));
            calculator.printResult();
            System.out.println("\nВы хотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Некорректный ввод" + "\nВы хотите продолжить вычисления? [yes/no]");
                answer = scanner.nextLine();
            }
        }
    }
}