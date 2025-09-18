package org.example.CollectionFramework.problem14;

import java.util.ArrayList;
import java.util.List;

public class OrderPreservingDeDuplication {
    public static <T> List<T> deDuplication(List<T> list) {
        List<T> uniqueList = new ArrayList<>();
        for (T i : list) {

            if (!uniqueList.contains(i))
                uniqueList.add(i);
        }
        return uniqueList;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 2, 3, 4, 3, 4, 4, 5);

        System.out.println(OrderPreservingDeDuplication.deDuplication(list));
    }
}
