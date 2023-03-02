package src.week9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) {
        try {
            // try to create PrintWriter for writing data streams to files
            PrintWriter out1 = new PrintWriter(
                    "employee1.txt", "UTF-8");
            out1.println("ABC");
            out1.close();

            PrintWriter out2 = new PrintWriter(
                    new FileOutputStream("employee2.txt")
            );
            out2.println("DEF");
            out2.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
