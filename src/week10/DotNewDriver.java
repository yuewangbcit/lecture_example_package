package src.week10;

/**
 * The DotNewDriver class demonstrates how to instantiate an inner class
 * from a separated driver class.
 *
 * @author BCIT
 * @version 2020
 */
public class DotNewDriver {
    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(final String[] args) {
        DotNew.Inner inner = new DotNew().new Inner();
//        inner.print();
    }
}
