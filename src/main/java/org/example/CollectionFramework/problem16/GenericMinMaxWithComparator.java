package org.example.CollectionFramework.problem16;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;

public class GenericMinMaxWithComparator {

    public static <T> T findMax(Collection<T> collection, Comparator<? super T> comparator){

        if (collection.isEmpty()){
            return null;
        }

        T maxElement = null;
        boolean first = true;

        for (T element : collection){

            if (element != null){
                if (first){
                    maxElement = element;
                    first=false;
                } else if (comparator.compare(element,maxElement)>0) {
                    maxElement = element;
                }
            }

        }
        return maxElement;
    }
    public static <T> T findMin(Collection<T> collection, Comparator<? super T> comparator){
        if (collection.isEmpty()){
            return null;
        }

        T minElement = null;
        boolean first = true;

        for (T element : collection){
            if (element != null){
                if (first){
                    minElement = element;
                    first=false;
                } else if (comparator.compare(element,minElement)<0) {
                    minElement = element;
                }
            }
        }
        return minElement;
    }
}
