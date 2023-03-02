package src.week4;

import java.util.ArrayList;

public class StaticInitializationExample {
    // Define a static variable numbers of ArrayList<Integer>
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    // This is a static initialization block
    static {
        System.out.println("Running static initialization block.");
        for (int i = 0; i < 10; i++) {
            int num = (int) (100.0 * Math.random());
            numbers.add(num);
        }
    }

    /**
     * Print every element in numbers
     */
    public void printArrayList() {
        System.out.println("The initialized values are:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StaticInitializationExample obj1 = new StaticInitializationExample();
        System.out.println("For obj1:");
        obj1.printArrayList();

        StaticInitializationExample obj2 = new StaticInitializationExample();
        System.out.println("For obj2:");
        obj2.printArrayList();
    }
}
