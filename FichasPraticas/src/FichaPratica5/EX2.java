package FichaPratica5;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float [] commissions = new float [12];
        float total = 0;

        for (int i = 0; i <= 11; i++) {
            System.out.print("Insert commission for month " + i + ": ");
            commissions [i] = input.nextFloat();
        }

        for (int i = 0; i <= 11; i++) {
            total += commissions [i];
        }

        System.out.println("Total Anual: " + total);
    }
}
