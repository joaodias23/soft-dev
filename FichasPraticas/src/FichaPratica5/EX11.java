package FichaPratica5;

import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matrix = new int[3][3];
        int biggest = 0, smallest = 0;

        // populates the array
        for (int i = 0; i < matrix.length; i++) {

            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print("Type number for line:");
                matrix[i][k] = input.nextInt();
            }
        }

        // prints nums
        for (int i = 0; i < matrix.length; i++) {

            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print(matrix[i][k]);
            }
            System.out.println();
        }

        // defines biggest
        for (int i = 0; i < matrix.length; i++) {

            for (int k = 0; k < matrix[0].length; k++) {
                if (matrix[i][k] > biggest) {
                    biggest = matrix[i][k];
                }
            }
        }

        // defines smaller
        for (int i = 0; i < matrix.length; i++) {

            for (int k = 0; k < matrix[0].length; k++) {
                if (matrix[i][k] < smallest) {
                    smallest = matrix[i][k];
                }
            }
        }

        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest: " + smallest);
    }
}
