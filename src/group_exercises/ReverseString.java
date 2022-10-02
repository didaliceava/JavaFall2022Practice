package group_exercises;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        String word = "Monday";

        System.out.println(obj.reverseString(word));
    }

    // Write a method to reverse any string provided as an arg to that method
    String reverseString(String str) {

        StringBuilder reversedStr = new StringBuilder();
        /*
        Eraz - For loop to loop the entire string. At first element, reassign to last element. Temp variable to hold the
                current character
         */

//        char[] chars = str.toCharArray();
//        int length = chars.length;
//        char temp;
//
//        for (int i = 0; i < length/ 2; i++) {
//            temp = chars[i];
//            chars[i] = chars[length - 1 - i];
//            chars[length - 1 - i] = temp;
//        }
//        reversedStr = Arrays.toString(chars);

        for(int i = str.length() - 1; i >= 0; i--){
            reversedStr.append(str.charAt(i));
        }

        return reversedStr.toString();
    }
}
