package week3;

public class ABDriver {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);

        b.foo();
        b.bar();
    }
}
