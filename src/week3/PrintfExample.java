package src.week3;

import java.util.Formatter;

public class PrintfExample {
    public static void main(String[] args) {
        String t = "The correct answer";
        System.out.println(String.format("The correct answer is %s", t));
        System.out.println(String.format("The correct answer is %b", false));
        System.out.println(String.format("The correct answer is %c", 'a'));
        System.out.println(String.format("The number 25 in decimal = %d", 25));
        System.out.println(String.format("Output of 25.09878 with Precision 2: %.2f", 25.09878));
        System.out.println(String.format("%s gap filler %d %f", "Astring", 10, 12.3));

        Formatter fmt = new Formatter();
        fmt.format("%s gap filler %d %f", "Astring", 10, 12.3);
        System.out.println(fmt.out());
    }

}
