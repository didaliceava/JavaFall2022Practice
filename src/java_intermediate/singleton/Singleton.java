package java_intermediate.singleton;

public class Singleton {

    static Singleton obj;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }

        return obj;
    }

}
