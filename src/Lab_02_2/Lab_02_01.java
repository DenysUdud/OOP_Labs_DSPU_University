package Lab_02_2;
// Lab_02_01.java
// Удуд Денис
// Лабораторна робота No 2 завдання 1
// Діапазон значень елементів масиву: (3,...,92) Одновимірний масив r із 26
// елементів цілого типу. Критерій – всі, крім: непарних або з індексами, кратними 7.
// Варіант 18
import java.util.Arrays;
import java.util.Random;

public class Lab_02_01 {
    public static void main(String[] args) {
        int[] r = new int[26];
        Random rand = new Random();

        // Заповнення масиву випадковими числами в заданому діапазоні
        for (int i = 0; i < r.length; i++) {
            r[i] = rand.nextInt(90) + 3;
        }

        // Виведення масиву на екран у вигляді рядка
        System.out.print("Масив: ");
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println();

        // Сортування масиву за зростанням
        Arrays.sort(r);

        // Обчислення кількості та суми елементів, які задовольняють критерій
        int count = 0;
        int sum = 0;
        for (int i = 0; i < r.length; i++) {
            if (r[i] % 2 == 0 || i % 7 == 0) {
                count++;
                sum += r[i];
            } else {
                r[i] = 0; // Заміна елемента на 0, якщо не задовольняє критерію
            }
        }

        // Виведення результатів на екран
        System.out.println("Кількість елементів, що задовольняють критерій: " + count);
        System.out.println("Сума елементів, що задовольняють критерій: " + sum);
        System.out.print("Модифікований масив: ");
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println();
    }

}
