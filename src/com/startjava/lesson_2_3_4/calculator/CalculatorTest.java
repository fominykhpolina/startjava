package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String testAnswer = "yes";
        do {
            if (testAnswer.equals("yes")) {
                System.out.println("Введите математическое выражение (пример: 2 + 10) : ");
                String answer = scanner.nextLine();
                double result = calculator.calculate(answer);
                if (result != Double.MIN_VALUE) {
                    if (result % 1 == 0) {
                        System.out.print("Результат: " + (int) result);
                    } else {
                        System.out.printf("Результат: " + "%.3f", result);
                    }
                }
                System.out.println("\nВы хотите продолжить вычисления? [yes/no]");
                testAnswer = scanner.nextLine();
            } else {
                System.out.println("Некорректный ввод" + "\nВы хотите продолжить вычисления? [yes/no]");
                testAnswer = scanner.nextLine();
            }
        } while (!testAnswer.equals("no"));
    }
}