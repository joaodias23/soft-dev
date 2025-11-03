package FichaExtra3;

import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array = new int [10];
        int [] ordenadoArray = new int [10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira o numero no index " + i + ": ");
            array[i] = input.nextInt();
            ordenadoArray[i] = array[i];
        }

        System.out.println();

        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1 - i; j++){
                if(ordenadoArray[j] > ordenadoArray[j + 1]){
                    int temp = ordenadoArray[j];
                    ordenadoArray[j] = ordenadoArray[j + 1];
                    ordenadoArray[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(ordenadoArray[i]);
        }
    }
}
