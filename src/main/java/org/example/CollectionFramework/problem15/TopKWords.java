package org.example.CollectionFramework.problem15;


import java.util.*;
import java.util.stream.Collectors;

public class TopKWords {

    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> frequencyMap = new HashMap<>();


        for (String s : words) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }
        System.out.println(frequencyMap);

        List<String> frequentWords = frequencyMap
                .entrySet()
                .stream()
                .sorted((a,b)->{
                    int freqCompare = b.getValue().compareTo(a.getValue());
                    if (freqCompare == 0){
                        return a.getKey().compareTo(b.getKey());
                    }
                    return freqCompare;
                })
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(frequentWords);

        List<String> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(frequentWords.get(i));
        }
        System.out.println(res);

        return res;
    }

    public static void main(String[] args) {
        TopKWords topKWords = new TopKWords();
                String[] words = {"apple", "banana", "apple", "orange",
                        "banana", "apple", "kiwi", "orange"};
        System.out.println(topKWords.topKFrequent(words,4));
    }

}


