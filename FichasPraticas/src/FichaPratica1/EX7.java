package FichaPratica1;

import java.util.Scanner;
import java.util.Spliterator;

public class EX7 {
    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);
        // declare variables
        double product1, product2, product3, sum, discountedSum, finalPrice;
        // get user input for 3 items
        System.out.print("Product 1 : ");
        product1 = input.nextInt();
        System.out.print("Product 2: ");
        product2 = input.nextInt();
        System.out.print("Product 3: ");
        product3 = input.nextInt();
        // calculate sum * 0.1
        sum = product1 + product2 + product3;
        discountedSum = sum * 0.1;
        finalPrice = sum - discountedSum;
        // print result
        System.out.println("Price: " + finalPrice);
    }
}
