package org.example.CollectionFramework.Problem11;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUMap <K,V> extends LinkedHashMap<K,V> {

    private  double capacity;

    public LRUMap(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        LRUMap<Integer,Integer> map = new LRUMap<>(5);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);
        map.put(5,5);



        System.out.println(map);
        map.put(6,6);
        System.out.println(map);
        map.put(7,7);
        System.out.println(map);
        map.put(8,8);
        System.out.println(map);
        System.out.println(map.size());


    }
}
