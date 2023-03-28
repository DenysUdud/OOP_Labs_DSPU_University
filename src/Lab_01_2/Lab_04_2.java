package Lab_01_2;

import java.util.Scanner;

public class Lab_04_2 {
    double x, xp, xk, dx, y;

    public Lab_04_2(){
    }

    public void processCalculations(){
        while(x <= xk){
            print_calculate_result(x);
            x += dx;
        }
    }

    // метод підраховує розвязує рівняння для певного X та виводить результати на екран
    private void print_calculate_result(double valX) {
        Lab_03_1 solver = new Lab_03_1(valX);
        y =  solver.getY();
        String toPrint = "X: " + x + " | " + "Y: " + y;
        System.out.println(toPrint);
    }

    public void getParameters_terminal(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення X початкового: ");
        xp = scanner.nextInt();

        System.out.print("Введіть значення X кіцевого: ");
        xk = scanner.nextInt();

        System.out.print("Введіть значення Кроку d: ");
        dx = scanner.nextInt();
    }

    public static void main(String[] args){
        Lab_04_2 solver = new Lab_04_2();
        solver.getParameters_terminal();
        solver.processCalculations();
    }
}
