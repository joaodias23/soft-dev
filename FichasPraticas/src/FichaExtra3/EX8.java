package FichaExtra3;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o tamanho do array: ");
        int num = input.nextInt();

        int [] array = new int [num];

        System.out.println();

        for (int i = 0; i < array.length; i++){
            System.out.print("Insira o numero no indice " + i + ": ");
            array[i] = input.nextInt();
        }

        System.out.println();

        System.out.print("Que valor deseja adicionar: ");
        int addNum = input.nextInt();
        System.out.print("Index do novo valor: ");
        int newIndex = input.nextInt();

        System.out.println();

        int [] newArray = new int[num + 1];

        for (int i = 0; i < newIndex; i++){
            newArray[i] = array[i];
            System.out.println(newArray[i]);
        }

        newArray[newIndex] = addNum;
        System.out.println(newArray[newIndex]);

        for (int i = newIndex; i < newArray.length; i++){
            newArray[i] = array[i];
            System.out.println(newArray[i]);
        }
    }
}
