import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private char sign;
    private int result;

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void setSign(char sign) {
        this.sign = sign;
    }
    public int getResult() {
        switch (sign) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            case '%' :
                result = num1 % num2;
                break;
            case '^' :
                for(; num2 > 0; num2--) {
                    result *= num1;
                }
                break;
        }
        return result;
    }
}

