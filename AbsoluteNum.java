import java.util.Scanner;

public class AbsoluteNum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNum = console.nextInt();

        System.out.printf("The absolute value of %d is " + Math.abs(userNum), userNum);

    }
}