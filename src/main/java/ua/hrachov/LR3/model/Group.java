package ua.hrachov.LR3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, students);
    }
}
