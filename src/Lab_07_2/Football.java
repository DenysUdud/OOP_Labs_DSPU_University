package Lab_07_2;

import java.util.Scanner;

class Football extends TeamGame {
    private int goalsScored;

    public Football() {
        super();
        goalsScored = 0;
    }

    public Football(String name, int players, int goalsScored) {
        super(name, players);
        this.goalsScored = goalsScored;
    }

    public Football(Football football) {
        super(football);
        this.goalsScored = football.goalsScored;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    @Override
    public void play() {
        System.out.println("Playing football");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Goals scored: " + goalsScored);
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of goals scored: ");
        goalsScored = scanner.nextInt();
    }
}
