package entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Instructor {
    
    private List<Course> coursesList;

    public Instructor(List<Course> coursesList) {
        this.coursesList = coursesList;
    }

    public List<Course> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(List<Course> coursesList) {
        this.coursesList = coursesList;
    }

    public Integer totalStudents() {
        Set<Student> totalStudents = new HashSet<>();
        for (Course course : coursesList) {
            totalStudents.addAll(course.getEnrolledStudents());
        }
        return totalStudents.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Course course : coursesList) {
            stringBuilder.append(course + "\n");
        }
        return stringBuilder.toString();
    }
}
