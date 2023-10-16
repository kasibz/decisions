import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the 1st angle: ");
        int first = console.nextInt();

        System.out.print("Enter the 2nd angle: ");
        int second = console.nextInt();

        System.out.print("Enter the 3rd angle: ");
        int third = console.nextInt();

        int sum = first + second + third;

        if (sum == 180)
            System.out.print("Triangle is valid");
        else
            System.out.print("Triangle is not valid");
    }
}