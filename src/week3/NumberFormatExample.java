package src.week3;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {
    public static void main(String[] args) {
        NumberFormat nfCurrency = NumberFormat.getCurrencyInstance();
        double[] prices = {1, 556.2, 8.91, 1105.22313};
        for(double price : prices) {
            System.out.println(nfCurrency.format(price));
        }
        System.out.println();

        nfCurrency = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        for(double price : prices) {
            System.out.println(nfCurrency.format(price));
        }
        System.out.println();

        NumberFormat nfPercent = NumberFormat.getPercentInstance();
        for(double price : prices) {
            System.out.println(nfPercent.format(price));
        }
        System.out.println(nfPercent.getMinimumFractionDigits());
        System.out.println(nfPercent.getMaximumFractionDigits());
        System.out.println();

        nfPercent.setMinimumFractionDigits(1);
        nfPercent.setMaximumFractionDigits(3);
        for(double price : prices) {
            System.out.println(nfPercent.format(price));
        }
    }
}
