package Lab_01_2;
import java.math.MathContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Lab_03_1.java
// Удуд Денис
// Лабораторна робота No 3.1
// Розгалуження, задане формулою: функція однієї змінної.
// Варіант 18

public class Lab_03_1 {
    double x; // вхідний параметр
    double y; // результат обчислення виразу
    double A; // проміжний результат - функціонально стала частина виразу
    double B; // проміжний результат - функціонально змінна частина виразу
    int method; // метод розв'язку завдання

    // equation constructor
    // спосіб 1: розгалуження в скороченій формі
    public Lab_03_1(int numMethod){
        x = getParametrX();
        A = 13.5 - (2 * x);
        method = numMethod;

        switch (method){
            case 1:
                B = get_B_Method1();
                break;

            case 2:
                B = get_B_Method2();
        }
        y = A - B;
    }

    public Lab_03_1(double valX){
        x = valX;
        A = 13.5 - (2 * x);
        B = get_B_Method1();
        y = A - B;
    }

    public double getY(){
        return y;
    }

    public String toString(){
        return ("Метод розв'язання: " + method + "\nвхідний параметр: " + x + "\nпроміжний результат - функціонально стала частина виразу: " + A + "\nпроміжний результат - функціонально змінна частина виразу: " + B + "\nрезультат обчислення виразу: " + y);
    }

    public double getParametrX(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double valX = 0.0;

        try {
            System.out.print("Введіть значення X: ");
            valX = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Значення X: " + valX);

        // Визначаємо вхідний параметр X
        return valX;
    }

    public double get_B_Method1(){
        double b = 0;
        if (x <= -1){
            double exp = Math.exp(1.0); // Обчислення значення експоненти
            b = Math.pow(exp, (0.4 + x));
        }
        if (x > -1 && x < 1){
            double sinX = Math.sin(x);
            b = 1 - Math.pow(sinX, 2);
        }
        if (x >= 1){
            double cosX = Math.cos(x);
            double sinX = Math.sin(x);
            b = cosX / (1 + Math.pow(sinX, 2));
        }
        return b;
    }

    public double get_B_Method2(){
        double b = 0;
        if (x <= -1){
            double exp = Math.exp(1.0); // Обчислення значення експоненти
            b = Math.pow(exp, (0.4 + x));
        }
        else if (x > -1 && x < 1){
            double sinX = Math.sin(x);
            b = 1 - Math.pow(sinX, 2);
        }
        else {
            double cosX = Math.cos(x);
            double sinX = Math.sin(x);
            b = cosX / (1 + Math.pow(sinX, 2));
        }
        return b;
    }

    public static void main(String[] args) {
        Lab_03_1 solver18_1 = new Lab_03_1(1);
        System.out.println(solver18_1);

        Lab_03_1 solver18_2 = new Lab_03_1(2);
        System.out.println(solver18_2);
    }

}
