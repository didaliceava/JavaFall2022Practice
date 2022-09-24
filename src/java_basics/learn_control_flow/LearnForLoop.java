package java_basics.learn_control_flow;

public class LearnForLoop {

    public static void main(String[] args) {
        String phrase = "We are learning loops";
        String[] myArray = {"493", "5201", "43", "81", "74", "505", "293", "201"};

        // For-Loop
        // Start  // Stop // Step
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration " + i + ": " + phrase);
        }

        // For-Each Loop
        for (String x : myArray) {
            System.out.println(x);
        }

    }


}
