package FichaPratica5;

import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] array1 = new int [10];
        int [] array2 = new int [10];

        // populate arrays
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Insira numero no array1: ");
            array1[i] = input.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Insira numero no array2: ");
            array2[i] = input.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }

        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array2[i]);
        }

    }
}
