package src.week14;

/**
 * Counter. This example demonstrates the use of synchronized
 * methods to synchronize critical sections of code.
 *
 * @author BCIT
 * @version 2022
 */
class SynchronizedCounter implements Runnable {
    private int value = 0;

    /**
     * Increase the value by 1.
     * @throws InterruptedException if Thread cannot sleep
     */
    public void increment() {
        try {
            Thread.sleep(10);
            value++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Decrease the value by 1.
     */
    public void decrement() {
        value--;
    }

    /**
     * Returns the value.
     * @return value an int
     */
    public int getValue() {
        return value;
    }

    /**
     * Increase and then decrease the value by 1, printing the value
     * after each operation.
     */
    @Override
//    public synchronized void run() {
    public void run() {
//        synchronized(this) {
            this.increment();
            System.out.println("Value for Thread After increment " + Thread.currentThread().getName() + " " + this.getValue());
            this.decrement();
            System.out.println("Value for Thread at last " + Thread.currentThread().getName() + " " + this.getValue());
//        }
    }
}