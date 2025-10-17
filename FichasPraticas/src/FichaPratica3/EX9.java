package FichaPratica3;

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        double num, media, sum = 0;

        do {
            System.out.print("Introduza um numero: ");
            num = input.nextInt();
            if (num != -1) {
                sum += num;
                counter ++;
            }
        }
        while (num != -1);

        media = sum / counter;
        System.out.println("Mean: " + media);
    }
}
