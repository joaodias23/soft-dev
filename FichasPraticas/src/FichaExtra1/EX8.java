package FichaExtra1;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baseNumber, powerNumber, result = 1;

        System.out.print("Insert second num: ");
        baseNumber = input.nextInt();

        System.out.print("Insert first num: ");
        powerNumber = input.nextInt();

        for (int i = 0; i < powerNumber; i++) {
            result *= baseNumber;
        }

        System.out.println("First num: " + baseNumber);
        System.out.println("Second num: " + powerNumber);
        System.out.println("Result: " + result);

    }
}
