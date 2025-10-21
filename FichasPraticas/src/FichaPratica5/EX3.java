package FichaPratica5;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] array = new int [10];
        int bigger;

        System.out.print("Introduza o numero desta casa: ");
        array [0] = input.nextInt();
        bigger = array [0];

        for (int i = 1; i <=9; i++) {
            System.out.print("Introduza o numero desta casa: ");
            array [i] = input.nextInt();
            if (array [i] > bigger){
                bigger = array [i];}
        }

        System.out.println("Bigger number in the array: " + bigger);
    }
}
