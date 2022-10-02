package java_intermediate.data_structures;

public class LearnArrays {

    /*
        1. Arrays are fixed in length
        2. To access members of an array, you must use the index of the element you wish to access
        3. Can hold duplicate values
     */

    public static void main(String[] args) {
        int[] myIntArray = new int[5];

        myIntArray[0] = 10;
        myIntArray[1] = 20;
        myIntArray[2] = 30;
        myIntArray[3] = 40;
        myIntArray[4] = 50;

        for (int x : myIntArray) {
            System.out.println(x);
        }

        myIntArray[1] = 21;

        System.out.println();
        for (int x : myIntArray) {
            System.out.println(x);
        }
    }

}
