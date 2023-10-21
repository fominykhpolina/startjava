package com.startjava.lesson_1.base;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Создание переменных и вывод их значений на консоль");
        byte screen = 13;
        short year = 2020;
        int memorySize = 8;
        long systemFirmware = 6723;
        float macOS = 11.2f;
        double hddSize = 245.11d;
        char number = 'F';
        boolean mac = true;
        System.out.println("Диагональ экрана: " + screen);
        System.out.println("Год выпуска: " + year);
        System.out.println("Объем памяти: " + memorySize);
        System.out.println("Системная прошивка: " + systemFirmware);
        System.out.println("Версия MacOS: " + macOS);
        System.out.println("Объем жесткого диска: " + hddSize);
        System.out.println("Первая буква серийного номера: " + number);
        System.out.println("Mac?: " + mac);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int firstPrice = 100;
        int secondPrice = 200;
        int sum = firstPrice + secondPrice;
        int discount = sum * 11 / 100;
        int discountPrice = sum - discount;
        System.out.println("Размер скидки: " + discount + " рублей");
        System.out.println("Общая стоимость со скидкой: " + discountPrice + " рублей");

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("\n   J    a  v     v  a " + 
                "\n   J   a a  v   v  a a " +                                                
                "\nJ  J  aaaaa  V V  aaaaa" +                                                
                "\n JJ  a     a  V  a     a");
        
        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte num = 127;
        byte num1 = num;
        System.out.println(num1);
        System.out.println(++num);
        System.out.println(--num);
        short num2 = 32767;
        short num3 = num2;
        System.out.println(num3);
        System.out.println(++num2);
        System.out.println(--num2);
        int num4 = 2147483647;
        int num5 = num4;
        System.out.println(num5);
        System.out.println(++num4);
        System.out.println(--num4);
        long num6 = 9223372036854775807L;
        long num7 = num6;
        System.out.println(num7);
        System.out.println(++num6);
        System.out.println(--num6);

        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("Способ перестановки с помощью третьей переменной:");
        int digit1 = 1;
        int digit2 = 2;
        System.out.println("Исходное значение переменной digit1: " + digit1);
        System.out.println("Исходное значение переменной digit2: " + digit2);
        int t = digit1;
        digit1 = digit2;
        digit2 = t;
        System.out.println("Новое значение переменной digit1: " + digit1);
        System.out.println("Новое значение переменной digit2: " + digit2);
        System.out.println("Способ перестановки с помощью арифметических действий:");
        System.out.println("Исходное значение переменной digit1: " + digit1);
        System.out.println("Исходное значение переменной digit2: " + digit2);
        digit1 += digit2;
        digit2 = digit1 - digit2;
        digit1 -= digit2;
        System.out.println("Новое значение переменной digit1: " + digit1);
        System.out.println("Новое значение переменной digit2: " + digit2);
        System.out.println("Способ перестановки с помощью побитовых операций:");
        System.out.println("Исходное значение переменной digit1: " + digit1);
        System.out.println("Исходное значение переменной digit2: " + digit2);
        digit1 = digit1^digit2;
        digit2 = digit1^digit2;
        digit1 = digit1^digit2;
        System.out.println("Новое значение переменной digit1: " + digit1);
        System.out.println("Новое значение переменной digit2: " + digit2);

        System.out.println("\n6. Вывод символов и их кодов");
        int numberOfSymbol1 = 35;
        int numberOfSymbol2 = 38;
        int numberOfSymbol3 = 64;
        int numberOfSymbol4 = 94;
        int numberOfSymbol5 = 95;
        char symbol1 = 35;
        char symbol2 = 38;
        char symbol3 = 64;
        char symbol4 = 94;
        char symbol5 = 95;
        System.out.println(numberOfSymbol1 + " - " + symbol1);
        System.out.println(numberOfSymbol2 + " - " + symbol2);
        System.out.println(numberOfSymbol3 + " - " + symbol3);
        System.out.println(numberOfSymbol4 + " - " + symbol4);
        System.out.println(numberOfSymbol5 + " - " + symbol5);

        System.out.println("\n7. Произведение и сумма цифр числа");
        int count = 345;
        int digit3 = count / 100;
        int digit4 = count / 10 % 10;
        int digit5 = count % 10;
        int amount = digit3 + digit4 + digit5;
        int product = digit3 * digit4 * digit5;
        System.out.println("Сумма цифр числа n = " + amount);
        System.out.println("Произведение цифр числа n = " + product);

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char s1 = '/';
        char s2 = '\\';
        char s3 = ' ';
        char s4 = '_';
        char s5 = '(';
        char s6 = ')';
        System.out.println("" + s3 + s3 + s3 + s3 + s1 + s2);
        System.out.println("" + s3 + s3 + s3 + s1 + s3 + s3 + s2);
        System.out.println("" + s3 + s3 + s1 + s4 + s5 + s3 + s6 + s2);
        System.out.println("" + s3 + s1 + s3 + s3 + s3 + s3 + s3 + s3 + s2);
        System.out.println("" + s1 + s4 + s4 + s4 + s4 + s1 + s2 + s4 + s4 + s2);
    
        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа");
        int number1 = 123;
        int hundreds = number1 / 100;
        int dozens = number1 / 10 % 10;
        int units = number1 % 10;
        System.out.println("Число 123 содержит:");
        System.out.println(hundreds + " сотен");
        System.out.println(dozens + " десятков");
        System.out.println(units + " единиц");

        System.out.println("\n10. Преобразование секунд");
        int time = 81234;
        int hours = time / 3600;
        int minutes = time % 3600 / 60; 
        int seconds = time % 60;
        System.out.print(hours + ":");
        System.out.print(minutes + ":");
        System.out.println(seconds);
    }
}