package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        reverseNums();

        System.out.println("\n\n2. Вывод произведения элементов массива");
        multiplyNums();

        System.out.println("\n\n3. Удаление элементов массива");
        deleteNums();

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        printAlphabet();

        System.out.println("\n\n5. Генерация уникальных чисел");
        generateNums();

        System.out.println("\n\n6. Сдвиг элементов массива");
        changeLetters();
    }

    private static void reverseNums() {
        int[] nums = {1, 7, 4, 5, 2, 6, 3};
        int length = nums.length;
        System.out.print("До реверса: ");
        printNums(nums);
        System.out.println();
        for (int i = 0; i < length; i++) {
            int temp = nums[--length];
            nums[length] = nums[i];
            nums[i] = temp;
        }System.out.print("После реверса: ");
        printNums(nums);
    }

    private static void multiplyNums() {
        int[] multipliers = new int[10];
        int length = multipliers.length;
        for (int i = 1; i < length; i++) {
            multipliers[i] = i;
        }
        int product = 1;
        for (int i = 1; i < length - 1; i++) {
            product *= multipliers[i];
            System.out.print(multipliers[i] + (i != (length - 2) ? ("*") : (" = " + product)));
        }
    }

    private static void deleteNums() {
        double[] randomNums = new double[15];
        int length = randomNums.length;
        for (int i = 0; i < length; i++) {
            randomNums[i] = Math.random();
        }
        System.out.println("Исходный массив: ");
        print(randomNums);
        int countZeros = 0;
        double middleCellValue = randomNums[length / 2];
        for (int i = 0; i < length; i++) {
            if (randomNums[i] > middleCellValue) {
                randomNums[i] = 0;
                countZeros++;
            }
        }
        System.out.println("\nИзмененный массив: ");
        print(randomNums);
        System.out.println("\nКоличество обнуленных ячеек: " + countZeros);
    }

    private static void printAlphabet() {
        char[] alphabet = new char[26];
        int length = alphabet.length;
        for (char i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        int letters = length - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (i <= letters) {
                System.out.println();
                letters--;
                i = length - 1;
            }
            System.out.print(alphabet[i]);
        }
    }

    private static void generateNums() {
        int[] uniqueNums = new int[30];
        int length = uniqueNums.length - 1;
        int count = 1;
        for(int i = 0; i <= length; i++) {
            uniqueNums[i] = (int) (Math.random() * 40 + 60);
            if (i != 0) {
                for (; i >= count; ) {
                    if (uniqueNums[i] == uniqueNums[i - count]) {
                        uniqueNums[i] = (int) (Math.random() * 40 + 60);
                        count = 1;
                    } else {
                        count++;
                    }
                }
            }
            count = 1;
        }
        int temp1;
        for (int i = length - 1; i >= 0; i--) {
           for (int j = 0; j < i; j++) {
                if (uniqueNums[j] < uniqueNums[j + 1]) {
                    temp1 = uniqueNums[j];
                    uniqueNums[j] = uniqueNums[j + 1];
                    uniqueNums[j + 1] = temp1;
                }
           } System.out.print(uniqueNums[i] + " ");
        }
    }

    private static void changeLetters() {
        String[] stringArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int length = stringArr.length;
        int count = 0;
        boolean symbol = false;
        for (int l = 0; l < length; l++) {
            if (stringArr[l].isBlank() == (symbol)) {
                count++;
            }
        }
        String[] stringArrCopy = new String [count];
        int len = stringArrCopy.length;
        System.arraycopy(stringArr, 1, stringArrCopy, 0, 1);
        System.arraycopy(stringArr, 3, stringArrCopy, 1, 3);
        System.arraycopy(stringArr, 7, stringArrCopy, 4, 3);
        for (String g : stringArr) {
            System.out.print(g);
        }
        System.out.println();
        for (String h : stringArrCopy) {
            System.out.print(h);
        }
        System.out.println();
    }

    private static void printNums(int[] nums){
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.print(nums[i] + "]");
            }
        }
    }

    private static void print(double[] randomNums){
        for (int i = 0; i < randomNums.length; i++) {
            System.out.printf("%.3f ", randomNums[i]);
            if (i == 7) {
                System.out.println();
            }
        }
    }
}