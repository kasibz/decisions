import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int first = console.nextInt();

        System.out.print("Enter the 2nd number: ");
        int second = console.nextInt();

        System.out.print("Enter the 3rd number: ");
        int third = console.nextInt();

        // set largest to first entry and compare to the rest
        int largest = first;
        if (second > largest)
            largest = second;
        if (third > largest)
            largest = third;

        System.out.printf("The largest number is %d", largest);
    }
}