package src.week3;

public class B {
    private A a; // the delegate link

    public B(A a) {
        this.a = a;
    }

    public void foo() {
        a.foo(); // invoke foo() on the delegate
    }

    public void bar() {
        System.out.println("b.bar");
    }
}
