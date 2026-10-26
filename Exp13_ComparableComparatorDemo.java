import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // Default natural sorting by ID using Comparable
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa;
    }
}

public class Exp13_ComparableComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Zara", 3.8));
        students.add(new Student(101, "Alex", 3.5));
        students.add(new Student(102, "John", 3.9));

        // 1. Sorting using Comparable (Default: by ID)
        Collections.sort(students);
        System.out.println("Sorted by ID (Comparable):");
        for (Student s : students) {
            System.out.println(s);
        }

        // 2. Sorting using Comparator (Custom: by Name)
        students.sort(Comparator.comparing(s -> s.name));
        System.out.println("\nSorted by Name (Comparator):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}