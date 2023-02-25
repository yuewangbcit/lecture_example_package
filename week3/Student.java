package week3;

import java.util.Objects;

public class Student {
    private String name;
    private final String id;
    private int credits;

    public Student(String name, String id, int credits) {
        this.name = name;
        this.id = id;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", credits=" + credits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return credits == student.credits && Objects.equals(name, student.name) && Objects.equals(id, student.id);
    }



    public static void main(String[] args) {
        Student student1 = new Student("James", "A1234567", 85);
        Student student2 = new Student("Sarah", "A1234568", 81);
        Student student3 = new Student("James", "A1234567", 85);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student1==student3);
        System.out.println(student1.equals(student3));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
    }
}
