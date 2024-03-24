package ua.hrachov.LR3;

import ua.hrachov.LR3.model.*;
import ua.hrachov.LR3.controller.*;

public class Run {
    public static void main(String[] args) {
        // Створюємо університет
        University university = createTypicalUniversity();

        // Виводимо інформацію про університет
        displayUniversityInfo(university);
    }

    // Метод для створення типового університету з факультетами, кафедрами та студентами
    public static University createTypicalUniversity() {
        // Створюємо університет
        University university = new University("Example University");

        // Створюємо факультети
        Faculty scienceFaculty = FacultyCreator.createFaculty("Science");
        Faculty engineeringFaculty = FacultyCreator.createFaculty("Engineering");

        // Додаємо факультети до університету
        university.addFaculty(scienceFaculty);
        university.addFaculty(engineeringFaculty);

        // Створюємо кафедри
        Department physicsDepartment = DepartmentCreator.createDepartment("Physics");
        Department mathDepartment = DepartmentCreator.createDepartment("Mathematics");
        Department compSciDepartment = DepartmentCreator.createDepartment("Computer Science");
        Department mechEngDepartment = DepartmentCreator.createDepartment("Mechanical Engineering");
        Department civilEngDepartment = DepartmentCreator.createDepartment("Civil Engineering");

        // Додаємо кафедри до факультетів
        scienceFaculty.addDepartment(physicsDepartment);
        scienceFaculty.addDepartment(mathDepartment);
        engineeringFaculty.addDepartment(compSciDepartment);
        engineeringFaculty.addDepartment(mechEngDepartment);
        engineeringFaculty.addDepartment(civilEngDepartment);

        // Створюємо студентів
        Student student1 = StudentCreator.createStudent("John", "Doe", "Smith", Sex.MALE, "CS101");
        Student student2 = StudentCreator.createStudent("Alice", "Johnson", "Marshall", Sex.FEMALE, "ME101");
        Student student3 = StudentCreator.createStudent("Bob", "Smith", "Brown", Sex.MALE, "CE101");

        // Додаємо студентів на кафедри
        compSciDepartment.addStudent(student1);
        mechEngDepartment.addStudent(student2);
        civilEngDepartment.addStudent(student3);

        return university;
    }

    // Метод для виведення інформації про університет
    public static void displayUniversityInfo(University university) {
        System.out.println("University Name: " + university.getName());
        System.out.println("Faculties:");
        for (Faculty faculty : university.getFaculties()) {
            System.out.println("- " + faculty.getName());
            System.out.println("  Departments:");
            for (Department department : faculty.getDepartments()) {
                System.out.println("  - " + department.getName());
                System.out.println("    Students:");
                for (Student student : department.getStudents()) {
                    System.out.println("    - " + student.getName() + " " + student.getSurname());
                }
            }
        }
    }
}
