package java_basics.learn_constructors;

public class Animal {

    String name;
    String color;
    int weight;
    int age;
    int numOfLegs;
    int numOfEyes;
    boolean hasTail;

    public Animal(String name, int age) {
        System.out.println("Calling constructor #1");
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, int weight) {
        System.out.println("Calling constructor #2");
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


}
