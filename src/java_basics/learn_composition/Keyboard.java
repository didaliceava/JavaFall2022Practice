package java_basics.learn_composition;

public class Keyboard {

    String manufacturer;
    boolean isWireless;
    boolean isQWERTY;
    boolean hasNumPad;

    public Keyboard(String manufacturer, boolean isWireless, boolean isQWERTY, boolean hasNumPad) {
        this.manufacturer = manufacturer;
        this.isWireless = isWireless;
        this.isQWERTY = isQWERTY;
        this.hasNumPad = hasNumPad;
    }

    void turnOnNumLock() {
        System.out.println("Number lock is active");
    }

    void turnOffNumLock() {
        System.out.println("Number lock is disabled");
    }

}
