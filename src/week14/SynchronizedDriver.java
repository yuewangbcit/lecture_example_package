package src.week14;

public class SynchronizedDriver {
    /**
     * Drives the program.
     *
     * @param args not used.
     */
    public static void main(String args[]) {
        SynchronizedCounter counter = new SynchronizedCounter();
        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        Thread t3 = new Thread(counter, "Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }
}