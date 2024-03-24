package ua.hrachov.LR3.controller;

import ua.hrachov.LR3.model.Sex;
import ua.hrachov.LR3.model.Student;

public class StudentCreator {
    // Метод для створення нового об'єкту типу Student
    public static Student createStudent(String name, String surname, String patronymic, Sex sex, String group) {
        return new Student(name, surname, patronymic, sex, group);
    }

}