package Lab_07_2;

import java.util.Scanner;

class Basketball extends TeamGame {
    private int pointsScored;

    public Basketball() {
        super();
        pointsScored = 0;
    }

    public Basketball(String name, int players, int pointsScored) {
        super(name, players);
        this.pointsScored = pointsScored;
    }

    public Basketball(Basketball basketball) {
        super(basketball);
        this.pointsScored = basketball.pointsScored;
    }

    public int getPointsScored() {
        return pointsScored;
    }

    public void setPointsScored(int pointsScored) {
        this.pointsScored = pointsScored;
    }

    @Override
    public void play() {
        System.out.println("Playing basketball");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Points scored: " + pointsScored);
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of points scored: ");
        pointsScored = scanner.nextInt();
    }
}


