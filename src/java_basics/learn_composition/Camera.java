package java_basics.learn_composition;

public class Camera {

    String resolution;
    String aperture;
    int megaPixel;

    public Camera(String resolution, String aperture, int megaPixel) {
        this.resolution = resolution;
        this.aperture = aperture;
        this.megaPixel = megaPixel;
    }

    void takePicture() {
        System.out.println("Say cheese!");
    }

    void recordVideo() {
        System.out.println("RED BLINKING LIGHT");
    }
}
