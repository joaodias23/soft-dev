package FichaExtra1;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, biggest, smallest;

        System.out.print("Pick a num: ");
        choice = input.nextInt();

        smallest = choice;
        biggest = choice;

        while (choice != 0) {
            if (choice > biggest) {
                biggest = choice;
            } else if (choice < smallest) {
                smallest = choice;
            }

            System.out.print("Pick anotha one fool: ");
            choice = input.nextInt();
        }

        System.out.println("Smallest num: " + smallest);
        System.out.println("Biggest num: " + biggest);

    }
}
