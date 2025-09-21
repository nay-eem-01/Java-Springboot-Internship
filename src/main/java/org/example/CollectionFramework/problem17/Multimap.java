package org.example.CollectionFramework.problem17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimap {
    String key;
    List<String> values;
    public Multimap(String key, List<String> values) {
        this.key = key;
        this.values = values;
    }

    public static void main(String[] args) {
        Map<String,List<String>> multimap = new HashMap<>();
        List<String> fruits = Arrays.asList("apple","banana","mango");
        List<String> flowers = Arrays.asList("rose","belly","padma");

        multimap.put("fruits",fruits);
        multimap.put("flowers",flowers);

        System.out.println("Fruits: " + multimap.keySet());
        System.out.println("Multimap: \n" + multimap.entrySet());

        multimap.entrySet().forEach(entry ->{
            System.out.println("Key -> : " + entry.getKey());
            entry.getValue().forEach(value-> System.out.println("values -> : " + value));
        });

        System.out.println(multimap.get("fruits"));

    }

}
