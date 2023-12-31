package org.example.IS;

public class Student {
    private String name;
    private String surname;
    private String faculty;
    private String group;

    public Student(String name, String surname, String faculty, String group) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.group = group;
    }

    @Override
    public String toString() {
        return surname + " " + name + " (" + faculty + ", " + group + ")";
    }
}

