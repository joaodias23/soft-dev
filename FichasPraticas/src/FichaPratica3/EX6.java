package FichaPratica3;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        int num1, num2;

        System.out.print("Introduce num1: ");
        num1 = input.nextInt();
        System.out.print("Introduce num2: ");
        num2 = input.nextInt();
        // loop from num1 to num2
        for (int i = num1; i <= num2; i++)
            System.out.println(i);
    }
}
