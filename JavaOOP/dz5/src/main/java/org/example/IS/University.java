package org.example.IS;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private String rector;
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name, String rector) {
        this.name = name;
        this.rector = rector;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void removeFaculty(Faculty faculty) {
        faculties.remove(faculty);
    }

    public List<Faculty> getFacultyList() {
        return faculties;
    }

    public String getRector() {
        return rector;
    }
}
