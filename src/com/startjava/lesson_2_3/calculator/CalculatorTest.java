package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());
            System.out.println("Введите знак: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());
            System.out.println("Результат: " + calculator.calculate());
            System.out.println("Вы хотите продолжить вычисления? [yes/no]");
            answer = scanner.next();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Некорректный ввод");
                System.out.println("Вы хотите продолжить вычисления? [yes/no]");
                answer = scanner.next();
            }
        }
    }
}