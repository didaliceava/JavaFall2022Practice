package java_basics.learn_composition;

public class Monitor {

    String manufacturer;
    String resolution;
    int size;
    boolean isHD;
    Camera camera;

    public Monitor(String manufacturer, String resolution, int size, boolean isHD) {
        this.manufacturer = manufacturer;
        this.resolution = resolution;
        this.size = size;
        this.isHD = isHD;
    }

    public Monitor(String manufacturer, String resolution, int size, boolean isHD, Camera camera) {
        this.manufacturer = manufacturer;
        this.resolution = resolution;
        this.size = size;
        this.isHD = isHD;
        this.camera = camera;
    }

    void turnOnScreen() {
        System.out.println("Screen is turning on");
    }

    void turnOffScreen() {
        System.out.println("Screen is turning off");
    }
}
