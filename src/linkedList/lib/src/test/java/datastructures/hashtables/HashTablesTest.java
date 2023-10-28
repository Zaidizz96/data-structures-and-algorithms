package datastructures.hashtables;
import dataStructures.hashtables.HashMap;
import org.checkerframework.checker.units.qual.K;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HashTablesTest {

    @Test
    void check_Set_Pair_And_Store_In_DataStructure(){
       HashMap<String , String> hashMap = new HashMap<>(4);
       hashMap.set("name" , "zaid izziddine");

       String actualValue = hashMap.get("name");
       String expectedValue = "zaid izziddine";

       assertEquals(actualValue , expectedValue);
    }

    @Test
    void check_Access_Pair_With_NonValid_Key(){
        HashMap<String , String> hashMap = new HashMap<>(4);
        hashMap.set("name" , "zaid");
        hashMap.set("age" , "27");
        hashMap.set("majority" , "engineering");
        hashMap.set("welcome" , "hello");

        assertNull(hashMap.get("firstName"));
    }

    @Test
    void check_Return_Unique_Key_And_Handle_Collision(){
        HashMap<String , String> hashMap = new HashMap<>(4);
        hashMap.set("name" , "zaid");
        hashMap.set("age" , "27");
        hashMap.set("name" , "engineering");
        hashMap.set("welcome" , "hello");

        List<String> keys = hashMap.keys();

        assertEquals(3 , keys.size());
        assertTrue(keys.contains("name"));
        assertTrue(keys.contains("welcome"));
        assertTrue(keys.contains("age"));
    }
    @Test
    public void testGetCollision() {
        HashMap<String, Integer> myHashMap = new HashMap<>(5);

        myHashMap.set("key1", 1);
        myHashMap.set("key2", 2);

        int value1 = myHashMap.get("key1");
        int value2 = myHashMap.get("key2");

        assertEquals(1, value1);
        assertEquals(2, value2);
    }
    @Test
    public void testHashInRange() {
        HashMap<String, Integer> myHashMap = new HashMap<>(16);

        String key1 = "key1";
        String key2 = "key2";
        String key3 = "key3";

        int index1 = myHashMap.hash(key1);
        int index2 = myHashMap.hash(key2);
        int index3 = myHashMap.hash(key3);

        assertTrue(index1 >= 0 && index1 < 16);
        assertTrue(index2 >= 0 && index2 < 16);
        assertTrue(index3 >= 0 && index3 < 16);
    }
}
