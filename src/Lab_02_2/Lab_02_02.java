package Lab_02_2;
// Lab_02_01.java
// Удуд Денис
// Лабораторна робота No 2 завдання 1
// Діапазон значень елементів матриці: (-12, ..., 23)
//Матриця X розмірністю (7  6) із елементів цілого типу. Критерій – всі непарні,
//або крім від’ємних. Ключі впорядкування: ↑ ↑ | ↓ – переставляються місцями рядки
//матриці – так, щоб елементи першого стовпчика стали впорядкованими за
//зростанням; – якщо в першому стовпчику наявні однакові елементи, то
//переставляються рядки матриці – так, щоб для таких значень в першому стовпчику
//елементи другого стовпчика стали впорядкованими за зростанням; – якщо в першому
//і другому стовпчиках наявні однакові елементи, то переставляються рядки матриці –
//так, щоб для таких значень в першому і другому стовпчиках елементи четвертого
//стовпчика стали впорядкованими за спаданням.
// Варіант 18

import java.util.Arrays;
import java.util.Random;

public class Lab_02_02 {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(7, 6, -12, 23);
        System.out.println("Original matrix:");
        printMatrix(matrix);

        // Sorting the matrix according to the given criteria
        sortMatrix(matrix);

        System.out.println("Sorted matrix:");
        printMatrix(matrix);

        // Counting and summing the elements that satisfy the criteria
        int count = 0;
        int sum = 0;
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                if (isSatisfied(row[i])) {
                    count++;
                    sum += row[i];
                }
            }
        }
        System.out.println("Number of elements satisfying the criteria: " + count);
        System.out.println("Sum of elements satisfying the criteria: " + sum);
    }

    // Generates a matrix of given size with random elements within the given range
    private static int[][] generateMatrix(int rows, int cols, int min, int max) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matrix;
    }

    // Checks if the given number satisfies the criteria
    private static boolean isSatisfied(int num) {
        return num % 2 != 0 && num >= 0;
    }

    // Prints the matrix in tabular form using format specifier
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                System.out.printf("%4d", row[i]);
            }
            System.out.println();
        }
    }

    // Sorts the matrix according to the given criteria
    private static void sortMatrix(int[][] matrix) {
        Arrays.sort(matrix, (row1, row2) -> {
            // Comparing the elements of the first column
            int cmp = Integer.compare(row1[0], row2[0]);
            if (cmp != 0) {
                return cmp;
            }
            // Comparing the elements of the second column if the first column elements are equal
            cmp = Integer.compare(row1[1], row2[1]);
            if (cmp != 0) {
                return cmp;
            }
            // Comparing the elements of the fourth column if the first two columns elements are equal
            return Integer.compare(row2[3], row1[3]);
        });
    }
}