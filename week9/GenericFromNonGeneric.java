package week9;

public class GenericFromNonGeneric {
    public static class NonGenericClass {
        private int id;
        private String name;

        public NonGenericClass(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static class GenericClass<T> extends NonGenericClass {
        private T data;

        public GenericClass(int id, String name, T data) {
            super(id, name);
            this.data = data;
        }
    }

    public static void main(String[] args) {
        GenericClass<Double> gc = new GenericClass<Double>(10, "abc", 2.3);
    }
}
