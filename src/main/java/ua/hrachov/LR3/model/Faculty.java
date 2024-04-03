package ua.hrachov.LR3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Клас Faculty
public class Faculty {
    private String name;
    private List<Department> departments;

    // Конструктор класу
    public Faculty(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Метод для додавання кафедри до факультету
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Метод для отримання списку кафедр факультету
    public List<Department> getDepartments() {
        return departments;
    }

    // Метод для отримання назви факультету
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(name, faculty.name) && Objects.equals(departments, faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departments);
    }
}