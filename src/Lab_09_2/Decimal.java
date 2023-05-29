package Lab_09_2;

class Decimal extends Number<Integer> {
    public Decimal(Integer value) {
        super(value);
    }

    public Decimal multiply(Decimal other) {
        int result = this.getValue() * other.getValue();
        return new Decimal(result);
    }

    @Override
    public Integer add(Integer other) {
        int result = this.getValue() + other;
        return result;
    }

    @Override
    public Integer subtract(Integer other) {
        int result = this.getValue() - other;
        return result;
    }
}