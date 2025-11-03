package FichaExtra3;

import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array = new int [15];
        int [] evenArray = new int [15];
        int counterEven = 0;

        int [] oddArray = new int [15];
        int counterOdd = 0;

        for (int i = 0; i < array.length; i++){
            System.out.print("Insira o numero no indice " + i + ": ");
            array[i] = input.nextInt();
        }

        System.out.println();

        System.out.println("Even Array:");

        for (int i = 0; i < evenArray.length; i++){
            if(array[i]%2==0){
                evenArray[counterEven] = array[i];
                counterEven++;
            }
        }

        for (int i = 0; i < counterEven; i++){
            System.out.println(evenArray[i]);
        }

        System.out.println("Odd Array:");

        for (int i = 0; i < evenArray.length; i++){
            if(!(array[i]%2==0)){
                oddArray[counterOdd] = array[i];
                counterOdd++;
            }
        }

        for (int i = 0; i < counterOdd; i++){
            System.out.println(oddArray[i]);
        }
    }
}


