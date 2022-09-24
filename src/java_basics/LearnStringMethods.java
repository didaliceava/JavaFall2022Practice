package java_basics;

public class LearnStringMethods {

    static String student = "Hamama";

    public static void main(String[] args) {
        int length = student.length();
        System.out.println(length); // 6

        System.out.println(student.toLowerCase());
        System.out.println(student.toUpperCase());
        System.out.println(student.substring(3)); // am
//        System.out.println(student.substring(3, 7));
        System.out.println(student.toLowerCase().startsWith("h")); // true

    }

}
