package java_basics;

public class CarTest {

    public static void main(String[] args) {
        int c = 5;

        Car bmw = new Car(); // instantiate -> To create an instance of
        Car ford = new Car();

        bmw.manufacturer = "BMW";
        bmw.color = "Imola Red";

        ford.manufacturer = "Ford";
        ford.color = "Black";

        System.out.println(bmw.typeOfVehicle);
        System.out.println(ford.typeOfVehicle);

        bmw.typeOfVehicle = "Boat";

        System.out.println(ford.typeOfVehicle);

        /* Calling non-static members of a class (non-static
         members belong to each instance of the class, and not
         the class itself
         */
        bmw.startEngine();

        /*
        Static members belong to the class itself, and not each
        instance of the class. Therefore, we access it using the
        class name
         */
        System.out.println(Car.typeOfVehicle);
    }
}
