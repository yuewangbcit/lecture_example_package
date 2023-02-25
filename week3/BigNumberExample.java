package week3;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberExample {
    public static void main(String[] args) {

        final int UPPER_BOUND = 30;
        BigInteger factorial = BigInteger.valueOf(1);

        for (int i = 2; i <= UPPER_BOUND; ++i) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);

        long factorialLong = 1;
        for (int i = 2; i <= UPPER_BOUND; ++i) {
            factorialLong = factorialLong * i;
        }
        System.out.println(factorialLong);

        BigDecimal smallValue = BigDecimal.valueOf(0.1);
        for (int i = 2; i <= UPPER_BOUND; ++i) {
            smallValue = smallValue.multiply(BigDecimal.valueOf(i*0.1));
        }
        System.out.println(smallValue);

        double smallValueDouble = 0.1;
        for (int i = 2; i <= UPPER_BOUND; ++i) {
            smallValueDouble = smallValueDouble * i * 0.1;
        }
        System.out.println(smallValueDouble);
    }
}
