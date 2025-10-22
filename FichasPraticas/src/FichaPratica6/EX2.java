package FichaPratica6;

import java.util.Scanner;

public class EX2 {
    public static void asterisk(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        do {
            System.out.print("Input a positive number: ");
            number = input.nextInt();
        } while (number < 0);


        asterisk(number);
    }
}
