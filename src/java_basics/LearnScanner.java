package java_basics;

import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter a sentence:");
//        String userInput = scanner.nextLine();
////        String userInput = scanner.next();
//
//        System.out.println(userInput);

        System.out.println("Please enter a number:");
        int x = scanner.nextInt();

        System.out.println("Please enter another number:");
        int y = scanner.nextInt();

        scanner.close();

        System.out.println(x + y);

    }

}
