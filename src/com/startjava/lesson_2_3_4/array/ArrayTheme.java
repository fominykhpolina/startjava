package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {
    public static void reverseNum() {
        int[] numbers = {1, 3, 4, 7, 5, 2, 6};
        int length = numbers.length;
        arrayPrint(numbers);
        System.out.println();
        for (int i = 0; i <= length - 1; i++) {
            length--;
            int temp = numbers[length];
            numbers[length] = numbers[i];
            numbers[i] = temp;
        }
        arrayPrint(numbers);
    }
    public static void arrayProduct() {
        int[] arrayNum = new int[10];
        int length = arrayNum.length;
        for (int i = 1; i < length; i++) {
            arrayNum[i] = i;
        }
        int product = 1;
        for (int i = 1; i < (length - 1); i++) {
            product *= arrayNum[i];
            System.out.print((i != (length -2)) ? (arrayNum[i] + " * ") : (arrayNum[i] + " = " + product));
        }
    }
    public static void arrayDeleted() {
        double[] randomNum = new double[15];
        int length = randomNum.length;
        int averageNumber = (length / 2);
        int countZeros = 0;
        for (int i = 0; i < length; i++) {
            randomNum[i] = Math.random();
        }
        System.out.println("Исходный массив: ");
        arrayPrint2(randomNum);
        for (int i = 0; i < length; i++) {
            if (randomNum[i] > randomNum[averageNumber]) {
                randomNum[i] = 0;
                countZeros++;
            }
        }
        System.out.println("\nИзмененный массив: ");
        arrayPrint2(randomNum);
        System.out.println("\nКоличество обнуленных ячеек: " + countZeros);
    }
    public static void printStairsArray() {
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
    public static void generationNums() {
        int[] randomNums = new int[30];
        int length = randomNums.length;
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
            for (int j = 0; j < i; j++) {
                if (randomNums[j] < randomNums[j + 1]) {
                    temp1 = randomNums[j];
                    randomNums[j] = randomNums[j + 1];
                    randomNums[j + 1] = temp1;
                }
            } System.out.print(randomNums[i] + " ");
        }
    }
    public static void changeArray() {
        String[] stringArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int length = stringArr.length;
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
        for (String g : stringArr) {
            System.out.print(g);
        }
        System.out.println();
        for (String h : stringArrCopy) {
            System.out.print(h);
        }
        System.out.println();
    }
    private static void arrayPrint(int[] numbers){
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i] + "]");
            }
        }
    }
    private static void arrayPrint2(double[] randomNum){
        for (int i = 0; i < randomNum.length; i++) {
            System.out.printf("%.3f ", randomNum[i]);
            if (i == 7) {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        reverseNum();

        System.out.println("\n\n2. Вывод произведения элементов массива");
        arrayProduct();

        System.out.println("\n\n3. Удаление элементов массива");
        arrayDeleted();

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        printStairsArray();

        System.out.println("\n\n5. Генерация уникальных чисел");
        generationNums();

        System.out.println("\n\n6. Сдвиг элементов массива");
        changeArray();
    }
}