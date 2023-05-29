package Lab_07_2;

import java.util.Scanner;

abstract class TeamGame {
    protected String name;
    protected int players;

    public TeamGame() {
        name = "";
        players = 0;
    }

    public TeamGame(String name, int players) {
        this.name = name;
        this.players = players;
    }

    public TeamGame(TeamGame teamGame) {
        this.name = teamGame.name;
        this.players = teamGame.players;
    }

    public String getName() {
        return name;
    }

    public int getPlayers() {
        return players;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public abstract void play();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Players: " + players);
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter number of players: ");
        players = scanner.nextInt();
    }
}

/*
Абстрактний клас і звичайний (конкретний) клас в Java відрізняються наступними аспектами:

Інстанціювання: Об'єкти не можуть бути створені безпосередньо з абстрактного класу, тоді як звичайні класи можуть бути інстанційовані.

Методи: Абстрактний клас може містити як абстрактні, так і конкретні методи. Абстрактний метод не має реалізації і вимагає, щоб підкласи надали йому реалізацію. Звичайні класи мають тільки конкретні методи з реалізацією.

Наслідування: Абстрактний клас може бути успадкований іншими класами, абстрактними або конкретними. Звичайний клас також може бути успадкований, але він не може успадковувати абстрактний клас.

Реалізація: Абстрактний клас може містити неповну реалізацію, тобто він може мати методи без реалізації (абстрактні методи), які потребують реалізації в підкласах. Звичайний клас має повну реалізацію всіх своїх методів.

Використання: Абстрактні класи використовуються для створення загальної структури або шаблону для підкласів, які реалізують конкретний функціонал. Вони надають поліморфізм та можуть містити загальні методи, які будуть спільними для всіх підкласів. Звичайні класи використовуються для створення конкретних об'єктів з заданими властивостями і функціоналом.

Отже, головна відмінність між абстрактним і звичайним класом полягає в тому, що а

бстрактний клас не може бути інстанційований безпосередньо і має можливість містити абстрактні методи, які потребують реалізації в підкласах.
 */

