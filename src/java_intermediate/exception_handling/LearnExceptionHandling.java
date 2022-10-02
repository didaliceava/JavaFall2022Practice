package java_intermediate.exception_handling;

public class LearnExceptionHandling {

    public static void main(String[] args) {
//        String str = "JaVa is an IslAnd";
//        char[] strArr = str.toLowerCase().toCharArray();
//        int length = strArr.length;
//
        try {
            System.out.println(10/2);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
//
//        for (int i = 0; i <= length; i++) {
//            try {
//                System.out.print(strArr[i]);
//            } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
//                break;
//            } catch (IndexOutOfBoundsException e2) {
//                e2.getCause();
//            }
//        }

//        LearnExceptionHandling obj = new LearnExceptionHandling();
//        obj.divide(10, 0);
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        return num1 / num2;
    }
}
