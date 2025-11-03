package FichaExtra3;

import java.util.Scanner;

public class EX18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("No of rows: ");
        int rows = input.nextInt();

        System.out.print("No of columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Introduza o indice da matriz [" + i + "," + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println();
        System.out.println("First matrix:");
        System.out.println();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        int[][] transposedMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println();
        System.out.println("Transposed Matrix: ");
        System.out.println();

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
