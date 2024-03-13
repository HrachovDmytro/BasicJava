package org.example;


import java.util.Scanner;

public class MatrixCalculator {
    private static final int MAX_SIZE = 20;
    private static final int MIN_RANDOM = 0;
    private static final int MAX_RANDOM = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Виберіть опцію:");
            System.out.println("1. Введення матриці з клавіатури");
            System.out.println("2. Генерація матриці з випадковими числами");
            System.out.println("0. Вийти");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int[][] matrix1 = enterMatrix(scanner);
                    printMatrix(matrix1);
                    calculateAndPrintResults(matrix1);
                    break;
                case 2:
                    int[][] matrix2 = generateRandomMatrix(scanner);
                    printMatrix(matrix2);
                    calculateAndPrintResults(matrix2);
                    break;
                case 0:
                    System.out.println("Програма завершена.");
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        } while (choice != 0);
    }

    private static int[][] enterMatrix(Scanner scanner) {
        System.out.println("Введіть розмір матриці (ширина і висота, не більше " + MAX_SIZE + "):");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        if (width > MAX_SIZE || height > MAX_SIZE) {
            System.out.println("Розмір матриці перевищує допустимі межі.");
            return null;
        }

        int[][] matrix = new int[height][width];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] generateRandomMatrix(Scanner scanner) {
        System.out.println("Введіть розмір матриці (ширина і висота, не більше " + MAX_SIZE + "):");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        if (width > MAX_SIZE || height > MAX_SIZE) {
            System.out.println("Розмір матриці перевищує допустимі межі.");
            return null;
        }

        int[][] matrix = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = (int) (Math.random() * (MAX_RANDOM - MIN_RANDOM + 1) + MIN_RANDOM);
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        if (matrix == null) return;
        System.out.println("Матриця:");
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }

    private static void calculateAndPrintResults(int[][] matrix) {
        if (matrix == null) return;
        int min = matrix[0][0];
        int max = matrix[0][0];
        double sum = 0;
        double product = 1;
        int count = 0;

        for (int[] row : matrix) {
            for (int cell : row) {
                if (cell < min) min = cell;
                if (cell > max) max = cell;
                sum += cell;
                product *= cell;
                count++;
            }
        }

        double average = sum / count;
        double geometricMean = Math.pow(product, 1.0 / count);

        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє арифметичне: " + average);
        System.out.println("Середнє геометричне: " + geometricMean);
    }
}
