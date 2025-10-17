package FichaPratica3;

import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, interval;

        System.out.print("Introduza um numero filho: ");
        num = input.nextInt();

        System.out.print("Introduza um intervalo que o pai cuida: ");
        interval = input.nextInt();

        for (int i = 0; i <= num; i+=interval) {
            System.out.println(i);
        }
    }
}
