package ua.hrachov.LR3.model;

// Клас HumanImpl, який реалізує інтерфейс Human
public class HumanImpl implements Human {
    private String name;
    private String surname;
    private String patronymic;
    private Sex sex;

    // Конструктор класу
    public HumanImpl(String name, String surname, String patronymic, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    // Реалізація методів інтерфейсу Human
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public Sex getSex() {
        return sex;
    }
}
