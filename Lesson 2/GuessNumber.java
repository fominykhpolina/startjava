public class GuessNumber {

    private int computerNumber = (int)(Math.random() * 101);

    public void play() {
        player1.hello();
        /*while (computerNumber != player1.getNumber()) {
                if (computerNumber < player1.getNumber()) {
                    System.out.println("Число " + player1.getNumber() + " больше того, что загадал компьютер");
                    System.out.println("введите другое число");
                    player1.setNumber(scanner.nextInt());
                } else {
                    System.out.println("Число " + player1.getNumber() + " меньше того, что загадал компьютер");
                    System.out.println("введите другое число");
                    player1.setNumber(scanner.nextInt());
                }
        }
        System.out.println("Вы победили! Загаданное число - " + computerNumber);
        */
        }
}