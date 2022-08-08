public class IfElseStatementTheme {

    public static void main(String[] args) {

        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 21;
        if (age > 20) {
            System.out.println("Совершеннолетний человек");
        } else {
            System.out.println("Несовершеннолетний человек");
        }
        boolean male = true;
        if (male = false) {
            System.out.println("Женский пол");
        }
        double height = 1.80;
        if (height < 1.80) {
            System.out.println("Рост ниже среднего");
        } else {
            System.out.println("Рост выше среднего");
        }
        char firstLetterName = "Sasha".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Имя начинается с M");
        } else if (firstLetterName == 'I') {
            System.out.println("Имя начинается с I");
        } else {
            System.out.println("Имя начинается на букву S");
        }

        System.out.println("\n2.Поиск max и min числа");
        int num1 = 11;
        int num2 = 18;
        if (num1 < num2) {
            System.out.println(num1 + " - минимальное число");
            System.out.println(num2 + " - максимальное число");
        } else if(num2 < num1) {
            System.out.println(num1 + " - максимальное число");
            System.out.println(num2 + " - минимальное число");
        } else {
            System.out.println("Числа равны");
        }
        
        System.out.println("\n3.Работа с числом");
        int num3 = 7;
        System.out.println("Исходное число: " + num3);
        if (num3 != 0) {
            if (num3 % 2 == 0) {
            System.out.println(num3 + " - число четное");
            } else if (num3 % 2 != 0) {
                System.out.println(num3 + " - число нечетное");
            } if (num3 < 0) {
                System.out.println(num3 + " - число отрицательное");
            } else {
                System.out.println(num3 + " - число положительное");
            }
        } else {
            System.out.println("Число равно 0");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int num4 = 235;
        int num5 = 245;
        System.out.print("Исходные числа: " + num4);
        System.out.println(" " + num5);
        if ((num4 / 100) == (num5 / 100)) {
            System.out.println("Одинаковые цифры " + (num4 / 100) + " в разряде сотни");
        } else if ((num4 / 10 % 10) == (num5 / 10 % 10)) {
            System.out.println("Одинаковые цифры " + (num4 / 10 % 10) + " в разряде десятки");
        } else if ((num4 % 10) == (num5 % 10)) {
            System.out.println("Одинаковые цифры " + (num4 % 10) + " в разряде единицы");
        }

        System.out.println("\n5.Определение буквы, числа или символа по их коду");
        char symbol = '\u0057';
        if (symbol >= '0' && symbol <= '9') {
            System.out.println("Число: " + symbol);
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Буква большая: " + symbol);
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Буква маленькая: " + symbol);
        } else {
            System.out.println("Не буква и не число: " + symbol);
        }

        System.out.println("\n6.Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        int percent = 0;
        if (deposit < 100000) {
            percent = 5;
        } else if (deposit >= 100000 && deposit <= 300000) {
            percent = 7;
        } else {
            percent = 10;
        } 
         int depositPercent = deposit * percent / 100;
         int depositAmount = deposit + depositPercent;
         System.out.println("Сумма вклада: " + deposit);
         System.out.println("Начисленный процент: " + depositPercent);
         System.out.println("Итоговая сумма с %: " + depositAmount);

        System.out.println("\n7.Определение оценки по предметам");
        int percentHistory = 59;
        int percentProgramming = 91;
        int markHistory = 0;
        int markProgramming = 0;
        if (percentHistory <= 60) {
            markHistory = 2;
        } else if (percentHistory > 60 && percentHistory <= 73) {
            markHistory = 3;
        } else if (percentHistory > 73 && percentHistory <= 91) {
            markHistory = 4;
        } else {
            markHistory = 5;
        }
        if (percentProgramming <= 60) {
            markProgramming = 2;
        } else if (percentProgramming > 60 && percentProgramming <= 73) {
            markProgramming = 3;
        } else if (percentProgramming > 73 && percentProgramming <= 91) {
            markProgramming = 4;
        } else {
            markProgramming = 5;
        }
        int averageMark = (markHistory + markProgramming) / 2;
        int averageProcent = (percentHistory + percentProgramming) / 2;
        System.out.println(markHistory + " - история");
        System.out.println(markProgramming + " - программирование");
        System.out.println("Средний процент по предметам - " + averageProcent);
        System.out.println("Средняя оценка по предметам - " + averageMark);

        System.out.println("\n8.Расчет прибыли");
        int rentPrice = 5000;
        int saleProduct = 13000;
        int costPrice = 9000;
        int yearProfit = 12 * (saleProduct - costPrice - rentPrice);
        if (yearProfit < 0) {
            System.out.println("прибыль за год: " + yearProfit);
        } else {
            System.out.println("прибыль за год: +" + yearProfit);
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int amount = 567;
        int units = 1;
        int tens = 10;
        int hundreds = 100;
        int numberOfUnits = amount % 10;
        int numberOfTens = amount / 10 % 10;
        int numberOfHundreds = amount / 100;
        int unitsInBank = 100;
        int tensInBank = 5;
        int hundredsInBank = 10;
        if (numberOfHundreds > hundredsInBank) {
            numberOfHundreds = hundredsInBank;
        }
        numberOfTens = (amount - numberOfHundreds * 100) / 10;
        if (numberOfTens > tensInBank) {
            numberOfTens = tensInBank;
        }
        numberOfUnits = (amount - (numberOfHundreds * 100 + numberOfTens * 10));
        if (numberOfUnits > unitsInBank) {
            System.out.println("Недостаточно средств");
        }
        int initialSumOfUnits = numberOfUnits;
        int initialSumOfTens = numberOfTens * 10;
        int initialSumOfHundreds = numberOfHundreds * 100;
        int initialAmount = initialSumOfUnits + initialSumOfTens + initialSumOfHundreds;
        System.out.println("Номиналы банкнот: " + units + " " +  tens + " " + hundreds);
        System.out.println("Требуемое количество банкнот " +  "номинал 1: " + numberOfUnits);
        System.out.println("Требуемое количество банкнот " +  "номинал 10: " + numberOfTens);
        System.out.println("Требуемое количество банкнот " +  "номинал 100: " + numberOfHundreds);
        if (initialAmount == amount) {
            System.out.println("Посчитанная исходная сумма: " + initialAmount);
        } else {
            System.out.println("Неверная сумма");
        }


    }
}