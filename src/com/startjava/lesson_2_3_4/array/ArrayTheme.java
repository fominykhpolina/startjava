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
        printLetters();

        System.out.println("\n\n5. Генерация уникальных чисел");
        generateNums();

        System.out.println("\n\n6. Сдвиг элементов массива");
        changeLetters();
    }
    public static void reverseNums() {
        int[] nums = {1, 3, 4, 7, 5, 2, 6};
        int length = nums.length;
        printNums(nums);
        System.out.println();
        for (int i = 0; i < length; i++) {
            int temp = nums[--length];
            nums[length] = nums[i];
            nums[i] = temp;
        }
        printNums(nums);
    }

    public static void multiplyNums() {
        int[] arrayMultipliers = new int[10];
        int length = arrayMultipliers.length;
        for (int i = 1; i < length; i++) {
            arrayMultipliers[i] = i;
        }
        int product = 1;
        for (int i = 1; i < (length - 1); i++) {
            product *= arrayMultipliers[i];
            System.out.print((arrayMultipliers[i]) + (i != (length -2) ? (" * ") : (" = " + product)));
        }
    }

    public static void deleteNums() {
        double[] randomNums = new double[15];
        int length = randomNums.length;
        int countZeros = 0;
        for (int i = 0; i < length; i++) {
            randomNums[i] = Math.random();
        }
        System.out.println("Исходный массив: ");
        print(randomNums);
        for (int i = 0; i < length; i++) {
            double averageNum = randomNums[length / 2];
            if (randomNums[i] > averageNum) {
                randomNums[i] = 0;
                countZeros++;
            }
        }
        System.out.println("\nИзмененный массив: ");
        print(randomNums);
        System.out.println("\nКоличество обнуленных ячеек: " + countZeros);
    }

    public static void printLetters() {
        char[] letters = new char[26];
        int length = letters.length;
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
    }

    public static void generateNums() {
        int[] randomNums = new int[30];
        int length = randomNums.length;
        int lastNum = length - 1;
        int count = 1;
        int i = 0;
        while (i <= lastNum) {
            int randomNum = (int) (Math.random() * 40 + 60);
            randomNums[i] = randomNum;
            if (i != 0) {
                while (count <= i) {
                    if (randomNums[i] == randomNums[i - count]) {
                        randomNum = (int) (Math.random() * 40 + 60);
                        randomNums[i] = randomNum;
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
            for (int j = 0; j < i; j++) {
                if (randomNums[j] < randomNums[j + 1]) {
                    temp1 = randomNums[j];
                    randomNums[j] = randomNums[j + 1];
                    randomNums[j + 1] = temp1;
                }
            } System.out.print(randomNums[i] + " ");
        }
    }

    public static void changeLetters() {
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