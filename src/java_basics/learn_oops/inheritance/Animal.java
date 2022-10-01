package java_basics.learn_oops.inheritance;

public class Animal {

    String color;
    int weight;
    int numOfEyes;
    int numOfLegs;
    boolean hasTail;

    public Animal(String color, int weight, int numOfEyes, int numOfLegs, boolean hasTail) {
        this.color = color;
        this.weight = weight;
        this.numOfEyes = numOfEyes;
        this.numOfLegs = numOfLegs;
        this.hasTail = hasTail;
    }

    void speak() {
        System.out.println("Animal is speaking");
    }

    void eat() {

    }

    void sleep() {

    }


}
