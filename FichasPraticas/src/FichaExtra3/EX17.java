package FichaExtra3;

import java.util.Arrays;

public class EX17 {
    public static void main(String[] args){

        int[][] matrix = {
                {1, 2, 3},
                {10, 20, 30},
                {100, 200, 300},
        };

        int total = matrix.length * matrix[0].length;
        int [] oneDimensionMatrix = new int[total];
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                oneDimensionMatrix[index] = matrix[i][j];
                index++;
            }
        }

        // easier than the fcking bubble sort I was about to pull
        Arrays.sort(oneDimensionMatrix);

        int secondSmallest = oneDimensionMatrix[1];
        int secondLargest = oneDimensionMatrix[oneDimensionMatrix.length - 2];

        System.out.println("Second smallest:: " + secondSmallest);
        System.out.println("Second biggest: " + secondLargest);
    }
}
