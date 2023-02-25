package week2;

public class SwapExample {
    public static void swap(String a, String b) {
        // We only swap the values passed to a and b here
        String temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        // Define two Strings
        String firstString = "ABC";
        String secondString = "DEF";
        System.out.println("Original values");
        System.out.println(firstString);
        System.out.println(secondString);

        // Swap the two Strings using a temporary String
        String temp = firstString;
        firstString = secondString;
        secondString = temp;
        System.out.println("After swapping");
        System.out.println(firstString);
        System.out.println(secondString);

        // We cannot swap two Strings by calling a swap method (pass by value)
        swap(firstString, secondString);
        System.out.println("After calling a method to swap");
        System.out.println(firstString);
        System.out.println(secondString);
    }
}
