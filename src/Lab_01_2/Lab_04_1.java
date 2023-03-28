package Lab_01_2;
import java.math.MathContext;
import java.util.Scanner;
// Lab_04_1.java
// Удуд Денис
// Лабораторна робота No 3.1
// Варіант 18

public class Lab_04_1 {
    int k, N, i;
    double S;

    public Lab_04_1(){
        getParametrs();
    }

    public void getParametrs(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення k: ");
        k = scanner.nextInt();

        System.out.print("Введіть значення N: ");
        N = scanner.nextInt();

        System.out.print("Введіть значення i: ");
        i = scanner.nextInt();
    }

    public double count_print_Equation(){
        S = 0;
        i = k;
        while (i <= N){
            double cosI = Math.cos(i);
            double sinI = Math.sin(i);
            S += cosI / (1 + Math.pow(sinI, 2));
            i++;
        }
        System.out.println("While results: " + S);

        S = 0;
        i = k;
        do{
            double cosI = Math.cos(i);
            double sinI = Math.sin(i);
            S += cosI / (1 + Math.pow(sinI, 2));
            i++;
        } while (i <= N);

        System.out.println("Do-While results: " + S);

        S = 0;
        for (i=k; i <= N; i++){
            double cosI = Math.cos(i);
            double sinI = Math.sin(i);
            S += cosI / (1 + Math.pow(sinI, 2));
        }

        System.out.println("For Cycle results: " + S);

        S = 0;
        for (i=N; i >= k; i--){
            double cosI = Math.cos(i);
            double sinI = Math.sin(i);
            S += cosI / (1 + Math.pow(sinI, 2));
        }

        System.out.println("For Cycle Reverse results: " + S);
        return S;

    }

    public static void main(String[] args) {
        Lab_04_1 lab_04_1 = new Lab_04_1();
        lab_04_1.count_print_Equation();
    }
}
