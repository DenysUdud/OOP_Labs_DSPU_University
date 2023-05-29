package Lab_04_2;

public class makeTime {

    public Time makeTime(Object input) {
        if (input instanceof String) {
            String timeString = (String) input;
            if (isValidTimeString(timeString)) {
                return new Time(timeString);
            }
        } else if (input instanceof Integer) {
            int seconds = (int) input;
            if (isValidSeconds(seconds)) {
                return new Time(seconds);
            }
        } else if (input instanceof Time) {
            Time time = (Time) input;
            return new Time(time.getHour(), time.getSecond(), time.getMinute());
        }
        return null;
    }

    private static boolean isValidTimeString(String timeString) {
        String[] timeParts = timeString.split(":");
        if (timeParts.length != 3) {
            return false;
        }
        try {
            int hour = Integer.parseInt(timeParts[0]);
            int minute = Integer.parseInt(timeParts[1]);
            int second = Integer.parseInt(timeParts[2]);
            return isValidTime(hour, minute, second);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isValidSeconds(int seconds) {
        return (seconds >= 0 && seconds < 86400);
    }

    private static boolean isValidTime(int hour, int minute, int second) {
        return (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60);
    }

    public static void main(String[] args) {
        // Приклади перевірки
        String timeString = "23:59:59";
        int seconds = 86399;
        Time time = new Time(23, 59, 59);

        System.out.println(isValidTimeString(timeString));  // Виведе true
        System.out.println(isValidSeconds(seconds));  // Виведе true

        String invalidTimeString = "25:00:00";
        int invalidSeconds = 100000;
        Time invalidTime = new Time(25, 0, 0);
    }
}
