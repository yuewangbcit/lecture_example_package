package week9;

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
}

