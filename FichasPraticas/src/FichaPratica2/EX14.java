package FichaPratica2;

import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        int num1, num2, num3;
        // get user input for 3 numbers
        System.out.print("Introduce num1: ");
        num1 = input.nextInt();
        System.out.print("Introduce num2: ");
        num2 = input.nextInt();
        System.out.print("Introduce num3: ");
        num3 = input.nextInt();
        // if print respectively
        if (num1 < num2 && num2 < num3) {
            System.out.printf("%d, %d, %d", num1, num2, num3);
        } else if (num1 < num3 && num3 < num2) {
            System.out.printf("%d, %d, %d", num1, num3, num2);
        } else if (num2 < num1 && num1 < num3) {
            System.out.printf("%d, %d, %d", num2, num1, num3);
        } else if (num2 < num3 && num3 < num1) {
            System.out.printf("%d, %d, %d", num2, num3, num1);
        } else if (num3 < num1 && num1 < num2) {
            System.out.printf("%d, %d, %d", num3, num1, num2);
        } else {
            System.out.printf("%d, %d, %d", num3, num2, num1);
        }
    }
}
