package FichaPratica4;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        boolean primo = true;

        System.out.print("Introduza um num: ");
        num = input.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }

        if (primo) {
            System.out.println("E primo");
        } else {
            System.out.println("E nada");
        }
    }
}
