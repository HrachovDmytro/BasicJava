package ua.hrachov.LR3.controller;

import ua.hrachov.LR3.model.University;

public class UniversityCreator {
    public static University createUniversity(String name) {
        return new University(name);
    }
}
