package Lab_08_2;

public class NumbersMain {
    public static void main(String[] args) {
        int[] decimalDigits = {1, 2, 3, 4, 5};
        Decimal decimal = new Decimal(decimalDigits);

        int[] decimalDigits_2 = {1, 2, 3, 4, 5};
        Decimal decimal2 = new Decimal(decimalDigits_2);

        Integer sum = decimal.add(decimal2);
        System.out.print("Сума: ");
        sum.display();

        int[] binaryDigits = {1, 0, 1, 0, 1};
        Binary binary = new Binary(binaryDigits);

        int[] binaryDigits2 = {0, 1, 0, 0, 1};
        Binary binary2 = new Binary(binaryDigits2);

        System.out.print("Двійкове число: ");
        binary.display();
    }
}
