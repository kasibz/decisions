import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a year: ");

        int year = console.nextInt();
        if (year % 100 == 0) {
            if (year % 400 == 0)
                System.out.printf("%d is a Leap year", year);
            else
                System.out.printf("%d is not a Leap year", year);
        } else if (year % 4 == 0)
            System.out.printf("%d is a Leap year", year);

        else
            System.out.printf("%d is not a Leap year", year);
    }
}