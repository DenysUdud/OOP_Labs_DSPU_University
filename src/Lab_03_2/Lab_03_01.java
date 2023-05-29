package Lab_03_2;

import java.util.Scanner;

public class Lab_03_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перший рядок:");
        String str1 = scanner.nextLine();

        System.out.println("Введіть другий рядок:");
        String str2 = scanner.nextLine();

        // Визначення довжини рядків
        int length1 = getLength(str1);
        int length2 = getLength(str2);

        System.out.println("Довжина першого рядка: " + length1);
        System.out.println("Довжина другого рядка: " + length2);

        // Порівняння рядків
        compareStrings(str1, str2);

        // Об'єднання рядків
        String concatenatedString = concatenateStrings(str1, str2);
        System.out.println("Результат конкатенації рядків: " + concatenatedString);

        // Заміна літер 'е' зірочками '**'
        String replacedString = replaceLetterE(str1);
        System.out.println("Рядок після заміни літер 'е': " + replacedString);

        scanner.close();
    }

    // Метод для визначення довжини рядка
    public static int getLength(String str) {
        return str.length();
    }

    // Метод для порівняння рядків
    public static void compareStrings(String str1, String str2) {
        System.out.println("Порівняння рядків:");

        // Спосіб 1: Використання методу equals()
        boolean isEqual1 = str1.equals(str2);
        System.out.println("За допомогою equals(): " + isEqual1);

        // Спосіб 2: Використання оператора ==
        boolean isEqual2 = (str1 == str2);
        System.out.println("За допомогою ==: " + isEqual2);

        // Спосіб 3: Використання методу compareTo()
        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult == 0) {
            System.out.println("За допомогою compareTo(): Рядки рівні");
        } else if (comparisonResult < 0) {
            System.out.println("За допомогою compareTo(): Перший рядок передує другому");
        } else {
            System.out.println("За допомогою compareTo(): Перший рядок йде після другого");
        }
    }

    // Метод для об'єднання рядків
    public static String concatenateStrings(String str1, String str2) {
        return str1.concat(str2);
    }

    // Метод для заміни літер 'е' зірочками '**'
    public static String replaceLetterE(String str) {
        return str.replace("е", "**");
    }
}
