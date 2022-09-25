public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setGender("male");
        wolfOne.setAnimalName("Bim");
        wolfOne.setWeight(5.7f);
        wolfOne.setAge(4);
        wolfOne.setColor("gray");

        System.out.println("gender = " + wolfOne.getGender());
        System.out.println("animal name = " + wolfOne.getAnimalName());
        System.out.println("weight = " + wolfOne.getWeight());
        System.out.println("age = " + wolfOne.getAge());
        System.out.println("color = " + wolfOne.getColor());
    }
}
