package java_basics;

public class LearnDataTypes {

    public static void main(String[] args) {
        // Variable Declaration
        int age;

        // Variable initialization
        age = 30;

        // PRIMITIVE DATA TYPES

        // 1. Byte (1 byte) -->  -128 to 127
        byte myByte = 127;

        // 2. Short (2 bytes) --> -32,768 to 32,767
        short myShort = 32767;

        // 3. Int (4 bytes) --> -2,147,483,648 to 2,147,483,647
        int myInt = 2147483647;

        // 4. Long (8 bytes) --> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long myLong = -9223372036854775808L;

        // 5. Float (4 bytes) --> Sufficient for storing 6 to 7 decimal digits
        float myFloat = 5.5463456163456f;

        // 6. Double (8 bytes) --> Sufficient for storing 15 decimal digits
        double myDouble = 5.5463456563456;

        // 7. Char (2 bytes) --> Stores a single character/letter or ASCII values
        char myChar = 'c';

        // 8. Boolean (1 bit) --> Stores true or false values
        boolean isDone = false;

        System.out.println(myFloat);
        System.out.println(myDouble);
    }


}
