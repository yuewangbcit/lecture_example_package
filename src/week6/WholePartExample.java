package src.week6;

class Part {
    protected static int id;

    static {
        id = 0;
        System.out.println("Initial part ID " + id);
    }

    public Part(int id) {
        this.id = id;
        System.out.println("Part ID " + id);
    }

    protected void changeID(int newID) {
        System.out.println("Part ID " + newID);
    }
}

class Whole {
    protected static Part p1;
    protected static Part p2;

    static {
        p1 = new Part(1);
        p2 = new Part(2);
    }

    public Whole() {
        System.out.println("A whole with part 1 and part 2");
    }
}

public class WholePartExample {

    public static void main(String[] args) {
        System.out.println("Program is running");
        Whole anotherWhole = new Whole();
        whole.p1.changeID(10);
        anotherWhole.p2.changeID(10);
    }

    static Whole whole = new Whole();
}