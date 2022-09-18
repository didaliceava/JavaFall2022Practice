package java_basics;

public class LearnCasting {

    public static void main(String[] args) {
        int myInt = 10;
        short myShort = 5;
        long myLong = 1023452L;
        float myFloat = 5.5f;
        double myDouble = 6.80544363245;
        String strNumber = "534";

//        System.out.println((float) (myDouble));

        System.out.println(Float.parseFloat(strNumber));
        System.out.println(Double.parseDouble(strNumber));
        System.out.println(Integer.parseInt(strNumber));
    }

}
