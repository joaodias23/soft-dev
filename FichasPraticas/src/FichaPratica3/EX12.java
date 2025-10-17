package FichaPratica3;

import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0;
        double num;

        do {
            System.out.print("Introduza um numero: ");
            num = input.nextInt();
            if (num >= 0 && num <= 25) {
                counter1++;
            } else if (num >= 26 && num <= 50) {
                counter2++;
            } else if (num >= 51 && num <= 75) {
                counter3++;
            } else if (num >= 76 && num <= 100) {
                counter4++;
            }
        }
        while (num >= 0);

        System.out.println("[00,25]: " + counter1);
        System.out.println("[26,50]: " + counter2);
        System.out.println("[51,75]: " + counter3);
        System.out.println("[76,100]: " + counter4);
    }
}
