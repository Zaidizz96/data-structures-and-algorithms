package dataStructures.hashmap_left_join;

import dataStructures.hashtables.HashMap;

import java.util.ArrayList;
import java.util.List;

public class HashmapLeftJoin {

    public static List<List<String>> leftJoin(HashMap<String, String> hashMap1, HashMap<String, String> hashmap2) {
        List<List<String>> list = new ArrayList<>();
        List<String> hashKeys1 = hashMap1.keys();
        List<String> hashKeys2 = hashmap2.keys();

        for (String key : hashKeys1) {

            List<String> listIndex = new ArrayList<>();
            listIndex.add(key);
            listIndex.add(hashMap1.get(key));
            if (hashKeys2.contains(key)) {
                listIndex.add(hashmap2.get(key));
            } else {
                listIndex.add(null);
            }
            list.add(listIndex);
        }
        return list;
    }
}
