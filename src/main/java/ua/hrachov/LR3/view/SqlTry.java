package ua.hrachov.LR3.view;

import java.sql.*;

public class SqlTry {
    static final String JDBC_URL = "jdbc:postgresql://localhost/students_db";
    static final String USER = "dmitry";
    static final String PASSWORD = "qwerty";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            System.out.println("З'єднання з базою даних встановлено.");

            String birthMonth = "June";
            String sql = "SELECT * FROM students WHERE EXTRACT(MONTH FROM birthdate) = " +
                    "EXTRACT(MONTH FROM TIMESTAMP '" + birthMonth + "'::timestamp)";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {

                while (resultSet.next()) {
                    System.out.println("ID: " + resultSet.getInt("id"));
                    System.out.println("Прізвище: " + resultSet.getString("last_name"));
                    System.out.println("Ім'я: " + resultSet.getString("first_name"));
                    System.out.println("По батькові: " + resultSet.getString("middle_name"));
                    System.out.println("Дата народження: " + resultSet.getDate("birthdate"));
                    System.out.println("Номер залікової книжки: " + resultSet.getString("student_id"));
                    System.out.println();
                }
            } catch (SQLException e) {
                System.err.println("Помилка при виконанні запиту: " + e.getMessage());
            }

        } catch (SQLException e) {
            System.err.println("Помилка з'єднання з базою даних: " + e.getMessage());
        }
    }
}

