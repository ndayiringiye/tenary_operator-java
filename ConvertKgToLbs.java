
import java.util.Scanner;

public class ConvertKgToLbs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kg;
        double lbsPerkg = 2.20462;
        Double pounds;
        System.out.print("Enter weight in kilograms:");
        kg = scanner.nextInt();

        pounds = kg * lbsPerkg;
        System.out.printf("%.2f k = %.2f lbs",kg, pounds);
        scanner.close();
    }
}
