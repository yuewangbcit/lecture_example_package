package week9;

import java.util.ArrayList;

public class OrderedPair<K, V> {
    K first;
    V second;

    public OrderedPair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public static <K, V> boolean same(OrderedPair<K, V> p1,
                                      OrderedPair<K, V> p2) {
        return p1.getFirst().equals(p2.getFirst()) &&
                p1.getSecond().equals(p2.getSecond());
    }


    public static void main(String[] args) {
        OrderedPair<String, String> op1 = new OrderedPair<>("abc", "def");
        OrderedPair<Integer, ArrayList<Integer>> op2 = new OrderedPair<>(10, new ArrayList<>());
        OrderedPair<Box<Double>, Box<Double>> op3 = new OrderedPair<>(new Box<>(1.2), new Box<>(3.4));

        OrderedPair<Integer, Integer> op4 = new OrderedPair<>(5, 6);
        OrderedPair<Integer, Integer> op5 = new OrderedPair<>(5, 6);
        OrderedPair<Integer, Integer> op6 = new OrderedPair<>(5, 5);
        System.out.println(same(op4, op5));
        System.out.println(same(op4, op6));
    }
}
