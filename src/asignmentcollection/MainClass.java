package asignmentcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       List<Student> students = new ArrayList<Student>();

        while (true) {
            try {
                System.out.print("\nEnter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Classes: ");
                String classes = scanner.nextLine();

                System.out.print("Enter mark: ");
                float mark = Float.parseFloat(scanner.nextLine());

                students.add(new Student(name, classes, mark));

                System.out.print("Do you want to import more students? (y/n): ");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("n")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please re-enter student information!");
            }
        }

        StudentsBusiness studentsBusiness = new StudentsBusiness();
        studentsBusiness.sortStudent(students);
        studentsBusiness.display(students);
    }
}
