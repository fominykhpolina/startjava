import java.util.Scanner;
public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        calculator.setAnswer("yes");
       
        while (calculator.getAnswer() == "yes") {
            System.out.println("Введите первое число: ");
            calculator.setNum1(scanner.nextInt());

            System.out.println("Введите знак: ");
            calculator.setSign(scanner.next());

            System.out.println("Введите второе число: ");
            calculator.setNum2(scanner.nextInt());

            calculator.count();
            System.out.println("Результат: " + calculator.getResult());

            System.out.println("Вы хотите продолжить вычисления? [yes/no]");
            calculator.setAnswer(scanner.next());
         }
    }
}