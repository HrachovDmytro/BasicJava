package ua.hrachov.LR3.controller;

import ua.hrachov.LR3.model.Department;
import ua.hrachov.LR3.model.Faculty;
import ua.hrachov.LR3.model.Sex;
import ua.hrachov.LR3.model.Student;

// Клас Creator для створення різних елементів моделі
public class Creator {
    // Метод для створення студента
    public static Student createStudent(String name, String surname, String patronymic, Sex sex, String group) {
        return new Student(name, surname, patronymic, sex, group);
    }

    // Метод для створення факультету
    public static Faculty createFaculty(String name) {
        return new Faculty(name);
    }

    // Метод для створення кафедри
    public static Department createDepartment(String name) {
        return new Department(name);
    }

}