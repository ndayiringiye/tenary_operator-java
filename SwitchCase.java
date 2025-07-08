
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int day;
        String dayName;
        System.out.print("Enter a number between 1 and  7:");
        day = inputScanner.nextInt();

        switch (day) {
            case 1:
                dayName = "monday";
                break;
            case 2:
                dayName = "teusday";
                break;
            case 3:
                dayName = "wenesday";
                break;
            case 4:
                dayName = "thusday";
                break;
            case 5:
                dayName = "friday";
                break;
            case 6:
                dayName = "saturday";
                break;
            case 7:
                dayName = "sunday";
        defualt:
        dayName = "invalid day";
        };
        System.out.println("the day is " + dayName);
        inputScanner.close();
    }
}
