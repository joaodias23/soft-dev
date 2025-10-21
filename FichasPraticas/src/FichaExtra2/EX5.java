package FichaExtra2;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = 59;
        int num2;
        int tryCounter = 0;

        do {
            System.out.print("Try to guess the number: ");
            num2 = input.nextInt();
            tryCounter++;

            if (num2 < num1) {
                System.out.println("Higher!");
            } else if (num2 > num1) {
                System.out.println("Lower!");
            }

        } while (num1 != num2);

        System.out.println("Correct! You guessed the number in " + tryCounter + " attempts.");
    }
}