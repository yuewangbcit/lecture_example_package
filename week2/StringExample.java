package week2;

public class StringExample {
    public static void main(String[] args) {
        // Instantiate a String using a literal
        String greetingLiteral = "Hello world!";
        // Invoke the String constructor with the new operator
        String greetingNew = new String("Hello world!");
        // Create a null String (similar to None in Python, no reference)
        String nullString = null;
        // Create an empty String (reference to an empty String with no characters)
        String emptyString = "";

        // String concatenation
        String firstPart = "ABC";
        String secondPart = "DEF";
        firstPart = firstPart + secondPart;
        System.out.println(firstPart);
        System.out.println(secondPart);

        int number = 5;
        System.out.println(firstPart+number);
        // Concatenation order
        System.out.println(1+2+"ABC"+(5+6)+7+8);

        // euqals vs. ==
        String firstABC = "ABC";
        String secondABC = "ABC";
        System.out.println(firstABC.equals(secondABC));
        System.out.println(firstABC==secondABC); // this works because of String interning

        String thirdABC = new String(firstABC);
        System.out.println(firstABC.equals(thirdABC));
        System.out.println(firstABC==thirdABC); // same content but difference references



    }
}
