package Lab_05_2;

public class Complex {
    private double real;
    private double imaginary;

    public Complex() {
        this(0.0, 0.0);
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(Complex complex) {
        this(complex.real, complex.imaginary);
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex add(Complex complex) {
        double newReal = this.real + complex.real;
        double newImaginary = this.imaginary + complex.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex complex) {
        double newReal = this.real * complex.real - this.imaginary * complex.imaginary;
        double newImaginary = this.real * complex.imaginary + this.imaginary * complex.real;
        return new Complex(newReal, newImaginary);
    }

    public Complex subtract(Complex complex) {
        double newReal = this.real - complex.real;
        double newImaginary = this.imaginary - complex.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex divide(Complex complex) {
        double denominator = complex.real * complex.real + complex.imaginary * complex.imaginary;
        double newReal = (this.real * complex.real + this.imaginary * complex.imaginary) / denominator;
        double newImaginary = (complex.real * this.imaginary - this.real * complex.imaginary) / denominator;
        return new Complex(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return "(" + real + ", " + imaginary + ")";
    }

    public Complex increment() {
        this.real++;
        this.imaginary++;
        return this;
    }

    public Complex decrement() {
        this.real--;
        this.imaginary--;
        return this;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(2.0, 3.0);
        Complex c2 = new Complex(4.0, 5.0);

        // Додавання
        Complex sum = c1.add(c2);
        System.out.println("Сума: " + sum);

        // Множення
        Complex product = c1.multiply(c2);
        System.out.println("Добуток: " + product);

        // Віднімання
        Complex difference = c1.subtract(c2);
        System.out.println("Різниця: " + difference);

        // Ділення
        Complex quotient = c1.divide(c2);
        System.out.println("Частка: " + quotient);

        // Інкремент
        Complex incremented = c1.increment();
        System.out.println("Інкремент: " + incremented);

        // Декремент
        Complex decremented = c1.decrement();
        System.out.println("Декремент: " + decremented);
    }
}