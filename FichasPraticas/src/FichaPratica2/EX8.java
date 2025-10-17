package FichaPratica2;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);
        // Declare variables
        double nota1, nota2, nota3, weightedAverage;
        // get user input
        System.out.print("Nota 1: ");
        nota1 = input.nextInt();
        System.out.print("Nota 2: ");
        nota2 = input.nextInt();
        System.out.print("Nota 3: ");
        nota3 = input.nextInt();
        // calcular media ponderada: 1-25% 2-35% 3-40%
        weightedAverage = nota1*0.25 + nota2*0.35 + nota3*0.4;
        // if nota > 9.5 passou else nao
        if (weightedAverage > 9.5) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Nao Aprovado!");
        }
    }
}
