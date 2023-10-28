package dataStructures.hashtables;

import java.util.AbstractMap;
import java.util.Map;

public class HashMapPair<K , V> extends AbstractMap.SimpleEntry<K , V> {
    public HashMapPair(K key, V value) {
        super(key, value);
    }

}
