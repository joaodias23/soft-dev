package FichaExtra2;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ano;

        System.out.print("Insira um ano para saber se e bissexto: ");
        ano = input.nextInt();

        if (ano % 4 == 0) {
            System.out.println("O ano e bissexto!");
        } else  {
            System.out.println("Tas tolo filho!");
        }
    }
}
