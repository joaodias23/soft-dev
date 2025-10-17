package FichaPratica3;

import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // loop i começa com n;
        // loop j faz n-1 n vezes;

        int num, fact = 1;

        System.out.print("Introduza um numero positivo: ");
        num = input.nextInt();

        for (int i = num - 1; i > 0; i--) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += fact;
            }
            fact += sum;
        }
        System.out.println(fact);
    }
}
