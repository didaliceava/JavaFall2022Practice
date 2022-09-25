package java_basics.learn_composition;

import java.awt.image.PackedColorModel;

public class Mouse {

    String manufacturer;
    String color;
    boolean isWireless;
    boolean hasScrollWheel;

    public Mouse(String manufacturer, String color, boolean isWireless, boolean hasScrollWheel) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.isWireless = isWireless;
        this.hasScrollWheel = hasScrollWheel;
    }

    void scrollDown() {
        System.out.println("Scrolling down");
    }

    void scrollUp() {
        System.out.println("Scrolling up");
    }

    void click(int xAxis, int yAxis) {
        System.out.println("Clicking at coordinates\n\tx: " + xAxis + " \n\ty: " + yAxis);
    }

}
