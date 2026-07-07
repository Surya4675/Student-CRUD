import service.StudentService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentService();

        while(true) {

            System.out.println("\n1.Read Students");
            System.out.println("2.Update Student");
            System.out.println("3.Exit");

            System.out.print("Choice : ");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    service.readStudents();
                    break;

                case 2:
                    service.updateStudent(sc);
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}