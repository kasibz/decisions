import java.util.Scanner;

public class TelephoneBill {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many calls did you make this month? ");
        int calls = console.nextInt();
        double total;
        if (calls > 100) {
            total = 200;
            for (int i = 101; i < calls + 1; i++) {
                if (i <= 150)
                    total += 0.6;
                else if (i > 150 && i <= 200)
                    total += 0.5;
                else
                    total += 0.4;
            }
        } else {
            total = 200;
        }
        System.out.printf("Your monthly telephone bill is $%.2f", total);

    }
}