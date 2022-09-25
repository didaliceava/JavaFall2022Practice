package java_basics.learn_oops.inheritance;

public class Cat extends Animal {

    void speak() {
        System.out.println("Meow!");
    }

    boolean hasFur;

    public Cat(String color, int weight, int numOfEyes, int numOfLegs, boolean hasTail, boolean hasFur) {
        super(color, weight, numOfEyes, numOfLegs, hasTail);
        this.hasFur = hasFur;
    }

    void purr(int x, String y) {

    }

    void run() {

    }

    void clean() {

    }

}
