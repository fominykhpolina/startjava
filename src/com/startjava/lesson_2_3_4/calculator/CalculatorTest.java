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
            String[] formula = str.split(" ");
            calculator.setNum1(Integer.parseInt(formula[0]));
            calculator.setSign(formula[1]);
            calculator.setNum2(Integer.parseInt(formula[2]));
            if (calculator.calculate() % 1 == 0) {
                System.out.println("Результат: " + (long) calculator.calculate());
            } else {
                System.out.println("Результат: " + calculator.calculate());
            }
            System.out.println("Вы хотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Некорректный ввод");
                System.out.println("Вы хотите продолжить вычисления? [yes/no]");
                answer = scanner.nextLine();
            }
        }
    }
}