package ua.hrachov.LR3.model;

import java.util.ArrayList;
import java.util.List;

// Клас University
public class University {
    private String name;
    private List<Faculty> faculties;

    // Конструктор класу
    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    // Метод для додавання факультету до університету
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Метод для отримання списку факультетів університету
    public List<Faculty> getFaculties() {
        return faculties;
    }

    // Метод для отримання назви університету
    public String getName() {
        return name;
    }
}