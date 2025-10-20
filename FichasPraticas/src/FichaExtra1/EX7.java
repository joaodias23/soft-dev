package FichaExtra1;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, positive = 0, negative = 0;

        System.out.print("Pick a numb: ");
        choice = input.nextInt();


        while (choice != 0) {
            if (choice > 0) {
                positive++;
            } else {
                negative++;
            }

            System.out.print("Pick anotha: ");
            choice = input.nextInt();
        }

        System.out.println("Negative numbers: " + negative);
        System.out.println("Positive numbers: " + positive);

    }
}