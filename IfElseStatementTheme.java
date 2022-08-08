public class IfElseStatementTheme {
    public static void main(String[] args) {

        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 21;
        if(age > 20) {
            System.out.println("Совершеннолетний человек");
        } else {
            System.out.println("Несовершеннолетний человек");
        }
        boolean male = true;
        if(male = false) {
            System.out.println("Женский пол");
        }
        double height = 1.80;
        if(height < 1.80) {
            System.out.println("Рост ниже среднего");
        } else {
            System.out.println("Рост выше среднего");
        }
        char firstLetterName = "Sasha".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Имя начинается с M");
        } else if(firstLetterName == 'I') {
            System.out.println("Имя начинается с I");
        } else {
            System.out.println("Имя начинается на букву S");
        }

        System.out.println("\n2.Поиск max и min числа");
        int num1 = 11;
        int num2 = 18;
        if(num1 < num2) {
            System.out.println(num1 + " - минимальное число");
            System.out.println(num2 + " - максимальное число");
        } else if(num2 < num1) {
            System.out.println(num1 + " - максимальное число");
            System.out.println(num2 + " - минимальное число");
        } else {
            System.out.println("Числа равны");
        }
        
        System.out.println("\n3.Работа с числом");
        int num3 = 5;
        System.out.println("Исходное число: " + num3);
        if(num3 == 0){
             System.out.println("число равно 0");
        } else if(num3 % 2 == 0) {
            System.out.println(num3 + " - число четное");
        } else if (num3 % 2 != 0){
            System.out.println(num3 + " - число нечетное");
        } if(num3 < 0) {
            System.out.println(num3 + " - число отрицательное");
        } else {
            System.out.println(num3 + " - число положительное");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int num4 = 235;
        int num5 = 245;
        System.out.print("Исходные числа: " + num4);
        System.out.println(" " + num5);
        if((num4 / 100) == (num5 / 100)) {
            System.out.println("Одинаковые цифры " + (num4 / 100) + " в разряде сотни");
        } else if((num4 / 10 % 10) == (num5 / 10 % 10)) {
            System.out.println("Одинаковые цифры " + (num4 / 10 % 10) + " в разряде десятки");
        } else if((num4 % 10) == (num5 % 10)) {
            System.out.println("Одинаковые цифры " + (num4 % 10) + " в разряде единицы");
        }

        System.out.println("\n5.Определение буквы, числа или символа по их коду");
        char symbol = '\u0057';
        if(symbol >= 48 && symbol <= 57) {
            System.out.println("Число: " + symbol);
        } else if(symbol >= 65 && symbol <= 90) {
            System.out.println("Буква большая или маленькая: " + symbol);
        } else if(symbol >= 97 && symbol <= 122) {
            System.out.println("Буква большая или маленькая: " + symbol);
        } else {
            System.out.println("Не буква и не число: " + symbol);
        }

        System.out.println("\n6.Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        int depositProcent_5 = deposit * 5 / 100;
        int depositProcent_7 = deposit * 7 / 100;
        int depositProcent_10 = deposit * 10 / 100;
        System.out.println("Сумма вклада: " + deposit);
        if(deposit < 100000) {
            deposit = deposit + depositProcent_5;
            System.out.println("Начисленный процент: 5%");
            System.out.println("Итоговая сумма с %: " + deposit);
        } else if (deposit > 100000 && deposit < 300000) {
            deposit = deposit + depositProcent_7;
            System.out.println("Начисленный процент: 7%");
            System.out.println("Итоговая сумма с %: " + deposit);
        } else {
            deposit = deposit + depositProcent_10;
            System.out.println("Начисленный процент: 10%");
            System.out.println("Итоговая сумма с %: " + deposit);
        }
        
        System.out.println("\n7.Определение оценки по предметам");
        int history = 59;
        int programming = 91;
        int mark1 = 0;
        int mark2 = 0;
        if(history <= 60){
            mark1 = 2;
            System.out.println(mark1 + " - история");
        } else if(history > 60 && history <= 73) {
            mark1 = 3;
            System.out.println(mark1 + " - история");
        } else if(history > 73 && history <= 91) {
            mark1 = 4;
            System.out.println(mark1 + " - история");
        } else {
            mark1 = 5;
            System.out.println(mark1 + " - история");
        }
        if(programming <= 60) {
            mark2 = 2;
            System.out.println(mark2 + " - программирование");
        } else if(programming > 60 && programming <= 73) {
            mark2 = 3;
            System.out.println(mark2 + " - программирование");
        } else if(programming > 73 && programming <= 91) {
            mark2 = 4;
            System.out.println(mark2 + " - программирование");
        } else {
            mark2 = 5;
            System.out.println(mark2 + " - программирование");
        }
        int averageProcent = (programming + history) / 2;
        System.out.println("Средний процент по предметам - " + averageProcent);
        int averageMark = (mark1 + mark2) / 2;
        System.out.println("Средняя оценка по предметам - " + averageMark);

        System.out.println("\n8.Расчет прибыли");
        int rentPrice = 5000;
        int saleProduct = 13000;
        int costPrice = 9000;
        int yearProfit = 12 * (saleProduct - costPrice - rentPrice);
        if(yearProfit < 0) {
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
        if(numberOfHundreds > hundredsInBank) {
            numberOfHundreds = hundredsInBank;
        }
        numberOfTens = (amount - numberOfHundreds * 100) / 10;
        if(numberOfTens > tensInBank) {
            numberOfTens = tensInBank;
        }
        numberOfUnits = (amount - (numberOfHundreds * 100 + numberOfTens * 10));
        if(numberOfUnits > unitsInBank) {
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
        if(initialAmount == amount) {
            System.out.println("Посчитанная исходная сумма: " + initialAmount);
        } else {
            System.out.println("Неверная сумма");
        }


    }
}