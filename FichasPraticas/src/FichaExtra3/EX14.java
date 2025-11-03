package FichaExtra3;

public class EX14 {
    public static void main(String[] args){

        int[][] matrix1 = {
                {1, 2, 3},
                {10, 20, 30},
                {100, 200, 300},
                {11, 22, 33}
        };

        int[][] matrix2 = {
                {4, 5, 6},
                {40, 50, 60},
                {400, 500, 600},
                {44, 55, 66}
        };

        int [][] sumMatrix = new int[4][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print(sumMatrix[i][j]);
            }
            System.out.println();
        }

    }
}
