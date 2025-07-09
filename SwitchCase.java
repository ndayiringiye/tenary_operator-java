import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int day;
        String dayName;

        System.out.print("Enter a number between 1 and 7: ");
        day = inputScanner.nextInt();

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);
        inputScanner.close();
    }
}
