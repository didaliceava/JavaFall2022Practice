package java_intermediate.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        System.out.println(obj);

        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2);
    }
}
