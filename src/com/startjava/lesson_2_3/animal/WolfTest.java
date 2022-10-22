package com.startjava.lesson_2_3.animal;

public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setGender("male");
        wolf.setAnimalName("Bim");
        wolf.setWeight(5.7f);
        wolf.setAge(4);
        wolf.setColor("gray");

        wolf.hunt();
        wolf.move();
        wolf.run();
        wolf.sit();
        wolf.howl();

        System.out.println("gender = " + wolf.getGender());
        System.out.println("animal name = " + wolf.getAnimalName());
        System.out.println("weight = " + wolf.getWeight());
        System.out.println("age = " + wolf.getAge());
        System.out.println("color = " + wolf.getColor());
    }
}
