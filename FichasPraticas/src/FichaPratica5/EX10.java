package FichaPratica5;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matrix = new int[3][5];
        int num, counter = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print("Type number for line:");
                matrix[i][k] = input.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {

            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print(matrix[i][k]);
            }
            System.out.println();
        }

        System.out.print("Insira um número para pesquisar: ");
        num = input.nextInt();

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {

            for (int k = 0; k < matrix[0].length; k++) {
                if (matrix[i][k] == num) {
                    counter++;
                }
            }
        }

        System.out.print("Ha     " + counter + " posicoes na matrix com o numero " + num);

    }
}
