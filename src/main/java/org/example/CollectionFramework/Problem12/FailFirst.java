package org.example.CollectionFramework.Problem12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFirst {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            list.add("E");
        }
        System.out.println(list);

    }
}
