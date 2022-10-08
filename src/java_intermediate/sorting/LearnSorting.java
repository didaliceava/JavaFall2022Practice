package java_intermediate.sorting;

public class LearnSorting {

    public static void main(String[] args) {
        int[] unsortedArray = {9, 504, 364, 83, 2, 2003, 693, 838, 73, 1, 646, 353, 92, 321};
        int length = unsortedArray.length;
        int smallestNumIndex;
        int temp;

        for (int i = 0; i < length - 1; i++) {
            smallestNumIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (unsortedArray[j] < unsortedArray[smallestNumIndex]) {
                    smallestNumIndex = j;
                }
            }
            temp = unsortedArray[i];
            unsortedArray[i] = unsortedArray[smallestNumIndex];
            unsortedArray[smallestNumIndex] = temp;
        }

        for (int x : unsortedArray) {
            System.out.println(x);
        }


    }

}
