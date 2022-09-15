public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while(counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven);
        System.out.println("В промежутке [-10, 21] сумма нечетных чисел = " + sumOdd);
        
        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num2 = 10;
        int num3 = 5;
        int num4 = -1;
        int maxNum = num3;
        int minNum = num2;
        if (num2 > num3) {
            maxNum = num2;
        }
        if (num3 < num2) {
            minNum = num3;
        } 
        if (num4 > maxNum) {
            maxNum = num4;
        } 
        else if (num4 < minNum) {
            minNum = num4;
        }
        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num5 = 1234;
        int sumDigits = 0;
        while (num5 > 0) {
            int lastDigit = num5 % 10;
            System.out.print(lastDigit);
            num5 /= 10;
            sumDigits += lastDigit; 
        } 
        System.out.println(" " + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int countDigits = 0;
        for (int i = 1; i < 24; i += 2) {
             countDigits++;
             System.out.printf("%5s", i);
             if (countDigits == 5) {
                 countDigits = 0;
                 System.out.println();
             }
        }
        for (countDigits++; countDigits <= 5; countDigits++) {
            System.out.printf("%5s", "0");
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
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
        int countChars = 0;
        for (int i = 0; i < 50; i++) {
             countChars++;
             System.out.print("* ");
             if (countChars == 10) {
                 countChars = 0;
                 System.out.println();
             }
        }

        int countLine1 = 1;
        boolean counter1 = true;
        while (counter1) {
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

        System.out.println("\n\n7. Отображение ASCII-символов");
        System.out.printf("%5s %3s%n", "dec", "char");
        for (char symbol = 33; symbol <= 122; symbol++) {
            if (symbol <= 47 && symbol % 2 != 0) {
                System.out.printf("%5s %4s%n", (int) symbol, symbol);
            } else if (symbol > 96 && symbol % 2 == 0) {
                System.out.printf("%5s %4s%n", (int) symbol, symbol);
            }   
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int num9 = 1234321;
        int copyNum9 = num9;
        int reverseNum = 0;
        int lastDigit1; 
        while (num9 > 0) {
            lastDigit1 = num9 % 10;
            reverseNum = (reverseNum * 10) + lastDigit1;
            num9 /= 10;
        }
        if (reverseNum != copyNum9) {
            System.out.println("Число " + copyNum9 + " не является палиндромом");
        } else {
            System.out.println("Число " + copyNum9 + " является палиндромом");
        }
            
        System.out.println("\n9. Определение, является ли число счастливым");
        int sumDEF = 0;
        int sumABC = 0;
        int lastDigit2 = 0;
        int digitCount2 = 0;
        for (int num10 = 700348; num10 > 0; num10 /= 10) {
            lastDigit2 = num10 % 10;
            System.out.print(lastDigit2);
            digitCount2++;
            if(digitCount2 >= 1 && digitCount2 <= 3) {
                sumDEF += lastDigit2;
            } else {
                sumABC += lastDigit2;
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
        for (int j = 1; j < 10; j++) {
            for (int k = 1; k < 10; k++) {
                System.out.printf("%4s", (k * j) + "  ");
                if (k == 1) {
                    System.out.print("| ");
                } 
            } 
            System.out.println();
            if (j == 1) {
                System.out.println("------------------------------------");
            }
        }

    }
}





