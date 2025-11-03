package FichaExtra3;

import java.util.Scanner;

public class EX2 {
    static void main() {
        Scanner input = new Scanner(System.in);

        int [] array = new int [14];

        for (int i = 0; i < array.length; i++){
            System.out.print("Introduza um numero para o indice " + i + ": ");
            array[i] = input.nextInt();
        }

        for (int i = array.length; i > 0; i--){
            System.out.println(array[i-1]);
        }
    }
}
