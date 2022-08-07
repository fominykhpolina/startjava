public class IfElseStatementTheme {
    public static void main(String[] args) {

        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 21;
        if(age > 20) {
            System.out.println("Совершеннолетний человек");
        }else{
            System.out.println("Несовершеннолетний человек");
        }
        int male = 1;
        if(male != 0) {
            System.out.println("Женский пол");
        }
        double height = 1.80;
        if(height < 1.80) {
            System.out.println("Рост ниже среднего");
        }else{
            System.out.println("Рост выше среднего");
        }
        int nameFirstLetter = "Sasha".charAt(0);
        if(nameFirstLetter == 'M') {
            System.out.println("Имя начинается с M");
        }else if(nameFirstLetter == 'I') {
            System.out.println("Имя начинается с I");
        }else{
            System.out.println("Имя начинается на букву S");
        }
        System.out.println("\n2.Поиск max и min числа");
        int num1 = 11;
        int num2 = 18;
        if (num1 < num2) {
            System.out.println(num1 + " - минимальное число");
            System.out.println(num2 + " - максимальное число");
        }else if (num2 < num1) {
            System.out.println(num1 + " - максимальное число");
            System.out.println(num2 + " - минимальное число");
        }else{
            System.out.println("Числа равны");
        }
        
        System.out.println("\n3.Работа с числом");
        int number = 5;
        System.out.println("Исходное число: " + number);
        if(number == 0) {
            System.out.println("Число равно 0");
            System.exit(0);
        }
        if(number % 2 == 0) {
            System.out.println(number + " - число четное");
        }else{
            System.out.println(number + " - число нечетное");
        }
        if(number < 0) {
            System.out.println(number + " - число отрицательное");
        }else{
            System.out.println(number + " - число положительное");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int number1 = 235;
        int number2 = 245;
        System.out.print("Исходные числа: " + number1);
        System.out.println(" " + number2);
        if ((number1 / 100) == (number2 / 100)) {
            System.out.println("Одинаковые цифры " + (number1/100) + " в разряде сотни");
        }else if ((number1 / 10 % 10) == (number2 /10 % 10)) {
            System.out.println("Одинаковые цифры " + (number1/10%10) + " в разряде десятки");
        }else if ((number1 % 10) == (number2 % 10)) {
            System.out.println("Одинаковые цифры " + (number1%10) + " в разряде единицы");
        }

        System.out.println("\n5.Определение буквы, числа или символа по их коду");
        char symbol = '\u0057';
        if(symbol >= 48 && symbol <= 57) {
            System.out.println("Число: " + symbol);
        }else if(symbol >= 65) {
            System.out.println("Буква: " + symbol);
        }else if(symbol <= 90) {
            System.out.println("Буква: " + symbol);
        }else if(symbol >= 97) {
            System.out.println("Буква: " + symbol);
        }else if(symbol <= 122) {
            System.out.println("Буква: " + symbol);
        }else{
            System.out.println("Не буква и не число: " + symbol);
        }

        System.out.println("\n6.Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        System.out.println("Сумма вклада: " + deposit);
        if(deposit < 100000) {
            deposit = deposit + (deposit * 5/100);
            System.out.println("Начисленный процент: 5%");
            System.out.println("Итоговая сумма с %: " + deposit);
        }else if (deposit > 100000 && deposit < 300000) {
            deposit = deposit + (deposit * 7/100);
            System.out.println("Начисленный процент: 7%");
            System.out.println("Итоговая сумма с %: " + deposit);
        }else{
            deposit = deposit + (deposit * 10/100);
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
        }else if(history > 60 && history <= 73) {
            mark1 = 3;
            System.out.println(mark1 + " - история");
        }else if(history > 73 && history <= 91) {
            mark1 = 4;
            System.out.println(mark1 + " - история");
        }else{
            mark1 = 5;
            System.out.println(mark1 + " - история");
        }
        if(programming <= 60) {
            mark2 = 2;
            System.out.println(mark2 + " - программирование");
        }else if(programming > 60 && programming <= 73) {
            mark2 = 3;
            System.out.println(mark2 + " - программирование");
        }else if(programming > 73 && programming <= 91) {
            mark2 = 4;
            System.out.println(mark2 + " - программирование");
        }else{
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
        if (yearProfit < 0) {
            System.out.println("прибыль за год: " + yearProfit);
        }else{
            System.out.println("прибыль за год: +" + yearProfit);
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int amount = 567;
        int units = 1;
        int tens = 10;
        int hundreds = 100;
        int numberOfUnits = amount % 10;
        int numberOfHundreds = amount / 100;
        int unitsInBank = 100;
        int tensInBank = 5;
        int hundredsInBank = 10;
        if(numberOfHundreds > hundredsInBank) {
            numberOfHundreds = hundredsInBank;
        }
        numberOfTens = (amount - numberOfHundreds*100) / 10;
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
        }else{
            System.out.println("Неверная сумма");
        }
        




















    }
}