package service;

import model.Student;
import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    // CREATE
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully.");
    }

    // DELETE
    public void deleteStudent(int id) {

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student Deleted Successfully.");
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    // Getter (Person 2 will use this)
    public ArrayList<Student> getStudents() {
        return students;
    }
}