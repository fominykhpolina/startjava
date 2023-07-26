package com.startjava.lesson_2_3_4.array;

import java.util.Random;
import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        int[] numbers = {1, 3, 4, 7, 5, 2, 6};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println();
        int n = numbers.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = numbers[n - i - 1];
            numbers[n - i - 1] = numbers[i];
            numbers[i] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        int[] numbers1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int product = 1;
        for (int i = 1; i < (numbers1.length - 1); i++) {
            System.out.print(numbers1[i]);
            product = product * numbers1[i];
        }
        System.out.println();
        System.out.println(product == 40320 ? "Произведение верное" : "Произведение неверное");
        System.out.println("1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 = " + product);
        System.out.print(numbers1[0] + " ");
        System.out.println(numbers1[9]);

        System.out.println("\n3. Удаление элементов массива");
        float[] numbers2 = {0, .99f, .1f, .2f, .25f, .3f, .369f, .411f, .4f, .5f, .59f, .62f, .7f, .8f, .9f};
        float[] numbers4 = numbers2;
        int averageNumber = (numbers2.length / 2);
        int zeroCount = 0;

        for (int i = 0; i < numbers2.length; i++) {
            System.out.printf("%.3f", numbers2[i]);
            System.out.printf("%s", " ");
            if (i == 7) {
                System.out.println();
            }
        }
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] > numbers2[averageNumber]) {
                numbers4[i] = 0;
                zeroCount++;
            }
        }
        System.out.println();
        for (int i = 0; i < numbers4.length; i++) {
            System.out.printf("%.3f", numbers4[i]);
            System.out.printf("%s", " ");
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Количество обнуленных ячеек: " + zeroCount);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] letters = new char[26];
        int j = 0;
        for (char i = 'A'; i <= 'Z'; i++, j++) {
            letters[j] = i;
        }

        int k = letters.length - 1;
        for (int i = letters.length - 1; i >= 0; i--) {
            if (i <= k) {
                System.out.println();
                k--;
                i = letters.length - 1;
            }
            System.out.print(letters[i] + " ");
        }

        System.out.println("\n\n5. Генерация уникальных чисел");
        int[] randomNums = new int[30];
        int lastNum = randomNums.length - 1;
        int count = 1;
        int i = 0;
        while (i <= lastNum) {
            int randomN = (int) (Math.random() * 40 + 60);
            randomNums[i] = randomN;
            if (i != 0) {
                while (count <= i) {
                    if (randomNums[i] == randomNums[i - count]) {
                        randomN = (int) (Math.random() * 40 + 60);
                        randomNums[i] = randomN;
                        count = 1;
                    } else {
                        count++;
                    }
                }
            }
            i++;
            count = 1;
        }
        int temp1;
        for (i = randomNums.length - 1; i >= 0; i--) {
            for (j = 0; j < i; j++) {
                if (randomNums[j] < randomNums[j + 1]) {
                    temp1 = randomNums[j];
                    randomNums[j] = randomNums[j + 1];
                    randomNums[j + 1] = temp1;
                }
            } System.out.print(randomNums[i] + " ");
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] stringArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int countArr = 0;
        boolean symbol = false;
        for (int l = 0; l < stringArr.length; l++) {
            if (stringArr[l].isBlank() == (symbol)) {
                countArr++;
            }
        }
        String[] stringArrCopy = new String [countArr];
        System.arraycopy(stringArr, 1, stringArrCopy, 0, 1);
        System.arraycopy(stringArr, 3, stringArrCopy, 1, 3);
        System.arraycopy(stringArr, 7, stringArrCopy, 4, 3);

        for (int g = 0; g < stringArr.length; g++) {
            System.out.print(stringArr[g]);
        }
        System.out.println();
        for (int h = 0; h < stringArrCopy.length; h++) {
            System.out.print(stringArrCopy[h]);
        }
        System.out.println();
    }
}


