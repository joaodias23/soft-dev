package FichaPratica5;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {

            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print("Type number for line:");
                matrix[i][k] = input.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {

            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print(matrix[i][k]);
            }
            System.out.println();
        }
    }
}
