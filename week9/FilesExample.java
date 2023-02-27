package week9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.stream.Stream;

public class FilesExample {
    public static void main(String args[]) {
//        // check if a file exists in a provided path
//        Path path1 = Path.of("src/week9/employee2.txt");
//        boolean exists = Files.exists(path1);
//        if(exists) {
//            System.out.println("File found");
//        } else {
//            System.out.println("File not found");
//        }
//
//        // create a new file or directory
//        Path path2 = Path.of("src/week9/employee3.txt");
//        try {
//            Path newDirectory = Files.createDirectories(path2.getParent().resolve("src/week9/resources"));
//            System.out.println("newDirectory = " + newDirectory);
//
//            Path newFile = Files.createFile(newDirectory.resolve("emptyFile.txt"));
//            System.out.println("newFile = " + newFile);
//        } catch(IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // write/read strings and bytes to/from files
//        try {
//            // write strings
//            Path utfFile = Files.createTempFile("some", ".txt");
//            Files.writeString(utfFile, "this is my string dziękuję!"); // UTF 8
//            System.out.println("utfFile = " + utfFile);
//
//            Path iso88591File = Files.createTempFile("some", ".txt");
//            Files.writeString(iso88591File,
//                    "this is my string ää öö üü",
//                    StandardCharsets.ISO_8859_1); // otherwise == utf8
//            System.out.println("iso88591File = " + iso88591File);
//
//            // write bytes
//            Path anotherIso88591File = Files.createTempFile("some", ".txt");
//            Files.write(anotherIso88591File, "this is my string dziękuję!".getBytes(StandardCharsets.ISO_8859_1));
//            System.out.println("anotherIso88591File = " + anotherIso88591File);
//
//            // read strings
//            String fileContents = Files.readString(utfFile); // UTF 8
//            System.out.println("fileContents = " + fileContents);
//
//            fileContents = Files.readString(utfFile, StandardCharsets.ISO_8859_1); // else utf8
//            System.out.println("fileContents = " + fileContents);
//
//            // read bytes
//            fileContents = new String(Files.readAllBytes(utfFile), StandardCharsets.UTF_8);
//            System.out.println("fileContents = " + fileContents);
//
//        } catch(IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // try-with-resources example (using FileReader and BufferedReader)
//        Path path3 = Path.of("src/week9/employee3.txt");
//        try(BufferedReader br = Files.newBufferedReader(path3)) {
//            System.out.println(br.readLine());
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // Is this an alternative to the "try-with-resources"?
//        try {
//            BufferedReader br = Files.newBufferedReader(path3);
//            System.out.println(br.readLine());
//            br.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // try-with-resources example (using InputStream)
//        try (InputStream is = Files.newInputStream(path3)) {
//            int content;
//            while ((content = is.read()) != -1) {
//                System.out.print((char)content);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // list files in a directory (using list method)
//        Path path4 = Path.of("src/week9");
//        try (var files = Files.list(path4)) {
//            files.forEach(System.out::println);
//            System.out.println();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // list files in a directory (using newDirectoryStream method)
//        try (var files = Files.newDirectoryStream(path4, "*.txt")) {
//            files.forEach(System.out::println);
//            System.out.println();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // list files in a directory (using walk method)
//        try (var files = Files.walk(path4)) {
//            files.forEach(System.out::println);
//            System.out.println();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // move a file
//        try {
//            Path utfFile = Files.createTempFile("some", ".txt");
//            Files.move(utfFile, Path.of("src/week9").resolve(utfFile.getFileName().toString()));
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // delete a file
//        try {
//            Path tempFile = Files.createTempFile("some", ".txt");
//            System.out.println("tempFile = " + tempFile);
//            Files.delete(tempFile);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // delete a non-empty directory
//        Path path5 = Path.of("src/week9/123");
//        try (Stream<Path> walk = Files.walk(path5)) {
//            walk.sorted(Comparator.reverseOrder()).forEach(path -> {
//                try {
//                    Files.delete(path);
//                } catch (IOException e) {
//                    // something could not be deleted...
//                    e.printStackTrace();
//                }
//            });
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // serialization
//        try (ObjectOutputStream oos =
//            new ObjectOutputStream(new FileOutputStream("src/week9/object.txt"))) {
//                String s = "Hello world, I’m a string about to be frozen in time";
//            oos.writeObject(s);
//        }
//        catch (IOException ex) {
//            ex.printStackTrace();
//        }

    }
}
