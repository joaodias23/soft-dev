package FichaPratica1;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        // Importar o Scanner
        Scanner input = new Scanner(System.in);
        // Declarar as variáveis
        int num1, num2, sum;
        // Ler num1
        System.out.print("Num1: ");
        num1 = input.nextInt();
        // Ler num2
        System.out.print("Num2: ");
        num2 = input.nextInt();
        // Calcular a soma
        sum = num1 + num2;
        // Apresentar o resultado
        System.out.println("Result: " + sum);
    }
}
