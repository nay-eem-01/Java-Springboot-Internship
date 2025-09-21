package org.example.CollectionFramework.problem18;

import org.example.CollectionFramework.problem16.Person;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class FlatteningNestedCollection {

    public static <T> List<T> flatten(Collection <List<T>> collection){
        return collection.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }
     public static void main(String[] args) {


        List<List<Integer>> nestedArrayList = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

         List<List<Person>> personList = List.of(
                List.of(new Person("A",20,20000),new Person("E",40,30000)),
                List.of(new Person("B",30,30000),new Person("F",50,40000)),
                List.of(new Person("C",40,40000),new Person("G",28,30000)),
                List.of(new Person("D",50,50000),new Person("H",30,33000))
         );
         System.out.println("Flattened Number list");
        System.out.println(nestedArrayList);
         System.out.println("\nFlattened persons list");
        System.out.println(FlatteningNestedCollection.flatten(personList));

    }
}
