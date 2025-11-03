package FichaExtra3;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("How many numbers do you want in your array? ");
        number = input.nextInt();

        int [] array = new int [number];

        System.out.println();

        for (int i = 0; i < array.length; i++){
            System.out.print("Introduza o numero no indice " + i + ": ");
            array[i] = input.nextInt();
        }

        System.out.println();

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
