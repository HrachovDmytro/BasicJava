package ua.hrachov.LR3.model;
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
}