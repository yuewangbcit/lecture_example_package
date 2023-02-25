package week2;

public class DataConversionExample {
    public static void main(String[] args) {
        // Assignment Conversions - Widening (automatic, magnitude preserved)
        byte byteTypeValue = 127;
        short shortTypeValue = byteTypeValue;
        int intTypeValue = byteTypeValue;

        System.out.println("Assignment Conversions - Widening");
        System.out.println(byteTypeValue);
        System.out.println(shortTypeValue);
        System.out.println(intTypeValue);

        // We may lose precision when converting from a long to a float!
        long longTypeValue = 1234567890123456789L;
        float floatTypeValue = longTypeValue;
        double doubleTypeValue = longTypeValue;

        System.out.println(longTypeValue);
        System.out.println(floatTypeValue);
        System.out.println(doubleTypeValue);


        // Casting - Narrowing (not automatic, lose precision and magnitude)
        floatTypeValue = (float) doubleTypeValue;
        longTypeValue = (long) doubleTypeValue;
        intTypeValue = (int) doubleTypeValue;

        System.out.println("Casting - Narrowing");
        System.out.println(doubleTypeValue);
        System.out.println(floatTypeValue);
        System.out.println(longTypeValue);
        System.out.println(intTypeValue);

        // Promotion (widening that occurs automatically in arithmetic expressions that combine types)
        System.out.println("Promotion - Combine Types");
        System.out.println(123+4.56);

        // Casting (explicitly widening and narrowing)
        int total = 50;
        double average = total / 6;
        System.out.println("Casting");
        System.out.println(average);
        average = (double) total / 6;
        System.out.println(average);

        // Alternatively, we can find the correct average using promotion
        average = 1.0 * total / 6;
        System.out.println(average);
    }
}
