import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            System.out.println("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());
            System.out.println("Введите знак: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());
            System.out.println("Результат: " + calculator.getResult());
            System.out.println("Вы хотите продолжить вычисления? [yes/no]");
            answer = scanner.next();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Неккоректный ввод");
                System.out.println("Вы хотите продолжить вычисления? [yes/no]");
                answer = scanner.next();
            }
            if (answer.equals("no")) {
                    break;
            }
        }
    }
}