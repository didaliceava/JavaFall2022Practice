package java_basics.learn_oops.abstraction.interfaces;

public class BMW implements Car {

    String manufacturer;
    String model;
    String color;
    int currentSpeed;
    int numOfWheels;

    public BMW(String manufacturer, String model, String color, int currentSpeed, int numOfWheels) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.numOfWheels = numOfWheels;
    }

    @Override
    public void leftTurnSignal() {
        System.out.println("Left turn signal is on:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Blink");
        }
    }

    @Override
    public void rightTurnSignal() {
        System.out.println("Right turn signal is on:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Blink");
        }
    }

    @Override
    public void eBrake() {
        System.out.println("E-Brake is active");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine is starting");
    }

    @Override
    public void shutOffEngine() {
        System.out.println("Shutting off engine");
    }

    @Override
    public void accelerate(int accelerateBy) {
        int totalSpeed = this.currentSpeed + accelerateBy;

        if (totalSpeed < 200) {
            System.out.println("Accelerating to : " + totalSpeed);
            for (int i = this.currentSpeed; i <= totalSpeed; i++) {
                System.out.println("Speed is now: " + i);
            }

            this.currentSpeed = totalSpeed;
        } else {
            System.out.println("Cannot accelerate to " + totalSpeed);
        }

        System.out.println("Traveling at: " + currentSpeed);

    }

    @Override
    public void decelerate() {

    }
}
