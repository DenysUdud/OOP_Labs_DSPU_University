package Lab_08_2;


abstract class Integer {
    protected int[] digits;

    public Integer(int[] digits) {
        this.digits = digits;
    }

    public abstract Integer add(Integer other);
    public abstract Integer subtract(Integer other);
    public abstract void display();

    protected void normalizeDigits() {
        // Remove leading zeros
        int i = digits.length - 1;
        while (i > 0 && digits[i] == 0) {
            i--;
        }
        int[] normalizedDigits = new int[i + 1];
        System.arraycopy(digits, 0, normalizedDigits, 0, i + 1);
        digits = normalizedDigits;
    }
}


