package src.week12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Sort2 uses a Comparator (neato!).
 *
 * @author BCIT
 * @version 2020
 */
public class Sort2 {

    /**
     * Prints the elements in a sorted list using a Comparator.
     */
    public void printElements() {
        List<Time> list = new ArrayList<>();
        list.add(new Time(6, 24, 34));
//        list.add(new Time(18, 14, 58));
        list.add(new Time(6, 05, 34));
        list.add(new Time(12, 14, 58));
        list.add(new Time(6, 24, 22));

        System.out.printf("Unsorted array elements:%n%s%n", list);
        Collections.sort(list, new TimeComparator());
        System.out.printf("Sorted list elements:%n%s%n", list);
    }

    /**
     * Drives the program.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        Sort2 sort2 = new Sort2();
        sort2.printElements();
    }
}
