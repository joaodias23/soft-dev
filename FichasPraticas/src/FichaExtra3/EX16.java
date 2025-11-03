package FichaExtra3;

public class EX16 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {10, 20, 30},
                {100, 200, 300},
        };

        int biggest = matrix[0][0];
        int smallest = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(biggest < matrix[i][j]){
                    biggest = matrix[i][j];
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }

        System.out.println(biggest);
        System.out.println(smallest);
    }
}
