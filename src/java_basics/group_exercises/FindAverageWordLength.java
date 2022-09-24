package java_basics.group_exercises;

public class FindAverageWordLength {


    public static void main(String[] args) {
        String sentence = "We are learning control flow statements which include conditionals and loops";

        String[] splitSentence = sentence.split(" ");

        int countOfWords = splitSentence.length;

        String sentenceWithoutSpaces = sentence.replace(" ", "");
        int numOfChars = sentenceWithoutSpaces.length();

        System.out.println("The average length of each word is: " + numOfChars / countOfWords);



    }
}
