package java_intermediate.data_structures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LearnIterator {

    public static void main(String[] args) {
        ArrayList<Integer> myIntList = new ArrayList<>();

        myIntList.add(10);
        myIntList.add(50);
        myIntList.add(100);
        myIntList.add(500);
        myIntList.add(1000);
        myIntList.add(5000);

//        Iterator<Integer> iter = myIntList.iterator();
//
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

        ListIterator<Integer> listIter = myIntList.listIterator();

        System.out.println("***Iterating forwards***");

        while (listIter.hasNext()) {
            listIter.add(20);
            System.out.println(listIter.next());

        }

        System.out.println("***Iterating backwards***");

        while (listIter.hasPrevious()) {
            System.out.println(listIter.previous());
        }



    }

}
