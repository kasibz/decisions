import java.util.Scanner;

public class DiscountAndRevenue {
    public static void main(String[] args) {
        // Rev = price * quantity
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a Product price: ");

        // assign variable -
        double price = console.nextDouble();

        System.out.print("Enter a quantity: ");
        int quantity = console.nextInt();

        double revenue = price * quantity;

        if (revenue > 5000) {
            double discount = revenue * 0.10;
            revenue -= discount;
            System.out.printf("10 percent discount applied of -$%.2f. Total is $%.2f", discount, revenue);
        } else {
            System.out.print(revenue);
        }

    }
}