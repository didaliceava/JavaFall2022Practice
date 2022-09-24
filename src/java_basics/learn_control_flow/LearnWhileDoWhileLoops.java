package java_basics.learn_control_flow;

public class LearnWhileDoWhileLoops {

    public static void main(String[] args) {
        int a = 0;
        int b = 10;

        // While Loop
        while (a > b) {
            System.out.println("A is greater than B");
            b++;
        }

        // Do-While Loop
        do {
            System.out.println("A is greater than B");
            b++;
        } while (a > b);
    }

}
