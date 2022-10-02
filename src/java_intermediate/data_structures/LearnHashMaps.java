package java_intermediate.data_structures;

import java.util.HashMap;

public class LearnHashMaps {

    /*
    HashMaps
        1. Data is stored in key-value pairs
        2. Cannot have duplicate keys
        3. Can have duplicate values
     */

    public static void main(String[] args) {
        HashMap<Integer, String> myHashmap = new HashMap<>();

        myHashmap.put(91, "Mahdi");
        myHashmap.put(92, "Faheem");
        myHashmap.put(1048457, "Mehnaz");
        myHashmap.put(93, "Eraz");

        System.out.println(myHashmap.get(94));

//        for (int k : myHashmap.keySet()) {
//            System.out.println(k);
//        }

    }
}
