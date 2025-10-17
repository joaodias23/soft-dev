package FichaPratica3;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Introduza um numero filho: ");
        num = input.nextInt();

        for (int i = 2; i <= num; i+=2) {
            System.out.println(i);
        }

    }
}
