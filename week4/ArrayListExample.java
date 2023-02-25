package week4;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i); // autoboxing
        }
        System.out.println(numbers);

        // Remove 3 from the ArrayList based on index
        for (int i = 0; i < numbers.size(); i++) {
           if(numbers.get(i)==3) {
               numbers.remove(i);
           }
        }
        System.out.println(numbers);

        // Remove 5 from the ArrayList using iterator
        Iterator<Integer> numIterator = numbers.iterator();
        while(numIterator.hasNext()) {
            Integer i = numIterator.next();
            if(i==5) {
                numIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
