package FichaPratica3;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declarar variaveis
        int num;

        System.out.print("Introduce the num: ");
        num = input.nextInt();
        // for desde 0 ate numero inputted
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
}
