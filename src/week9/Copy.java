package src.week9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class Copy {
    public static void main(String[] args) {
        // var is used as a local variable declaration instead of the variable's type
        // the compiler will infer the type of the variable at compile time, using
        // the type information obtained from the variable's initializer
        var input = Path.of("employee1.txt");
        var output = Path.of("src", "/week9", "/employee3.txt");
        try {
            Files.copy(input, output);
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
