package dataStructures.hashmap_left_join;

import dataStructures.hashtables.HashMap;

import java.util.List;

public class Driver {

    public static void main(String[] args) {
        HashMap<String , String> hashMap1 = new HashMap<>(5);
        hashMap1.set("diligent" , "employed");
        hashMap1.set("fond" , "enamored");
        hashMap1.set("guide" , "usher");
        hashMap1.set("outfit" , "garb");
        hashMap1.set("wrath" , "anger");

        HashMap<String , String> hashMap2 = new HashMap<>(5);
        hashMap2.set("diligent" , "idle");
        hashMap2.set("fond" , "averse");
        hashMap2.set("flow" , "jam");
        hashMap2.set("guide" , "follow");
        hashMap2.set("wrath" , "delight");

        List<List<String>> result = HashmapLeftJoin.leftJoin(hashMap1 , hashMap2);
        for (List<String> row : result) {
            System.out.println(row);
        }
    }
}
