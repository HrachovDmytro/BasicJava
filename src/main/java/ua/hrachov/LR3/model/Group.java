package ua.hrachov.LR3.model;

import java.util.ArrayList;
import java.util.List;

// Клас Group
public class Group {
    private String name;
    private List<Student> students;

    // Конструктор класу
    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Метод для додавання студента до групи
    public void addStudent(Student student) {
        students.add(student);
    }

    // Метод для отримання списку студентів групи
    public List<Student> getStudents() {
        return students;
    }

    // Метод для отримання назви групи
    public String getName() {
        return name;
    }
}