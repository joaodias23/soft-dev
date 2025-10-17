package FichaPratica4;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, sum, sub, mult, div;
        char choice;
        String continueStatus;

        do {
            System.out.print("Introduza o numero 1: ");
            num1 = input.nextInt();
            System.out.print("Introduza o numero 2: ");
            num2 = input.nextInt();

            System.out.println("Introduza a sua escolha (+|-|*|/): ");
            choice = input.next().charAt(0);

            if (choice == 43) {
                sum = num1 + num2;
                System.out.print("Result: " + sum);
            } else if (choice == 45) {
                sub = num1 + num2;
                System.out.print("Result: " + sub);
            } else if (choice == 42) {
                mult = num1 + num2;
                System.out.print("Result: " + mult);
            } else if (choice == 47) {
                div = num1 + num2;
                System.out.print("Result: " + div);
            }

            System.out.print("Would you like to continue? (s/n)");
            continueStatus = input.next();
        }
        while(continueStatus.equalsIgnoreCase("s"));
    }
}
