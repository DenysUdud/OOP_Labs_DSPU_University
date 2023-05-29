package Lab_04_2;

import java.util.Random;
import java.util.Scanner;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(String timeString) {
        this(timeString.split(":"));
    }

    public Time(String[] timeParts) {
        if (timeParts.length != 3) {
            System.out.println("Некоректний формат часу");
            return;
        }
        try {
            this.hour = Integer.parseInt(timeParts[0]);
            this.minute = Integer.parseInt(timeParts[1]);
            this.second = Integer.parseInt(timeParts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Некоректні значення часу");
        }
    }

    public Time(int secondsFromMidnight) {
        this.hour = secondsFromMidnight / 3600;
        this.minute = (secondsFromMidnight % 3600) / 60;
        this.second = (secondsFromMidnight % 3600) % 60;
    }

    public void addSeconds(int seconds) {
        int totalSeconds = this.toSeconds();
        totalSeconds += seconds;
        totalSeconds = (totalSeconds % 86400 + 86400) % 86400;
        this.hour = totalSeconds / 3600;
        this.minute = (totalSeconds % 3600) / 60;
        this.second = (totalSeconds % 3600) % 60;
    }

    public int toSeconds() {
        return this.hour * 3600 + this.minute * 60 + this.second;
    }

    public int toMinutes() {
        int totalSeconds = this.toSeconds();
        return (totalSeconds + 30) / 60;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            System.out.println("Некоректне значення години");
        }
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.out.println("Некоректне значення хвилини");
        }
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            System.out.println("Некоректне значення секунди");
        }
    }

    public void Init(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Некоректні значення години, хвилини або секунди");
        }
    }

    public void Init(int hour, int minute) {
        Init(hour, minute, 0);
    }

    public void Init(int hour) {
        Init(hour, 0, 0);
    }

    public void Read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть години: ");
        int hour = scanner.nextInt();
        System.out.print("Введіть хвилини: ");
        int minute = scanner.nextInt();
        System.out.print("Введіть секунди: ");
        int second = scanner.nextInt();
        this.Init(hour, minute, second);
    }

    public void Display() {
        System.out.printf("%02d:%02d:%02d%n", this.hour, this.minute, this.second);
    }
}
