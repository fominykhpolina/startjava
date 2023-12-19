package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNumber;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
        System.out.println("У каждого игрока по 10 попыток");
        do {
            if (guessNumber(player1) || guessNumber(player2)) {
                break;
            }
        } while (player2.getAttemptCount() < 10);
        endGame();
    }

    private boolean guessNumber(Player player) {
        enterNumber(player);
        boolean equal = compare(player);
        if (!equal && player.getAttemptCount() >= 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return equal;
        }
        return equal;
    }

    private void enterNumber(Player player) {
        System.out.println(player.getName() + " введите число");
        player.addNumber(scanner.nextInt());
    }

    private boolean compare(Player player) {
        int playerNumber = player.getNumber();
        if (playerNumber == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число с " + player.getAttemptCount() + " попытки");
            return true;
        }
        if (playerNumber > secretNumber) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private void endGame() {
        printResult(player1);
        printResult(player2);
        System.out.println();
        player1.clear();
        player2.clear();
    }

    private void printResult(Player player) {
        int[] enteredNumbers = player.getAllNumbers();
        for (int number : enteredNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}