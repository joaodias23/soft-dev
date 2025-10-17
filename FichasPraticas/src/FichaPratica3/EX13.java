package FichaPratica3;

import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        int num1, num2;
        // get input for 2 nums
        System.out.print("Introduza o num1: ");
        num1 = input.nextInt();
        System.out.print("Introduza o num2: ");
        num2 = input.nextInt();

        for (int i = num1 + 5; i <= num2 - 5; i+=5) {
            System.out.println(i);
        }
    }
}
