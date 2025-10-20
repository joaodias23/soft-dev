package FichaExtra1;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, reversed= 0, digit;

        System.out.print("Pick a num: ");
        number = input.nextInt();


        while (number != 0) {
            digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.print("Inverted num: " + reversed);
    }
}
