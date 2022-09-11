public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int num1 = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (num1 % 2 == 0) {
                sumEven += num1;
            } else {
                sumOdd += num1;
            }
            num1++;
        } while(num1 <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven);
        System.out.println("В промежутке [-10, 21] сумма нечетных чисел = " + sumOdd);
        
        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num2 = 10;
        int num3 = 5;
        int num4 = -1;
        int maxNum;
        int minNum;
        if (num2 > num3) {
            maxNum = num2;
            minNum = num3;
        } else {
            maxNum = num3;
            minNum = num2;
        }
        if (maxNum < num4) {
            maxNum = num4;
        } 
        if (minNum > num4) {
            minNum = num4;
        }
        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int num5 = 1234;
        int sumDigits = 0;
        int digit;
        while (num5 > 0) {
            digit = num5 % 10;
            System.out.print(digit);
            num5 /= 10;
            sumDigits += digit; 
        } 
        System.out.println(" " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int digitCount = 0;
        for (int i = 1; i < 24; i += 2) {
            digitCount++;
            if (digitCount == 5) {
                digitCount = 0;
                System.out.printf("%5d%n", i);
            } else {
                System.out.printf("%5s", i);
            } 
        } 
        for (digitCount++; digitCount <= 5; digitCount++) {
            System.out.printf("%5s", "0");
        }

        System.out.println("\n5. Проверка количества единиц на четность");
        int num7 = 3141591;
        int countOnes = 0;
        while (num7 > 0) {
            int digit1 = num7 % 10;
            if (digit1 == 1) {
                countOnes++;
            }
            num7 /= 10;
         }
         if (countOnes % 2 == 0) {
            System.out.println("число 3141591 содержит" + " " + countOnes + " " + "- четное количество единиц");
         } else {
            System.out.println("число 3141591 содержит" + " " + countOnes + " " + "- нечетное количество единиц");
         }
        
        System.out.println("\n6. Отображение фигур в консоли");
        for (int countLines = 0; countLines < 5; countLines++) { 
            for (int countChars = 0; countChars < 10; countChars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int countLine1 = 1;
        boolean counter = true;
        while (counter) {
            System.out.print("# ");
            if (countLine1 == 5 || countLine1 == 9 || countLine1 == 12 || countLine1 == 14) {
                System.out.println();
            } 
            if(countLine1 == 15) {
                break;
            }
            countLine1++;
        }
        System.out.println();
        int countLine2 = 1;
        do {
            System.out.print("$ ");
            if (countLine2 == 1 || countLine2 == 3 || countLine2 == 6 || countLine2 == 8) {
                System.out.println();
            }
            countLine2++;
        } while(countLine2 <= 9);

        System.out.println("\n7. Отображение ASCII-символов");
        char symbol = 33;
        System.out.printf("%5s %3s%n", "dec", "char");
        for (; symbol <= 122; symbol++) {
            if (symbol <= 47 && symbol % 2 != 0) {
                System.out.printf("%5s %4s%n", (int) symbol, symbol);
            } else if (symbol > 96 && symbol % 2 == 0) {
                System.out.printf("%5s %4s%n", (int) symbol, symbol);
            }   
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num9 = 1234321;
        int copyNum9 = num9;
        int reverseNumber = 0;
        int lastDigit; 
        while (num9 > 0) {
            lastDigit = num9 % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            num9 /= 10;
        }
        if (reverseNumber != copyNum9) {
            System.out.println("Число " + copyNum9 + " не является палиндромом");
        } else {
            System.out.println("Число " + copyNum9 + " является палиндромом");
        }
            
        System.out.println("\n9. Определение, является ли число счастливым");
        int sumDEF = 0;
        int sumABC = 0;
        int numberCount1 = 0;
        int digitCount2 = 0;
        for (int num10 = 700348; num10 > 0; num10 /= 10) {
            numberCount1 = num10 % 10;
            System.out.print(numberCount1);
            digitCount2++;
            if(digitCount2 >= 1 && digitCount2 <= 3) {
                sumDEF += numberCount1;
            } else {
                sumABC += numberCount1;
            }
        } 
        if (sumDEF == sumABC) {
                System.out.println(" " + "- число счастливое");
            } else {
                System.out.println(" " + "- число несчастливое");
            }
        System.out.println("Сумма цифр равна: " + sumDEF);
        System.out.println("Сумма цифр равна: " + sumABC);
        
        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 1; i < 10; i++) {
            for (int k = 1; k < 10; k++) {
                System.out.printf("%4s", (k * i) + "  ");
                if (k == 1) {
                    System.out.print("| ");
                } 
            } 
            System.out.println("");
              if (i == 1) {
                    System.out.println("------------------------------------");
                }
            }
    }
}





