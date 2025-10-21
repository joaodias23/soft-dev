package FichaPratica5;

import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matrix = new int[4][4];
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print("Type number for line: ");
                matrix[i][k] = input.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            sum += matrix[i][i];
        }

        System.out.println(sum);
    }
}
