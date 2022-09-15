public class Calculator {

    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 7;
        int copyNumber2 = number2;
        char sign = '*';
        int result = 1;
        if (sign == '+') {
            result = number1 + number2;
        }
        if (sign == '-') {
            result = number1 - number2;
        }
        if (sign == '*') {
            result = number1 * number2;
        }
        if (sign == '/') {
            result = number1 / number2;
        }
        if (sign == '%') {
            result = number1 % number2;
        }
        if (sign == '^') {
            for(; copyNumber2 > 0; copyNumber2--) {
            result = result * number1;
            }
        }
        System.out.println(number1 + " " + sign + " " + number2 + " = " + result);

    }
}

