package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int i = 0;

    int[] personNumber = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public int setNumber(int number) {
        personNumber[i] = number;
        i++;
        this.number = number;
        return number;
    }
    public void arrayPrint() {
        int[] personNumberCopy = Arrays.copyOf(personNumber, i);
        for(i = 0; i < personNumberCopy.length; i++) {
            System.out.print(personNumberCopy[i] + " ");
        }
        System.out.println();
        i = 0;
        Arrays.fill(personNumber, 0, i, 0);
    }
    public void arrayTry() {
        int[] personNumberCopy = Arrays.copyOf(personNumber, i);
        for(i = 0; i < personNumberCopy.length; i++) {
            System.out.print(personNumberCopy[i] + " ");
        }
        System.out.println();
        i = 0;
    }
    public String getName() {
        return name;
    }
    public int getI() {
        return i;
    }
    public int getNumber() {
        return number;
    }
}