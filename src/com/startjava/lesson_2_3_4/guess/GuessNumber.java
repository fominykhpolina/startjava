package com.startjava.lesson_2_3_4.guess;

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
            System.out.println(player1.getName() + " введите число");
            player1.setNumber(scanner.nextInt());
            if (player1.getNumber() == secretNum) {
                System.out.println("Игрок " + player1.getName() + " угадал число с " + player1.getI() + " попытки");
                player1.arrayPrint();
                player2.arrayPrint();
                break;
            }
            if (player1.getNumber() > secretNum) {
                System.out.println("Число " + player1.getNumber() + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player1.getNumber() + " меньше того, что загадал компьютер");
            }
            if (player1.getI() == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }

            System.out.println(player2.getName() + " введите число");
            player2.setNumber(scanner.nextInt());
            if (player2.getNumber() == secretNum) {
                System.out.println("Игрок " + player2.getName() + " угадал число с " + player2.getI() + " попытки");
                player1.arrayPrint();
                player2.arrayPrint();
                break;
            }
            if (player2.getNumber() > secretNum) {
                System.out.println("Число " + player2.getNumber() + " больше того, что загадал компьютер");
            } else  {
                System.out.println("Число " + player2.getNumber() + " меньше того, что загадал компьютер");
            }
            if (player2.getI() == 10) {
                System.out.println("У " + player2.getName() + " закончились попытки");
                player1.arrayTry();
                player2.arrayTry();
                break;
            }
        }
    }

}