package FichaPratica3;

import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        int num, current, counterCounter = 0, previous = 0;
        // get input
        System.out.print("Quantos números deseja inserir: ");
        num = input.nextInt();

        System.out.print("Introduza um numero: ");
        previous = input.nextInt();

        // looping time
        for (int i = 0; i < num - 1; i++) {
            System.out.print("Introduza um numero: ");
            current = input.nextInt();

            if (previous > current) {
                counterCounter++;
            }
            previous = current;
        }

        if (counterCounter > 0) {
            System.out.println("Não Crescente");
        } else {
            System.out.println("Crescente");
        }

    }
}
