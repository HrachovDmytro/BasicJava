package ua.hrachov.LR3.controller;

import ua.hrachov.LR3.model.Department;

// Клас DepartmentCreator для створення об'єктів типу Department
public class DepartmentCreator {
    // Метод для створення нового об'єкту типу Department
    public static Department createDepartment(String name) {
        return new Department(name);
    }

}