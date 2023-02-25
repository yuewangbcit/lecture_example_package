package week6;

import java.util.Arrays;
import java.util.Comparator;

public class MultiComparator {
    /**
     * Comparator to sort employees list or array in order of Salary
     */
    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };

    /**
     * Comparator to sort employees list or array in order of Age
     */
    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getAge() - e2.getAge();
        }
    };

    /**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

    public static void print(Employee[] employees) {
        for(Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(25, "Tommy", 123456.78);
        employees[1] = new Employee(39, "David", 876543.21);
        employees[2] = new Employee(42, "Andy", 567890.12);
        Arrays.sort(employees, SalaryComparator);
        print(employees);
        Arrays.sort(employees, AgeComparator);
        print(employees);
        Arrays.sort(employees, NameComparator);
        print(employees);
    }
}
