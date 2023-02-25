package week4;

/**
 * The DoubleComparisonExample program shows examples of comparing double values.
 *
 * @author Yue Wang
 * @version Jan 22, 2023
 */
public class DoubleComparisonExample {
    public static void main(String[] args) {
        // Compare two double values using ==
        double num1 = 1.0 / 3;
        double num2 = 0.3333333333;
        double num3 = 0.33333333333333333333;
        System.out.println(num1==num2);
        System.out.println(num1==num3);
        System.out.println();

        // Compare two double values using tolerance
        System.out.println(Math.abs(num1 - num2) < 0.0001);
        System.out.println(Math.abs(num1 - num3) < 0.0001);

        // Compare two double values using Double.compare method
        System.out.println(Double.compare(num1, num2));
        System.out.println(Double.compare(num2, num1));
        System.out.println(Double.compare(num1, num3));
    }
}
