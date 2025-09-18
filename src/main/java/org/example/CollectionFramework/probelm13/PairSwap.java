package org.example.CollectionFramework.probelm13;

public class PairSwap {

    public static class Pair<K,V>{
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public static <K,V> void swapPair(Pair<K,V> src, Pair<K,V> dest ){
            K tempKey = src.getKey();
            V tempValue = src.getValue();

            src.setKey(dest.getKey());
            src.setValue(dest.getValue());

            dest.setKey(tempKey);
            dest.setValue(tempValue);
        }

    }
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1,"Nayeem");
        Pair<Integer, String> pair2 = new Pair<>(2,"Hasib");

        System.out.println("Before Swap");
        System.out.println("Pair 1: " + pair1.toString() + "\n Pair 2: " + pair2.toString());

        Pair.swapPair(pair1,pair2);

        System.out.println("After Swap");
        System.out.println("Pair 1: " + pair1 + "\n Pair 2: " + pair2);
    }
}
