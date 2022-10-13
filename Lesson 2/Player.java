public class Player {

    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public int setNumber(int number) {
        this.number = number;
        return number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}