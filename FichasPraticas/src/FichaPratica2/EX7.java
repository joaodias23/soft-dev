package FichaPratica2;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Number: ");
        num = input.nextInt();
        // get user input on num

        if (num % 2 == 0) {
            System.out.println("Even!");
        }
        else {
            System.out.println("Odd!");
        }
    }
}
