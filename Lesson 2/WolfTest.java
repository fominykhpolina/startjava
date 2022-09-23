public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "male";
        wolfOne.animalName = "Bim";
        wolfOne.weight = 5.7f;
        wolfOne.age = 4;
        wolfOne.color = "gray";
        
        System.out.println("gender = " + wolfOne.gender);
        System.out.println("animalName = " + wolfOne.animalName);
        System.out.println("weight = " + wolfOne.weight);
        System.out.println("age = " + wolfOne.age);
        System.out.println("color = " + wolfOne.color);
        
        wolfOne.hunt();
        wolfOne.move();
        wolfOne.run();
        wolfOne.sit();
        wolfOne.howl();
    }
}
