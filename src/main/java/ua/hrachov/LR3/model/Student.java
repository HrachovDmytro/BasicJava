package ua.hrachov.LR3.model;

import java.util.Objects;

public class Student extends HumanImpl {
    private String group;

    // Конструктор класу
    public Student(String name, String surname, String patronymic, Sex sex, String group) {
        super(name, surname, patronymic, sex);
        this.group = group;
    }

    // Метод для отримання групи студента
    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group);
    }
}
