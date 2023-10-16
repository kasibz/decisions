import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNum = console.nextInt();
        String res;
        if (userNum > 0)
            res = "positive";
        else if (userNum < 0)
            res = "negative";
        else
            res = "zero";

        System.out.printf("%d is %s", userNum, res);
    }
}