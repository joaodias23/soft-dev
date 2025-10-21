package FichaPratica5;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declare variables
        int [] array = new int [10];
        int length = array.length, sum, result;

        // populate array
        for (int i = 0; i < 10; i++) {
            System.out.print("Input array num: ");
            array [i] = input.nextInt();
        }
        // arrange the sum of indexes
        sum = array [0];

        for (int i = 1; i < 10; i++) {
            sum += array [i];
        }

        // calculate the sum / .length();
        result = sum / length;
        System.out.println("Media: " + result);
    }
}
