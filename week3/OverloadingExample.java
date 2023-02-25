package week3;

public class OverloadingExample {
    private int resultInt;
    private String name;

    // A constructor that initializes each instance variable to a default value
    public OverloadingExample() {
        resultInt = 10;
        name = "";
    }

    // Another constructor that uses this to call the default constructor and
    // initializes the instance variable name with a specified name
    // Overloading constructor
    public OverloadingExample(String name) {
        this();
        this.name = name;
    }

    public int getResultInt() {
        return resultInt;
    }

    // Set resultInt to the sum of two integers
    public void setResultInt(int num1, int num2) {
        this.resultInt = num1 + num2;
    }

    // Set resultInt to the sum of three integers
    // Method overloading
    public void setResultInt(int num1, int num2, int num3) {
        this.resultInt = num1 + num2 + num3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        OverloadingExample overloading = new OverloadingExample("ABC");
        System.out.println(overloading.getName());
        System.out.println(overloading.getResultInt());
        overloading.setResultInt(1, 2);
        System.out.println(overloading.getResultInt());
        overloading.setResultInt(1, 2, 3);
        System.out.println(overloading.getResultInt());
    }
}
