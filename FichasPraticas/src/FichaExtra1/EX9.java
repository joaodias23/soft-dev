package FichaExtra1;

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice, sum = 0;

        System.out.print("Pick a num: ");
        choice = input.nextInt();

        while (choice != 0) {
            sum += choice % 10;

            choice /= 10;
        }

        System.out.println("Sum of nums: " + sum);
    }
}
