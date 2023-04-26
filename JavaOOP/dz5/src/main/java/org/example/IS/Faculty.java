package org.example.IS;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Faculty {
    private String name;
    private String dean;
    private List<Student> students = new ArrayList<>();

    public Faculty(String name, String dean) {
        this.name = name;
        this.dean = dean;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getStudentList() {
        return students;
    }

    public String getDean() {
        return dean;
    }
}
