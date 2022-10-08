package java_intermediate.data_structures;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LearnLists {

    /*
    ArrayLists
        1. Are flexible in size (size can be increased or decreased)
        2. Can hold duplicate values
     */
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add(0, "Sami");
        myList.add(1, "Burhan");
        myList.add(0, "Sarveen");

        for (String s : myList) {
            System.out.println(s);
        }

        System.out.println(myList.size());
        System.out.println(myList.contains("Burhan"));
        System.out.println(myList.get(2));
        System.out.println(myList.indexOf("Sarveen"));
        myList.remove("Sami");
        myList.remove(1);

        for (String s : myList) {
            System.out.println(s);
        }
    }
}
