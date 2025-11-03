package FichaExtra3;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array = new int [12];
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduza o numero no indice " + i + ": ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++)
                if(array[i] == array[j]){
                    found = true;
                }

        }

        if(!found){
            System.out.println("Nao tem :(");
        } else {
            System.out.println("Duplicado!");
        }
    }
}
