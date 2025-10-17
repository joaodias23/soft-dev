package FichaPratica3;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Introduza um num: ");
        num = input.nextInt();

        for (int i = num - 5; i <= num + 5; i++) {
            if (i != num) {
                System.out.println(i);
            } else {
                System.out.println();
            }
        }
    }
}
