package src.week9;

public class Box<T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public void set(T t) {
        this.t = t;
    }

    public T getContent() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(10);
        System.out.println(integerBox.getContent());
        integerBox.set(15);
        System.out.println(integerBox.getContent());

        Box<String> stringBox = new Box<>("ABC");
        System.out.println(stringBox.getContent());
        stringBox.set("DEF");
        System.out.println(stringBox.getContent());
    }

}

