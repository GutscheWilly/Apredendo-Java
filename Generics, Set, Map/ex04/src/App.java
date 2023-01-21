import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import entities.Course;
import entities.Instructor;
import entities.Student;

public class App {

    public static void main(String[] args) throws Exception {
        Instructor instructor = requestInstructor(3);
        System.out.println(instructor);
        System.out.println("Total Students: " + instructor.totalStudents());
    }

    public static Instructor requestInstructor(Integer quantityOfCourses) {
        Scanner scanner = new Scanner(System.in);
        List<Course> coursesList = new ArrayList<>();
        for (int i = 1 ; i <= quantityOfCourses ; i++) {
            System.out.print("How many students for course " + i + ": ");
            Integer quantityOfStudents = scanner.nextInt();
            TreeSet<Student> enrolledStudents = new TreeSet<>();
            for (int j = 1 ; j <= quantityOfStudents ; j++) {
                Integer studentId = scanner.nextInt();
                Student student = new Student(studentId);
                enrolledStudents.add(student);
            }
            Course course = new Course(enrolledStudents);
            coursesList.add(course);
        }
        scanner.close();
        return new Instructor(coursesList);
    }
}
