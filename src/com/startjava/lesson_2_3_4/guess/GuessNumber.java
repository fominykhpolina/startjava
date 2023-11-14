package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Random random = new Random();
        int secretNum = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            numberEnter(player1);
            player1.setNumber(scanner.nextInt());
            if (player1.getNumber() == secretNum) {
                printResult(player1);
                break;
            }
            if (player1.getNumber() > secretNum) {
                numberGrater(player1);
            } else {
                numberLess(player1);
            }
            if (player1.getAttemptCount() == 10) {
                attemptOver(player1);
            }
            numberEnter(player2);
            player2.setNumber(scanner.nextInt());
            if (player2.getNumber() == secretNum) {
                printResult(player2);
                break;
            }
            if (player2.getNumber() > secretNum) {
                numberGrater(player2);
            } else {
                numberLess(player2);
            }
            if (player2.getAttemptCount() == 10) {
                attemptOver(player2);
                attemptResult();
                break;
            }
        }
    }
    public void arrayPrint(int[] personNumber, int attemptCount) {
        int[] personNumberCopy = Arrays.copyOf(personNumber, attemptCount);
        for (attemptCount = 0; attemptCount < personNumberCopy.length; attemptCount++) {
            System.out.print(personNumberCopy[attemptCount] + " ");
        }
        System.out.println();
        attemptCount = 0;
        Arrays.fill(personNumber, 0, attemptCount, 0);
    }

    public void printResult(Player player) {
        System.out.println("Игрок " + player.getName() + " угадал число с " + player.getAttemptCount() + " попытки");
        arrayPrint(player1.getPersonNumber(), player1.getAttemptCount());
        arrayPrint(player2.getPersonNumber(), player2.getAttemptCount());
    }

    public void attemptResult() {
        player1.arrayTry();
        player2.arrayTry();
    }

    public void numberLess(Player player) {
        System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
    }

    public void numberGrater(Player player) {
        System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
    }

    public void attemptOver(Player player) {
        System.out.println("У " + player.getName() + " закончились попытки");
    }

    public void numberEnter(Player player) {
        System.out.println(player.getName() + " введите число");
    }
}