package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("У каждого игрока по 10 попыток");
        System.out.println("Имя первого игрока: ");
        Player player1 = new Player(scanner.next());
        System.out.println("Имя второго игрока: ");
        Player player2 = new Player(scanner.next());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String answer = "yes";
         do {
             if (answer.equals("yes")) {
                 guessNumber.play();
                 System.out.println("Хотите продолжить игру? [yes/no]:");
             } else {
                 System.out.println("Некорректный ввод");
                 System.out.println("Вы хотите продолжить вычисления? [yes/no]");
             }
             answer = scanner.next();
         } while (!answer.equals("no"));
    }
}
