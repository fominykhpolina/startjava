public class MyFirstGame {

    public static void main(String[] args) {
        int num = 20;
        int player = 5;
        while (num != player) {
            if (num < player) {
                System.out.println("Число " + player + " больше того, что загадал компьютер");
                player--;
            } else {
                System.out.println("Число " + player + " меньше того, что загадал компьютер");
                player++;
            }
        } System.out.println("Вы победили! Загаданное число - " + num);
    }
}