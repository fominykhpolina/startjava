package com.startjava.lesson_2_3_4.array;

import java.util.Random;
import java.util.Arrays;

public class ArrayTheme {
        public static void arrayPrint(int[] numbers){
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]);
            }
        }
            public static void main(String[] args) {
                System.out.println("\n1. Реверс значений массива");
                int[] numbers = {1, 3, 4, 7, 5, 2, 6};
                int length = numbers.length;
                arrayPrint(numbers);
                System.out.println();

                for (int i = 0; i < length / 2; i++) {
                    int temp;
                    temp = numbers[length - i - 1];
                    numbers[length - i - 1] = numbers[i];
                    numbers[i] = temp;
                }
                arrayPrint(numbers);

                System.out.println("\n\n2. Вывод произведения элементов массива");
                int[] arrayProduct = new int[10];
                for (int i = 1; i < 10; i++) {
                    arrayProduct[i] = i;
                }
                length = arrayProduct.length;
                int product = 1;
                for (int i = 1; i < (length - 1); i++) {
                    product *= arrayProduct[i];
                }

                for (int i = 1; i <= length - 1; i++) {
                    if (i != 9) {
                        System.out.print(arrayProduct[i] + " * ");
                    } else {
                        System.out.println(arrayProduct[i] + " = " + product);
                    }
                }

                System.out.println("\n3. Удаление элементов массива");
                double[] randomNum = new double[15];
                length = randomNum.length;
                int averageNumber = (length / 2);
                int zeroCount = 0;

                for (int i = 0; i <= length - 1; i++) {
                    randomNum[i] = Math.random();
                }
                System.out.println("Исходный массив: ");
                for (int i = 0; i < length; i++) {
                    System.out.printf("%.3f", randomNum[i]);
                    System.out.printf("%s", " ");
                    if (i == 7) {
                        System.out.println();
                    }
                }
                for (int i = 0; i < length; i++) {
                    if (randomNum[i] > randomNum[averageNumber]) {
                        randomNum[i] = 0;
                        zeroCount++;
                    }
                }
                System.out.println();
                System.out.println("Измененный массив: ");
                for (int i = 0; i < length; i++) {
                    System.out.printf("%.3f", randomNum[i]);
                    System.out.printf("%s", " ");
                    if (i == 7) {
                        System.out.println();
                    }
                }
                System.out.println();
                System.out.println("Количество обнуленных ячеек: " + zeroCount);

                System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
                char[] letters = new char[26];
                length = letters.length;
                int j = 0;
                for (char i = 'A'; i <= 'Z'; i++, j++) {
                    letters[j] = i;
                }

                int k = length - 1;
                for (int i = length - 1; i >= 0; i--) {
                    if (i <= k) {
                        System.out.println();
                        k--;
                        i = length - 1;
                    }
                    System.out.print(letters[i] + " ");
                }

                System.out.println("\n\n5. Генерация уникальных чисел");
                int[] randomNums = new int[30];
                length = randomNums.length;
                int lastNum = length - 1;
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
                for (i = length - 1; i >= 0; i--) {
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
                length = stringArr.length;
                int countArr = 0;
                boolean symbol = false;
                for (int l = 0; l < length; l++) {
                    if (stringArr[l].isBlank() == (symbol)) {
                        countArr++;
                    }
                }
                String[] stringArrCopy = new String [countArr];
                int len = stringArrCopy.length;
                System.arraycopy(stringArr, 1, stringArrCopy, 0, 1);
                System.arraycopy(stringArr, 3, stringArrCopy, 1, 3);
                System.arraycopy(stringArr, 7, stringArrCopy, 4, 3);

                for (int g = 0; g < length; g++) {
                    System.out.print(stringArr[g]);
                }
                System.out.println();
                for (int h = 0; h < len; h++) {
                    System.out.print(stringArrCopy[h]);
                }
                System.out.println();
            }
        }



