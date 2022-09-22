package java_basics.learn_static;

public class CarTest {

    public static void main(String[] args) {
        int c = 5;

        Car bmw = new Car(); // instantiate -> To create an instance of
        Car ford = new Car();

        bmw.manufacturer = "BMW";
        bmw.color = "Imola Red";

        ford.manufacturer = "Ford";
        ford.color = "Black";

        /*
         Do not use objects to call static members of a class. Instead, use the class name

         In the example below, the correct call would be Car.typeOfVehicle
         */
        System.out.println(bmw.typeOfVehicle);
        System.out.println(ford.typeOfVehicle);

        bmw.typeOfVehicle = "Boat";

        System.out.println(ford.typeOfVehicle);

        /*
        Call non-static members of a class using objects of that class

        (Non-static members belong to each instance of the class, and not the class itself)
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
