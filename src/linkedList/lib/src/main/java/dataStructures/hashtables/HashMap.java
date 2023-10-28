package dataStructures.hashtables;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap<K , V>{
    ArrayList<LinkedList<HashMapPair<K , V>>> bucketArrayList;
    int size;

    public HashMap(int size){
        if (size < 1){
            throw new IllegalArgumentException("Hash map size must be 1 or greater");
        }
        this.size = size;
        this.bucketArrayList = new ArrayList<>();

        for (int i = 0; i < this.size; i++)
        {
            bucketArrayList.add(i, new LinkedList<>());
        }
    }

    public void set(K key, V value) {
        int position = hash(key);
        LinkedList<HashMapPair<K , V>> bucketsList = bucketArrayList.get(position);
        for (HashMapPair<K , V> node  : bucketsList ) {
            if (node.getKey().equals(key)){
                node.setValue(value);
                return;
        }}
            bucketsList.add(new HashMapPair<>(key, value));
    }

    public V get(K key){
        int position = hash(key);
        LinkedList<HashMapPair<K , V>> bucketList = bucketArrayList.get(position);
        for (HashMapPair<K , V> node  : bucketList) {
            if (node.getKey().equals(key)){
                return node.getValue();
            }
        }
        return null;
    }

    public boolean has(K key){
        int position = hash(key);
        LinkedList<HashMapPair<K , V>> bucketList = bucketArrayList.get(position);
        for (HashMapPair<K , V> node : bucketList) {
            if (node.getKey().equals(key)){
                return true;
            }
        }
        return false;
    }

    public List<K> keys(){
        List<K> keysCollections = new ArrayList<>();
        for (LinkedList<HashMapPair<K ,V>> list  : bucketArrayList) {
            for (HashMapPair<K , V> pair  : list) {
                keysCollections.add(pair.getKey());
            }
        }
        return keysCollections;
    }
    public int hash(K key){
        return Math.abs(key.hashCode()) % size;
    }
}
