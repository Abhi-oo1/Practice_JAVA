import java.io.*;
import java.util.*;

public class StudentDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        // Task 1: Read 'N' student details and write to a file
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll Number: ");
            int rollNo = scanner.nextInt();
            System.out.print("Gender (Male/Female): ");
            String gender = scanner.next();
            System.out.print("Contact Number: ");
            String contactNumber = scanner.next();
            scanner.nextLine(); // Consume newline
            students.add(new Student(name, rollNo, gender, contactNumber));
        }
        writeToFile("students.txt", students);
        System.out.println("Student details have been written to 'students.txt'.");
        // Task 2: Print details of male students
        System.out.println("\nDetails of Male Students:");
        for (Student student : students) {
            if (student.gender.equalsIgnoreCase("Male")) {
                System.out.println(student);
            }
        }
        // Task 3: Write female students to a new file
        List<Student> femaleStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.gender.equalsIgnoreCase("Female")) {
                femaleStudents.add(student);
            }
        }
        writeToFile("female_students.txt", femaleStudents);
        System.out.println("Female student details have been written to 'female_students.txt'.");
    }
    // Method to write a list of students to a file
    public static void writeToFile(String fileName, List<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Student student : students) {
                writer.write(student.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
// Student class to store student details
class Student {
    String name;
    int rollNo;
    String gender;
    String contactNumber;

    public Student(String name, int rollNo, String gender, String contactNumber) {
        this.name = name;
        this.rollNo = rollNo;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Gender: " + gender + ", Contact: " + contactNumber;
    }
}
