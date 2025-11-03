package FichaExtra3;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Insira o tamanho do array: ");
        num = input.nextInt();

        int [] array = new int [num];

        System.out.println();

        for (int i = 0; i < array.length; i++){
            System.out.print("Insira o numero no indice " + i + ": ");
            array[i] = input.nextInt();
        }

        System.out.print("Que valor deseja remover: ");
        int delNum = input.nextInt();

        int [] newArray = new int[num];
        int counter = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] != delNum){
                counter++;
                newArray[counter] = array[i];
            }
        }

        System.out.println();

        for (int i = 1; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }

    }
}
