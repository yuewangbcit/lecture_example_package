package src.week3;

import java.text.DecimalFormat;

public class FormatterExample {
    public static void main(String[] args) {
        String pattern = "#00,000.000#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        double number = 1234.0987654321;
        System.out.println(decimalFormat.format(number));


        double num = 1234567890.0987654321;
        System.out.println(decimalFormat.format(num));

        decimalFormat.applyPattern("#,#00.0#");
        System.out.println(decimalFormat.format(num));
        num = 1.2345;
        System.out.println(decimalFormat.format(num));
    }
}
