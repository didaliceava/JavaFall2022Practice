package java_basics.learn_composition;

public class Computer {

    Monitor monitor;
    Keyboard keyboard;
    Mouse mouse;

    public Computer(Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }



}
