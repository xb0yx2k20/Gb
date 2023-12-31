package org.example.IS;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание университета
        University university = new University("Название университета", "Ректор университета");

        // Создание факультета
        Faculty faculty = new Faculty("Название факультета", "Декан факультета");

        // Добавление факультета в университет
        university.addFaculty(faculty);

        // Создание студента
        Student student = new Student("Вусал", "Мусаев", "ИУ9", "ИУ9_23б");
        Student student1 = new Student("Муса", "Вусалов", "РК", "РК9_23б");

        // Добавление студента на факультет
        faculty.addStudent(student);
        faculty.addStudent(student1);

        // Вывод списка студентов на факультете
        List<Student> students = faculty.getStudentList();
        System.out.println("Студенты на факультете " + faculty.getStudents() + ":");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
