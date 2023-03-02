package src.week9;

import java.io.*;

public class StudentDriver {
    public static void main(String[] args) throws IOException {
        Student s = new Student("ABC", "DEF", "GHI", 123456789);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/src.week9/record.txt"))) {
            oos.writeObject(s);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream("src/src.week9/record.txt"))) {
            Student s1 = (Student) oos.readObject();
            System.out.println(s1);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
