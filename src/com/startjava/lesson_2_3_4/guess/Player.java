package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attemptCount;
    private int[] enteredNumbers;

    public Player(String name) {
        this.name = name;
        enteredNumbers = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public int getNumber() {
        return enteredNumbers[attemptCount - 1];
    }

    public void addNumber(int number) {
        enteredNumbers[attemptCount] = number;
        attemptCount++;
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(enteredNumbers, attemptCount);
    }

    public void clear() {
        Arrays.fill(enteredNumbers, 0, attemptCount, 0);
        attemptCount = 0;
    }
}
