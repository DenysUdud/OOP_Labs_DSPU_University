package Lab_07_2;

public class MainGame {
    public static void main(String[] args){
        Football football = new Football();
        football.inputInfo();
        Basketball basketball = new Basketball();
        basketball.inputInfo();

        TeamGame clonedGame = new Football((Football) football);
        clonedGame.setName("Cloned Football");

        System.out.println("\nFootball Information:");
        football.displayInfo();

        System.out.println("\nBasketball Information:");
        basketball.displayInfo();

        System.out.println("\nCloned Game Information:");
        clonedGame.displayInfo();
    }
}
