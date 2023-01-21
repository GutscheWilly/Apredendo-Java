package entities;

import java.util.TreeSet;

public class Course {
    
    private TreeSet<Student> enrolledStudents;

    public Course(TreeSet<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public TreeSet<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(TreeSet<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Enrolled Students: ");
        for (Student student : enrolledStudents) {
            stringBuilder.append(student + " ");
        }
        return stringBuilder.toString();
    }
}
