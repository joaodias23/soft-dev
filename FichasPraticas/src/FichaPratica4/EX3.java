package FichaPratica4;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, tryCounter = 0;

        System.out.print("Player 1, Pick a number between 1-100: ");
        num1 = input.nextInt();

        System.out.print("Player 2, Try to guess the number: ");
        num2 = input.nextInt();

        do {

            if (num2 < num1) {
                System.out.println("Higher!");
                System.out.print("Player 2, try again: ");
                num2 = input.nextInt();
            } else {
                System.out.println("Lower!");
                System.out.print("Player 2, try again: ");
                num2 = input.nextInt();
            }
            tryCounter++;
        }
        while(num1 != num2);
    }
}
