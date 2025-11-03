package FichaExtra3;

public class EX15 {
    public static void main(String[] args){
        int[][] matrix = {
                {432, 843},
                {103453, 654},
                {25435, 1233}
        };

        int sum = 0;
        int counter = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                counter++;
            }
        }

        double average = (double) sum / counter;

        System.out.println("Average: " + average);
    }
}
