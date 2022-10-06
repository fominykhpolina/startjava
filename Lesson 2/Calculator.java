import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
        switch (sign) {
            case '+' :
                return num1 + num2;
            case '-' :
                return num1 - num2;
            case '*' :
                return num1 * num2;
            case '/' :
                return num1 / num2;
            case '%' :
                return num1 % num2;
            case '^' :
                int result = 1;
                for(; num2 > 0; num2--) {
                    result = result * num1;
                }
                return result;
        }
        return 0;
    }
}

