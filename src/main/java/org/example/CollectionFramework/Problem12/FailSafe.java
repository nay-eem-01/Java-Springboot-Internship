package org.example.CollectionFramework.Problem12;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> iterator = list.iterator();
        System.out.println(iterator);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            list.add(0);
            System.out.println(list);
        }
    }
}
