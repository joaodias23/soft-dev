package FichaExtra3;

import java.util.Scanner;

public class EX3 {
    static void main() {
        Scanner input = new Scanner(System.in);

        int [] array = new int [10];
        int search;
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduza o numero no indice " + i + ": ");
            array[i] = input.nextInt();
        }

        System.out.print("Numero a pesquisar: ");
        search = input.nextInt();

        for (int i = 0; i < array.length; i++) {
            if(search == array[i]){
                found = true;
            }

        }

        if(!found){
            System.out.println("Nao tem :(");
        } else {
            System.out.println("Econtrado!");
        }
    }
}
