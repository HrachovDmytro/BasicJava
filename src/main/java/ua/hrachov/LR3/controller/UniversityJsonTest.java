package ua.hrachov.LR3.controller;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import ua.hrachov.LR3.controller.JsonManager;
import ua.hrachov.LR3.model.*;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UniversityJsonTest {

    @Test
    public void testJsonSerializationDeserialization() {
        // Створення об'єкта університету з певною структурою
        University oldUniversity = createSampleUniversity();

        // Зберігаємо університет у файл JSON та потім зчитуємо його назад
        try {
            JsonManager.saveUniversityToJson(oldUniversity); // Зберігаємо
            University newUniversity = JsonManager.loadUniversityFromJson(); // Зчитуємо

            // Перевіряємо, чи новий університет еквівалентний оригінальному
            assertEquals(oldUniversity, newUniversity);
        } catch (IOException e) {
            e.printStackTrace();
            assertTrue(false); // Позначаємо тест як невдалений у разі виникнення помилки
        }
    }

    // Метод для створення зразка університету з потрібною структурою
    private University createSampleUniversity() {
        University university = new University("Sample University");

        // Створюємо факультети
        Faculty faculty1 = new Faculty("Faculty 1");
        Faculty faculty2 = new Faculty("Faculty 2");

        // Створюємо кафедри
        Department department1 = new Department("Department 1");
        Department department2 = new Department("Department 2");
        Department department3 = new Department("Department 3");

        // Створюємо студентів
        Student student1 = StudentCreator.createStudent("John", "Doe", "Smith", Sex.MALE, "CS101");
        Student student2 = StudentCreator.createStudent("Alice", "Johnson", "Marshall", Sex.FEMALE, "ME101");
        Student student3 = StudentCreator.createStudent("Bob", "Smith", "Brown", Sex.MALE, "CE101");

        // Додаємо кафедри до факультетів
        faculty1.addDepartment(department1);
        faculty1.addDepartment(department2);
        faculty2.addDepartment(department3);

        // Додаємо студентів на кафедри
        department1.addStudent(student1);
        department2.addStudent(student2);
        department3.addStudent(student3);

        // Додаємо факультети до університету
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        return university;
    }
}
