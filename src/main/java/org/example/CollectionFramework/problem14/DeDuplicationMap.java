package org.example.CollectionFramework.problem14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeDuplicationMap {
    public static <T> List<T> deDuplication(List<T> list){
        List<T> result = new ArrayList<>();
        Map<T,Boolean> map = new HashMap<>();

        for (T i : list){
            if (!map.containsKey(i)){
                map.put(i,true);
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 2, 3, 4, 3, 4, 4, 5);

        System.out.println(OrderPreservingDeDuplication.deDuplication(list));
    }
}
