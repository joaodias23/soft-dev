package FichaPratica2;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declare variables
        int num1, num2;
        // get user input for two values
        System.out.print("Number 1: ");
        num1 = input.nextInt();
        System.out.print("Number 2:");
        num2 = input.nextInt();
        // if statement
        if (num1 > num2) {
            System.out.print("Bigger number: " + num1);
        }
        else {
            System.out.print("Bigger number: " + num2);
        }
    }
}
