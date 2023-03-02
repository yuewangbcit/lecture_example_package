package src.week6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class SortingExample {
    public static void numberSorting() {
        Integer[] intList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];
        Random generator = new Random();
        for (int i = 0; i < size; i++) {
            intList[i] = generator.nextInt();
        }
        Arrays.sort(intList);
        System.out.println("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.print(intList[i] + "  ");
        }
        System.out.println();
        scan.close();
    }

    public static void stringSorting() {
        String[] stringList = {"ABC", "abc", "Abc", "AbC", "aBc", "abC"};
        Arrays.sort(stringList);
        System.out.println("\nYour strings in sorted order...");
        for (int i = 0; i < stringList.length; i++) {
            System.out.print(stringList[i] + "  ");
        }
        System.out.println();
    }

    public static void stringReverseSorting1() {
        String[] stringList = {"ABC", "abc", "Abc", "AbC", "aBc", "abC"};
        Arrays.sort(stringList, Collections.reverseOrder());
        System.out.println("\nYour strings in reversely sorted order...");
        for (int i = 0; i < stringList.length; i++) {
            System.out.print(stringList[i] + "  ");
        }
        System.out.println();
    }

    public static void stringReverseSorting2() {
        ComparableString[] stringList = new ComparableString[6];
        stringList[0] = new ComparableString("ABC");
        stringList[1] = new ComparableString("abc");
        stringList[2] = new ComparableString("Abc");
        stringList[3] = new ComparableString("AbC");
        stringList[4] = new ComparableString("aBc");
        stringList[5] = new ComparableString("abC");
        Arrays.sort(stringList);
        System.out.println("\nYour numbers in reversely sorted order...");
        for (int i = 0; i < stringList.length; i++) {
            System.out.print(stringList[i].getName() + "  ");
        }
        System.out.println();
    }

    public static void stringReverseSorting3() {
        String[] stringList = {"ABC", "abc", "Abc", "AbC", "aBc", "abC"};
        Arrays.sort(stringList, new ComparatorString());
        System.out.println("\nYour strings in reversely sorted order...");
        for (int i = 0; i < stringList.length; i++) {
            System.out.print(stringList[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        numberSorting();
        stringSorting();
//        stringReverseSorting1();
//        stringReverseSorting2();
//        stringReverseSorting3();
    }
}
