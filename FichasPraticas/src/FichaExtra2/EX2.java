package FichaExtra2;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float weight;

        System.out.print("Your weight: ");
        weight = input.nextInt();

        if (weight > 0.0) {
            weight *= 0.16;
            System.out.println("Your weight on the moon is: " + weight + "kg");
        }
    }
}
