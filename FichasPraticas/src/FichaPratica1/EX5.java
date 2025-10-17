package FichaPratica1;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declare variables
        double average, weightedAverage;
        int val1, val2, val3;
        // get user input
        System.out.print("Value 1: ");
        val1 = input.nextInt();
        System.out.print("Value 2: ");
        val2 = input.nextInt();
        System.out.print("Value 3: ");
        val3 = input.nextInt();
        // calculate average
        average = (val1 + val2 + val3) / 3;
        // calculate weighted average
        weightedAverage = (val1*0.2) + (val2*0.3) + (val3*0.5);
        // print results
        System.out.println("Average: " + average);
        System.out.println("Weighted Average: " + weightedAverage);
    }
}
