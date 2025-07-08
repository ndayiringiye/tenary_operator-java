import java.util.Scanner;
public class TenaryOperator {
    public static void main (String[] args) {
        Scanner voter = new Scanner(System.in);
        int age;
        int voteAge = 18;
        String canVote;

        System.out.print("Enter your age; ");
        age = voter.nextInt();
        canVote = (age > voteAge && age ==voteAge) ? "you can vote" : "you can not vote";
        System.out.println(canVote);
        voter.close();
        

    }
}