package java_intermediate.data_structures;

import java.util.ArrayDeque;
import java.util.Queue;

public class LearnQueues {

    public static void main(String[] args) {
        Queue<String> myQueue = new ArrayDeque<>();

        myQueue.add("Viktoryia");
        myQueue.add("Chebrine");
        myQueue.add("Fatema");

        for (String s : myQueue) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());

    }

}
