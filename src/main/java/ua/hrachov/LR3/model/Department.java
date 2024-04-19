package ua.hrachov.LR3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name) && Objects.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, students);
    }
}
