package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.println("Введите математическое выражение (пример: 2 + 10) : ");
                String expression = scanner.nextLine();
                printResult(Calculator.calculate(expression));
                System.out.println("\nВы хотите продолжить вычисления? [yes/no]");
            } else {
                System.out.println("Некорректный ввод" + "\nВы хотите продолжить вычисления? [yes/no]");
            }
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }

    private static void printResult(double result) {
        if (result != Double.MIN_VALUE) {
            if (result % 1 == 0) {
                System.out.print("Результат: " + (int) result);
            } else {
                System.out.printf("Результат: " + "%.3f", result);
            }
        }
    }
}