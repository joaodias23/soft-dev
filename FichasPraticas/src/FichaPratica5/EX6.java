package FichaPratica5;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array = new int [10];
        boolean cresc = true;

        System.out.print("Introduza o numero desta casa: ");
        array [0] = input.nextInt();

        for (int i = 1; i < array.length; i++) {
            System.out.print("Introduza o numero desta casa: ");
            array [i] = input.nextInt();
            if (array [i] < array [i-1]){
                 cresc = false;
            }
        }

        if (cresc) {
            System.out.println("Crescente");
        } else {
            System.out.println("Nao Crescente");
        }


    }
}
