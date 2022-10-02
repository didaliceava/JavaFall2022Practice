package java_intermediate.data_structures;

import java.util.Stack;

public class LearnStacks {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(10);
        myStack.push(20);
        myStack.pop();
        myStack.pop();
        myStack.push(48);
        myStack.push(29);
        myStack.pop();

        for (int c : myStack) {
            System.out.println(c);
        }

        myStack.push(84);
        myStack.push(99);

        System.out.println(myStack.peek());

        System.out.println(myStack.search(47));

    }
}
