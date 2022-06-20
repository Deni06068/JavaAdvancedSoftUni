package university;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class University {
    int capacity;
    List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        students = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentCount() {
        return students.size();
    }

    public String registerStudent(Student student) {
        if (students.contains(student)) {
            return "Student is already in the university";
        } else if (capacity == students.size()) {
            return "No seats in the university";
        } else {
            students.add(student);
            return String.format("Added student %s %s", student.getFirstName(), student.getLastName());
        }
    }

    public String dismissStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            return String.format("Removed student %s %s", student.getFirstName(), student.getLastName());
        } else {
            return "Student not found";
        }
    }

    public String getStudent(String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return student.toString();
            }
        }
        return null;
    }

    public String getStatistics() {
        return students.stream()
                .map(s -> String.format("==Student: First Name = %s, Last Name = %s, Best Subject = %s", s.getFirstName(), s.getLastName(), s.getBestSubject()))
                .collect(Collectors.joining(System.lineSeparator()));
    }
}
