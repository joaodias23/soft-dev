package FichaExtra2;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price;

        System.out.print("Introduce your price: ");
        price = input.nextInt();

        if (price > 100) {
            price *= 0.9;
            System.out.println("Price: " + price + "$ (with 10% discount)");
        } else {
            System.out.println("Price: " + price + "$ (no discount)");
        }
    }
}
