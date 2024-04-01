package ua.hrachov.LR3.controller;
import ua.hrachov.LR3.model.Group;

public class GroupCreator {
    // Метод для створення нового об'єкту типу Group
    public static Group createGroup(String name) {
        return new Group(name);
    }
}
