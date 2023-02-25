package week2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Show a prompt for the user
        System.out.println("Enter the name, ID, age and salary of the new employee:");

        // Scan a String input as a line of text
        String name = scan.nextLine();

        // Scan a String input as a token
        String id = scan.next();

        // Scan numerical input as tokens
        int age = scan.nextInt();
        double salary = scan.nextDouble();

        // Output input by user
        System.out.println("week2.Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // What happens if, after asking for a double, we ask for a line of text?
        scan.nextLine();
        String extra = scan.nextLine();
        System.out.println("Extra input: " + extra);

        // Change the delimiter for separating tokens
        System.out.println("Please enter a url:");
        scan.useDelimiter("/");
        String root = scan.next();
        String firstFolder = scan.next();
        String secondFolder = scan.next();
        System.out.println("Root: " + root);
        System.out.println("First Folder: " + firstFolder);
        System.out.println("Second Folder: " + secondFolder);

        scan.close();
    }
}
