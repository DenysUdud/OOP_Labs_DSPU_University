package Lab_09_2;


class Binary extends Number<String> {
    public Binary(String value) {
        super(value);
    }

    public Binary concatenate(Binary other) {
        String result = this.getValue() + other.getValue();
        return new Binary(result);
    }

    @Override
    public String add(String other) {
        String result = this.getValue() + other;
        return result;
    }

    @Override
    public String subtract(String other) {
        // Реалізація віднімання
        return null;
    }
}