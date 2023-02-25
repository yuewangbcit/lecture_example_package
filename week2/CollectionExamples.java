package week2;

import java.util.ArrayList;

public class CollectionExamples {
    public static void main(String[] args) {
        // ArrayList example
        // add numbers from 0 to 10
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
            numbers.add(i); // autoboxing
        }

        // show original numbers and size
        System.out.print("Original numbers: ");
        for(int i=0; i<numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
        }
        System.out.println();
        System.out.println("Original size: " + numbers.size());

        // change the ArrayList
        int removedLast = numbers.remove(10); // unboxing
        System.out.println("Last number removed: " + removedLast);
        System.out.println("New size: " + numbers.size());
        numbers.set(4, -1);
        System.out.print("New Numbers: ");
        for(int i=0; i<numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
        }
        System.out.println();

        // add examples of HashMap and HashSet here
    }
}
