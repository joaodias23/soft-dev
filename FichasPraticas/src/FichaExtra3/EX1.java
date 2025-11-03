package FichaExtra3;

import java.util.Scanner;

public class EX1 {
    public static void main() {
        Scanner input = new Scanner(System.in);

        int [] array = new int [14];

        for (int i = 0; i < array.length; i++){
            System.out.print("Introduza um numero para o indice " + i + ": ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
