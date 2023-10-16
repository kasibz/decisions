import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNum = console.nextInt();

        String result;
        result = userNum % 2 == 0 ? "Even" : "Odd";

        System.out.printf("The number you entered is %s", result);
    }
}