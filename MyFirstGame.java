public class MyFirstGame {

    public static void main(String[] args) {
        int computerNumber = 20;
        int personNumber = 5;
        while (computerNumber != personNumber) {
            if (computerNumber < personNumber) {
                System.out.println("Число " + personNumber + " больше того, что загадал компьютер");
                personNumber--;
            }
            else {
                System.out.println("Число " + personNumber + " меньше того, что загадал компьютер");
                personNumber++;
            }
        } System.out.println("Вы победили! Загаданное число - " + computerNumber);

        }
    }