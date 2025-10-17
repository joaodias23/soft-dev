package FichaPratica1;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declare variables
        int value1, value2;
        // get user input
        System.out.print("A: ");
        value1 = input.nextInt();
        System.out.print("B: ");
        value2 = input.nextInt();
        // update a with a + b
        value1 = value1 + value2;
        // update b with a - b
        value2 = value1 - value2;
        // update a with a - b
        value1 = value1 - value2;
        // print results
        System.out.println("A: " + value1);
        System.out.println("B: " + value2);
    }
}
