import java.util.*;
class Student {
    String name;
    int roll;
    int marks;
    Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
}
public class StudentReport {
    public static double calculateAverage(Student[] students) {
        int sum = 0;
        for (Student s : students) {
            sum += s.marks;
        }
        return (double) sum / students.length;
    }
  public static void sortByMarks(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].marks < students[j].marks) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
    public static void printReport(Student[] students) {
        System.out.println("\n------ STUDENT REPORT ------");
        for (Student s : students) {
            String result = (s.marks >= 40) ? "Pass" : "Fail";
            System.out.println("Roll: " + s.roll + ", Name: " + s.name + ", Marks: " + s.marks + " (" + result + ")");
        }
        System.out.println("----------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            students[i] = new Student(name, roll, marks);
        }
        sortByMarks(students);
        printReport(students);

        double avg = calculateAverage(students);
        System.out.println("\nClass Average Marks: " + avg);
        System.out.println("\nTopper: " + students[0].name + " with " + students[0].marks + " marks!");
    }
}
