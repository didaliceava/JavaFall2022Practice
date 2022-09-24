package java_basics.learn_oops.polymorphism;

public class LearnMethodOverloading {

    public static void main(String[] args) {
        LearnMethodOverloading obj = new LearnMethodOverloading();
        System.out.println(obj.addPrintSentence(10, 20, "We are adding integers"));
        System.out.println(obj.addPrintSentence("We are adding doubles", 2.7, 6.6));

    }

    public int addPrintSentence(int num1, int num2, String sentence) {
        System.out.println(sentence);

        return num1 + num2;
    }

    public double addPrintSentence(String sentence, double num1, double num2) {
        System.out.println(sentence);

        return num1 + num2;
    }


}
