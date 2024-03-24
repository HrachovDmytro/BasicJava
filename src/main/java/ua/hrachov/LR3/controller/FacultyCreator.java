package ua.hrachov.LR3.controller;

import ua.hrachov.LR3.model.Faculty;


public class FacultyCreator {
    // Метод для створення нового об'єкту типу Faculty
    public static Faculty createFaculty(String name) {
        return new Faculty(name);
    }

}