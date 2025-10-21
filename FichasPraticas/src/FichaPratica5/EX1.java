package FichaPratica5;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declarar array
        int [] array = new int [10];

        // loop each indice and ask for user input
        for (int i = 0; i <= 9; i++) {
            System.out.print("Insira um numero no array [" + i + "]: ");
            array [i] = input.nextInt();
        }

        System.out.println();

        // loop to print each indice after user input
        for (int i = 0; i <= 9; i++) {
            System.out.println(array [i]);
        }

    }
}
