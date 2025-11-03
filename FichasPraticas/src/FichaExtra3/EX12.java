package FichaExtra3;

import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array1 = new int [8];
        int [] array2 = new int [8];

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Introduza o indice " + i + " do array1: ");
            array1[i] = input.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print("Introduza o indice " + i + " do array2: ");
            array2[i] = input.nextInt();
        }

        int counterDuplicate = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]){
                    counterDuplicate++;
                }
            }
        }

        // mais dinamico que isto nao ha
        int [] arrayDuplicates = new int [counterDuplicate];

        int counterArray = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]){
                    arrayDuplicates[counterArray] = array1[i];
                    counterArray++;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < arrayDuplicates.length; i++){
            System.out.println(arrayDuplicates[i]);
        }
    }
}
