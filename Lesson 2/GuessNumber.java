import java.util.Scanner;

public class GuessNumber {

    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    Scanner scanner = new Scanner(System.in);

    public void play() {
        int computerNumber = (int)(Math.random() * 101);

        while(true) {
            System.out.println(player1.getName() + " введите число");
            player1.setNumber(scanner.nextInt());
            if (computerNumber == player1.getNumber()) {
                System.out.println(player1.getName() + " выиграл(а)");
                break;
            } else if (computerNumber < player1.getNumber()) {
                System.out.println("Число " + player1.getNumber() + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player1.getNumber() + " меньше того, что загадал компьютер");
            }

            System.out.println(player2.getName() + " введите число");
            player2.setNumber(scanner.nextInt());
            if (computerNumber == player2.getNumber()) {
                System.out.println(player2.getName() + " выиграл(а)");
                break;
            } else if (computerNumber < player2.getNumber()) {
                System.out.println("Число " + player2.getNumber() + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player2.getNumber() + " меньше того, что загадал компьютер");
            }
        }
    }
}