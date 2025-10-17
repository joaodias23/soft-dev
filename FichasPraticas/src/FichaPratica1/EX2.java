package FichaPratica1;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, result;

        // get two values
        System.out.print("num1: ");
        num1 = input.nextInt();

        System.out.print("num2: ");
        num2 = input.nextInt();

        // calculate sum
        result = num1 + num2;
        System.out.println("Sum: " + result);
        // calculate subtraction
        result = num1 - num2;
        System.out.println("Subtraction: " + result);
        // calculate multiplication
        result = num1 * num2;
        System.out.println("Multiplication: " + result);
        // calculate division
        result = num1 / num2;
        System.out.println("Division: " + result);
    }
}
