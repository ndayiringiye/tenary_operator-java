
import java.util.Scanner;

public class TenaryTask {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int num;
        String result;
        System.out.print("Enter a number:");
        num = inputScanner.nextInt();

        result = (num > 0 ) ? "positive" : (num <0) ? "negative" : "Zero";
        System.out.println("the a number is :" + result);
        inputScanner.close();
    }
}
