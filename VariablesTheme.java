public class VariablesTheme {
	public static void main(String[] args){

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

		int x = 100;
		int y = 200;
		int sum = x + y;
		int discount = sum * 11 / 100;
		int sumDiscount = sum - discount;

		System.out.println("Размер скидки: " + discount + " рублей");
		System.out.println("Общая стоимость со скидкой: " + sumDiscount + " рублей");


		System.out.println("\n3. Вывод на консоль слова JAVA");

		System.out.println(
		"\n   J    a  v     v  a " + 
		"\n   J   a a  v   v  a a " +                                                
		"\nJ  J  aaaaa  V V  aaaaa" +                                                
		"\n JJ  a     a  V  a     a");
		
		System.out.println("\n4. Отображение min и max значений числовых типов данных");

		byte ch = 127;
		byte ch1 = ch;
		byte inc = ++ch;
		byte dec = --ch;
		dec--;

		System.out.println(ch1);
		System.out.println(inc);
		System.out.println(dec);

		short ch2 = 32767;
		short ch3 = ch2;
		short inc1 = ++ch2;
		short dec1 = --ch2;
		dec1--;

		System.out.println(ch3);
		System.out.println(inc1);
		System.out.println(dec1);

		int ch4 = 2147483647;
		int ch5 = ch4;
		int inc2 = ++ch4;
		int dec2= --ch4;
		dec2--;

		System.out.println(ch5);
		System.out.println(inc2);
		System.out.println(dec2);

		long ch6 = 9223372036854775807L;
		long ch7 = ch6;
		long inc3 = ++ch6;
		long dec3 = --ch6;
		dec3--;

		System.out.println(ch7);
		System.out.println(inc3);
		System.out.println(dec3);

		System.out.println("\n5. Перестановка значений переменных");
		System.out.println("Способ перестановки с помощью третьей переменной:");
		int s = 1;
		int p = 2;
		System.out.println("Исходное значение переменной s: " + s);
		System.out.println("Исходное значение переменной p: " + p);
		int t = s;
		s = p;
		p = t;
		System.out.println("Новое значение переменной s: " + s);
		System.out.println("Новое значение переменной p: " + p);
		
		System.out.println("Способ перестановки с помощью арифметических действий:");
		System.out.println("Исходное значение переменной s: " + s);
		System.out.println("Исходное значение переменной p: " + p);
		s = s + p;
		p = s - p;
		s = s - p;
		System.out.println("Новое значение переменной s: " + s);
		System.out.println("Новое значение переменной p: " + p);

		System.out.println("Способ перестановки с помощью побитовых операций:");
		System.out.println("Исходное значение переменной s: " + s);
		System.out.println("Исходное значение переменной p: " + p);
		s = s^p;
        p = s^p;
        s = s^p;
        System.out.println("Новое значение переменной s: " + s);
		System.out.println("Новое значение переменной p: " + p);

		System.out.println("\n6. Вывод символов и их кодов");
		char q = 35;
		char w = 38;
		char e = 64;
		char r = 94;
		char i = 95;

		System.out.println("35 " + q);
		System.out.println("38 " + w);
		System.out.println("64 " + e);
		System.out.println("94 " + r);
		System.out.println("95 " + i);


		System.out.println("\n7. Произведение и сумма цифр числа");
		int n = 345;
		int a = n / 100;
		int b = n / 10 % 10;
		int c = n % 10;
		int summa = a + b + c;
		int proisv = a * b * c;

		System.out.println("Сумма цифр числа n = " + summa);
		System.out.println("Произведение цифр числа n = " + proisv);

		System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
		char s1 = '/';
		char s2 = '\\';
		char s3 = ' ';
		char s4 = '_';
		char s5 = '(';
		char s6 = ')';

		System.out.print(s3);
		System.out.print(s3);
		System.out.print(s3);
		System.out.print(s3);
		System.out.print(s1);
		System.out.println(s2);
		System.out.print(s3);
		System.out.print(s3);
		System.out.print(s3);
		System.out.print(s1);
		System.out.print(s3);
		System.out.print(s3);
		System.out.println(s2);
		System.out.print(s3);
		System.out.print(s3);
		System.out.print(s1);
		System.out.print(s4);
		System.out.print(s5);
		System.out.print(s3);
		System.out.print(s6);
		System.out.println(s2);
		System.out.print(s3);
		System.out.print(s1);
		System.out.print(s3);
		System.out.print(s3);
		System.out.print(s3);
		System.out.print(s3);
		System.out.print(s3);
		System.out.print(s3);
		System.out.println(s2);
		System.out.print(s1);
		System.out.print(s4);
		System.out.print(s4);
		System.out.print(s4);
		System.out.print(s4);
		System.out.print(s1);
		System.out.print(s2);
		System.out.print(s4);
		System.out.print(s4);
		System.out.println(s2);

		System.out.println("\n9. Отображение количества сотен, десятков и единиц числа");
		int chislo = 123;
		int sotni = chislo / 100;
		int des = chislo / 10 % 10;
		int edin = chislo % 10;
		System.out.println("Число 123 содержит:");
		System.out.println(sotni + " сотен");
		System.out.println(des + " десятков");
		System.out.println(edin + " единиц");

		System.out.println("\n10. Преобразование секунд");
		int sec = 86399;
		int hour = sec / 3600; 
		int hours = hour * 3600; 
		int min = sec - hours; 
		int minute = min / 60; 
		int mins = minute * 60; 
		int secunda = min - mins;
		System.out.print(hour + ":");
		System.out.print(minute + ":");
		System.out.println(secunda);
	   
	}
}