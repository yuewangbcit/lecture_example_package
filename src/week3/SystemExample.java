package src.week3;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class SystemExample {

    public static void main(String[] args) {
//        double x = 50 / 0;
        try {
            OutputStream os = new FileOutputStream("abc.txt");
            PrintStream ps = new PrintStream(os);
            System.setErr(ps);
            double y = 50 / 0;
        }
        catch(Exception e) {
            System.out.println(e.toString());
            System.err.println(e);
        }
    }
}
