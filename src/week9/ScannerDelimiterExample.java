package src.week9;

import java.util.Scanner;
public class ScannerDelimiterExample {
    public static void main(String args[]){
        String input = "1 fish      2 fish     red fish  blue fish";
        // \\s* means 0 or more repetitions of any whitespace character
        // fish is the pattern to find
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(sc.nextInt());   // prints: 1
        System.out.println(sc.nextInt());   // prints: 2
        System.out.println(sc.next());      // prints: red
        System.out.println(sc.next());      // prints: blue
        //close the scanner
        sc.close();
    }
}