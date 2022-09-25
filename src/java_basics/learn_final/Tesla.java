package java_basics.learn_final;

public class Tesla {

    String color;
    int numOfWheels;
    boolean isElectric;
    String model;
    public static final String MANUFACTURER = "Tesla";

    void start() {
        System.out.println(Tesla.MANUFACTURER + " " + model + " is starting");
    }

}
