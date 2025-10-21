package FichaPratica5;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array = new int [10];
        int biggestEven = -1;

        System.out.print("Introduza o numero desta casa: ");
        array [0] = input.nextInt();
        if (array [0] % 2 == 0) {
            biggestEven = array [0];
        }

        // populate array
        for (int i = 1; i <=9; i++) {
            System.out.print("Introduza o numero desta casa: ");
            array [i] = input.nextInt();
            if (array [i] % 2 == 0) {
                if (array [i] > biggestEven){
                    biggestEven = array [i];}
            }
        }

        if (biggestEven != -1 && biggestEven > -1) {
            System.out.println("Biggest even number in the array: " + biggestEven);
        } else {
            System.out.println("There no even numbers!");
        }

    }
}
