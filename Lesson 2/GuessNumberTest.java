import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя первого игрока:");
        Player player1 = new Player(scanner.next());
        GuessNumber guessNumber = new GuessNumber();
   
        //System.out.println("Имя второго игрока:");
       //Player player2 = new Player(scanner.next());

        System.out.println(player1.getName() + " введите число:");
        player1.setNumber(scanner.nextInt());

        guessNumber.play();

    }
}