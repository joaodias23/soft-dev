package FichaPratica2;

import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        // Scanner
        // get balance from user and ammount to credit(-) or debit(+)
        Scanner input = new Scanner(System.in);

        int balance, moveAmount, result;

        System.out.print("Please enter your balance: ");
        balance = input.nextInt();
        System.out.print("Amount to move (Positive to Debit, Negative to Credit): ");
        moveAmount = input.nextInt();

        if (moveAmount >= 0) {
            balance += moveAmount;
            System.out.println("Updated Balance: " + balance);
        } else if ((moveAmount + balance) < 0) {
            System.out.println("Error: Not Enough Balance");
        } else {
            balance += moveAmount;
            System.out.println("Updated Balance: " + balance);
        }
    }
}
