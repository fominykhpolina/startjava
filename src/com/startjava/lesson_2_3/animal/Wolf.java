package com.startjava.lesson_2_3.animal;

public class Wolf {
     private String gender;
     private String animalName;
     private float weight;
     private int age;
     private String color;
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void hunt() {
        System.out.println("hunting");
    }

    public void move() {
        System.out.println("moving");
    }

    public void run() {
        System.out.println("running");
    }

    public void sit() {
        System.out.println("sitting");
    }

    public void howl() {
        System.out.println("howling");
    }
}





