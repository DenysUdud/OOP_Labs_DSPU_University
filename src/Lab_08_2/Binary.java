package Lab_08_2;

class Binary extends Integer {
    public Binary(int[] digits) {
        super(digits);
    }

    @Override
    public Integer add(Integer other) {
        if (other instanceof Binary) {
            Binary binary = (Binary) other;
            int maxLength = Math.max(digits.length, binary.digits.length);
            int[] resultDigits = new int[maxLength + 1];
            int carry = 0;
            for (int i = 0; i < maxLength; i++) {
                int digit1 = i < digits.length ? digits[i] : 0;
                int digit2 = i < binary.digits.length ? binary.digits[i] : 0;
                int sum = digit1 + digit2 + carry;
                resultDigits[i] = sum % 2;
                carry = sum / 2;
            }

            if (carry > 0) {
                resultDigits[maxLength] = carry;
            }

            return new Binary(resultDigits);
        } else {
            System.out.println("Неможливо додати числа різних типів");
            return null;
        }
    }

    @Override
    public Integer subtract(Integer other) {
        if (other instanceof Binary) {
            Binary binary = (Binary) other;
            int[] resultDigits = new int[digits.length];
            int borrow = 0;

            for (int i = 0; i < digits.length; i++) {
                int digit1 = digits[i];
                int digit2 = i < binary.digits.length ? binary.digits[i] : 0;
                int diff = digit1 - digit2 - borrow;

                if (diff < 0) {
                    diff += 2;
                    borrow = 1;
                } else {
                    borrow = 0;
                }

                resultDigits[i] = diff;
            }

            if (borrow > 0) {
                System.out.println("Перший операнд повинен бути більшим за другий");
                return null;
            }

            return new Binary(resultDigits);
        } else {
            System.out.println("Неможливо відняти числа різних типів");
            return null;
        }
    }

    @Override
    public void display() {
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}
