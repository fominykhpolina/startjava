package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;

    private int attemptCount;
    private int[] personNumber = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        personNumber[attemptCount] = number;
        attemptCount++;
    }

    public String getName() {
        return name;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public int getNumber() {
        return personNumber[attemptCount - 1];
    }

    public int[] getPersonNumber() {
        return personNumber;
    }

    public void arrayTry() {
        int[] personNumberCopy = Arrays.copyOf(personNumber, attemptCount);
        for(attemptCount = 0; attemptCount < personNumberCopy.length; attemptCount++) {
            System.out.print(personNumberCopy[attemptCount] + " ");
        }
        System.out.println();
        attemptCount = 0;
    }
}