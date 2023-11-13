package datastructures.hashmap_left_join;
import dataStructures.hashmap_left_join.HashmapLeftJoin;
import dataStructures.hashtables.HashMap;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class Hashmap_Left_Join {


    @Test
    public void testLeftJoinWithMatchingKeys() {
        HashMap<String, String> hashMap1 = new HashMap<>(5);
        hashMap1.set("diligent", "employed");
        hashMap1.set("fond", "enamored");
        hashMap1.set("guide", "usher");
        hashMap1.set("outfit", "garb");
        hashMap1.set("wrath", "anger");

        HashMap<String, String> hashMap2 = new HashMap<>(5);
        hashMap2.set("diligent", "idle");
        hashMap2.set("fond", "averse");
        hashMap2.set("guide", "follow");
        hashMap2.set("outfit", "NULL");
        hashMap2.set("wrath", "delight");

        List<List<String>> result = HashmapLeftJoin.leftJoin(hashMap1, hashMap2);

        assertEquals(5, result.size());
        assertEquals(List.of("diligent", "employed", "idle"), result.get(0));
        assertEquals(List.of("fond", "enamored", "averse"), result.get(3));
        assertEquals(List.of("guide", "usher", "follow"), result.get(2));
        assertEquals(List.of("outfit", "garb", "NULL"), result.get(4));
        assertEquals(List.of("wrath", "anger", "delight"), result.get(1));
    }

    @Test
    public void testLeftJoinWithNonMatchingKeys() {
        HashMap<String, String> hashMap1 = new HashMap<>(5);
        hashMap1.set("diligent", "employed");
        hashMap1.set("fond", "enamored");

        HashMap<String, String> hashMap2 = new HashMap<>(5);
        hashMap2.set("diligent", "idle");
        hashMap2.set("guide", "follow");

        List<List<String>> result = HashmapLeftJoin.leftJoin(hashMap1, hashMap2);

        assertEquals(2, result.size());
        assertEquals(List.of("diligent", "employed", "idle"), List.copyOf(result.get(0))); // Convert to an immutable list

        List<String> test = new ArrayList<>();
        test.add("fond");
        test.add("enamored");
        test.add(null);

        assertEquals(test, (result.get(1)));

    }
    }

