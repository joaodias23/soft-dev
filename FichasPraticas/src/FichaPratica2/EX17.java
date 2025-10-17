package FichaPratica2;

import java.util.Scanner;

public class EX17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // declare variables
        double saldoMedio, credit;
        // get user input for saldo medio
        System.out.print("Saldo Medio: ");
        saldoMedio = input.nextInt();
        // if saldo medio <= 2000, no credit
        if(saldoMedio <= 2000) {
            System.out.printf("Saldo Medio: %f and Credit = 0", saldoMedio);
        } else if (saldoMedio <= 4000) {
            credit = saldoMedio * 0.2;
            System.out.printf("Saldo Medio: %f and Credit = %f", saldoMedio, credit);
        } else if (saldoMedio <= 6000) {
            credit = saldoMedio * 0.3;
            System.out.printf("Saldo Medio: %f and Credit = %f", saldoMedio, credit);
        } else {
            credit = saldoMedio * 0.4;
            System.out.printf("Saldo Medio: %f and Credit = %f", saldoMedio, credit);
        }
    }
}
