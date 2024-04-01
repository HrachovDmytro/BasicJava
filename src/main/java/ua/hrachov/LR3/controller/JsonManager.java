package ua.hrachov.LR3.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ua.hrachov.LR3.model.University;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

// Клас JsonManager для роботи з JSON
public class JsonManager {
    private static final String FILE_PATH = "src/main/java/ua/hrachov/LR3/controller/universityJson.txt";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    // Метод для збереження університету в JSON файл
    public static void saveUniversityToJson(University university) throws IOException {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(university, writer);
        }
    }

    // Метод для зчитування університету з JSON файлу
    public static University loadUniversityFromJson() throws IOException {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            return gson.fromJson(reader, University.class);
        }
    }
}

