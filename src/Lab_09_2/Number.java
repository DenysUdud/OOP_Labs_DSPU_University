package Lab_09_2;

class Number<T> implements IInterface<T> {
    private T value;

    public Number(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public T add(T other) {
        // Реалізація додавання
        return null;
    }

    @Override
    public T subtract(T other) {
        // Реалізація віднімання
        return null;
    }

    @Override
    public void display() {
        System.out.println(value);
    }
}

