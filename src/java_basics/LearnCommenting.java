package java_basics;

public class LearnCommenting {

    public static void main(String[] args) {
        // This is a single-line comment - it will not get executed

        /*
        This is
        a multi
        line
        comment
         */

        doSomething(5, 10);

    }

    /**
     * This is a doc-string. It helps devs to understand what a function/method does. It provides
     * documentation that is easily viewable when hovering over a method invocation.
     * @param a The first number to be added
     * @param b The second number to be added
     */
    static void doSomething(int a, int b) {

    }


}
