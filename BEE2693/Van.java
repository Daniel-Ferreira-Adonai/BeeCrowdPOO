package BEE2693;

import java.util.ArrayList;
import java.util.List;

public class Van {
    private List<Student> studentsList = new ArrayList<>();

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }
}
