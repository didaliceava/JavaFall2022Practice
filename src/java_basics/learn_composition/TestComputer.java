package java_basics.learn_composition;

public class TestComputer {

    public static void main(String[] args) {
        Camera monitorCamera = new Camera("4K", "1.6f", 100);
        Monitor hpMonitor = new Monitor("HP", "4k", 32, true, monitorCamera);
        Keyboard logitechKeyboard = new Keyboard("Logitech", true, true, true);
        Mouse logitechMouse = new Mouse("Logitech", "Blue", true, true);

        Computer pc = new Computer(hpMonitor, logitechKeyboard, logitechMouse);
        pc.monitor.camera.takePicture();
        pc.monitor.camera.recordVideo();


    }
}
