package java_basics.learn_final;

public class TestTesla {

    public static void main(String[] args) {
        Tesla modelX = new Tesla();
        Tesla modelY = new Tesla();
        Tesla model3 = new Tesla();

        modelX.color = "Black";
        modelX.isElectric = true;
        modelX.model = "Model X";
        modelX.numOfWheels = 4;

        System.out.println(Tesla.MANUFACTURER);
        modelX.start();
    }
}
