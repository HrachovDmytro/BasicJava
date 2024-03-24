package ua.hrachov.LR3.model;

import java.util.ArrayList;
import java.util.List;

// Клас Department
public class Department {
    private String name;
    private List<Student> students;

    // Конструктор класу
    public Department(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Метод для додавання студента до кафедри
    public void addStudent(Student student) {
        students.add(student);
    }

    // Метод для отримання списку студентів кафедри
    public List<Student> getStudents() {
        return students;
    }

    // Метод для отримання назви кафедри
    public String getName() {
        return name;
    }
}