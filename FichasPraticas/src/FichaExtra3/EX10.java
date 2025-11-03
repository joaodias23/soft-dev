package FichaExtra3;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array = new int [12];
        int [] newArray = new int[12];

        System.out.println();

        for (int i = 0; i < array.length; i++){
            System.out.print("Insira o numero no indice " + i + ": ");
            array[i] = input.nextInt();
            newArray[i] = array[i];
        }

        int counter = 0;

        for (int i = 0; i < array.length; i++){
            boolean exists = false;
            for (int j = 0; j < counter; j++) {
                if (array[i] == newArray[j]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                newArray[counter] = array[i];
                counter++;
            }
        }

        System.out.println();

        for (int i = 0; i < counter; i++){
            System.out.println(newArray[i]);
        }
    }
}
