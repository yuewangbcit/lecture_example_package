package src.week6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Demonstrates the use of the iterator.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class IteratorDemo {

    private static final String[] COLOURS = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
    private static final String[] REMOVE_COLOURS = {"RED", "WHITE", "BLUE" };

    /**
     * Constructs an object of type CollectionTest.
     */
    public IteratorDemo() {
        List<String> list = new ArrayList<>();
        List<String> removeList = new ArrayList<>();

        for (String color : COLOURS) {
            list.add(color);
        }
        for (String color : REMOVE_COLOURS) {
            removeList.add(color);
        }

        System.out.println("ArrayList: ");
        for (int count = 0; count < list.size(); count++) {
            System.out.printf("%s ", list.get(count));
        }

//        System.out.println("\n\nArrayList after calling removeColors: ");
//        removeColors(list, removeList);
//        for (String color : list) {
//            System.out.printf("%s ", color);
//        }

        System.out.println("\n\nArrayList after calling removeColors: ");
        String[] result = removeColors();
        for(String s : result) {
            System.out.print(s + " ");
        }
    }

    /*
     * Demonstrates the use of the iterator to remove elements from a collection.
     */
    private void removeColors(final Collection<String> collection1,
                              final Collection<String> collection2) {

        Iterator<String> iterator = collection1.iterator();
        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove();
            }
        }

//        for(String s : collection1) {
//            if(collection2.contains(s)) {
//                collection1.remove(s);
//            }
//        }
    }


    public String[] removeColors() {
        boolean[] marked = new boolean[COLOURS.length];
        int size = 0;
        for(int i=0; i<COLOURS.length; i++) {
            String color = COLOURS[i];
            for(int j=0; j<REMOVE_COLOURS.length; j++) {
                if(color.equals(REMOVE_COLOURS[j])) {
                    marked[i] = true;
                    size++;
                }
            }
        }
        String[] newArray = new String[COLOURS.length-size];
        int i = 0;
        for(int j=0; j<marked.length; j++) {
            if(!marked[j]) {
                newArray[i] = COLOURS[j];
                i++;
            }
        }
        return newArray;
    }

    /**
     * Drives the program.
     *
     * @param args command line arguments (unused)
     */
    public static void main(final String[] args) {
        new IteratorDemo();

    }
}
