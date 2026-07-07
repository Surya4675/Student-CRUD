import model.Student;
import service.StudentService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentService();

        int choice;

        do {

            System.out.println("\n===== Student Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();

                    Student student = new Student(id, name, dept, cgpa);

                    service.addStudent(student);

                    break;

                case 2:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    service.deleteStudent(deleteId);

                    break;

                case 3:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 3);

        sc.close();
    }
}