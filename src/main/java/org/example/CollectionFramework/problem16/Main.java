package org.example.CollectionFramework.problem16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("ABC",25,25000.00);
        Person person2 = new Person("XYZ",35,35000.00);

        List<Person> personList = Arrays.asList(person1,person2);
        System.out.println(GenericMinMaxWithComparator.findMax(personList, Comparator.comparingDouble(Person::getSalary)));
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Integer maxElement = GenericMinMaxWithComparator.findMax(list,Integer::compare);
        System.out.println("Max Element is: " + maxElement);
        Integer minElement = GenericMinMaxWithComparator.findMax(list,Integer::compare);
        System.out.println("Min element is: " + GenericMinMaxWithComparator.findMin(list,Integer::compare));

    }
}
