package Lab_09_2;

public class GenericsDemo {
    public static void main(String[] args) {
        // Створення об'єкту Decimal
        Decimal decimal1 = new Decimal(10);
        Decimal decimal2 = new Decimal(5);

        // Виклик методів Decimal
        Integer sum = decimal1.add(decimal2.getValue());
        Integer difference = decimal1.subtract(decimal2.getValue());
        Decimal product = decimal1.multiply(decimal2);

        // Виведення результатів
        System.out.print("Sum: ");
        System.out.println(sum);

        System.out.print("Difference: ");
        System.out.println(difference);

        System.out.print("Product: ");
        product.display();

        System.out.println();

        // Створення об'єкту Binary
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("1100");

        // Виклик методів Binary
        Binary concatenation = binary1.concatenate(binary2);
        String sumBinary = binary1.add(binary2.getValue());

        // Виведення результатів
        System.out.print("Concatenation: ");
        concatenation.display();

        System.out.print("Sum (Binary): ");
        System.out.println(sumBinary);
    }
}
