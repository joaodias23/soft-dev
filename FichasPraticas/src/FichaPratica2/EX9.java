package FichaPratica2;

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        // get user input for 3 numbers
        System.out.print("Number 1: ");
        num1 = input.nextInt();
        System.out.print("Number 2: ");
        num2 = input.nextInt();
        System.out.print("Number 3: ");
        num3 = input.nextInt();
        // if for each case, print menor
        if (num1 < num2 && num1 < num3) {
            System.out.println("Smallest number: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Smallest number: " + num2);
        } else {
            System.out.println("Smallest number: " + num3);
        }
    }
}
