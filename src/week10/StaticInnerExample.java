package src.week10;

/**
 * The StaticInnerExample class demonstrates how to manipulate a static inner class.
 *
 * @author BCIT
 * @version 2020
 */
public class StaticInnerExample {
    // static variable that belongs to the StaticInner class
    static int data = 30;

    /**
     * An inner class.
     */
    static class Inner {
        /**
         * The constructor of the inner class.
         */
        Inner() {
            System.out.println("An Inner object initialized");
        }

        /**
         * A normal method of the inner class.
         */
        void msg(){
            System.out.println("data is " + data);
        }

        /**
         * A static method of the inner class.
         */
        static void msg1(){
            System.out.println("data is " + data);
        }
    }

    /**
     * Drives the program.
     *
     * @param args unused
     */
    public static void main(String args[]){
        StaticInnerExample.Inner obj = new StaticInnerExample.Inner();
        obj.msg();
        obj.msg1();
        // no object is required to invoke the static method
        StaticInnerExample.Inner.msg1();
    }
}
