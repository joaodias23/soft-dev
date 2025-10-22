package FichaPratica6;

import java.util.Scanner;

public class EX3and4 {
    static boolean par(int num) {
        if (num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    static boolean positivo(int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean primo(int num){

        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean perfeito(int num) {
        int [] array = new int [num];
        int sum = 0;

        for (int i = 1; i < array.length; i++) {
            if (num % i == 0) {
                array[i] = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        if (num == sum) {
            return true;
        } else {
            return false;
        }
    }

    static boolean triangular(int num) {
        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum += i;
            if (num == sum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, choice;

        System.out.print("Escolha um num: ");
        num = input.nextInt();

        do {
            System.out.println("1 - Par ou Impar");
            System.out.println("2 - Positivo ou Negativo");
            System.out.println("3 - Primo ou Nao Primo");
            System.out.println("4 - Perfeito ou Nao Perfeito");
            System.out.println("5 - Triangular ou Nao Triangular");
            System.out.println("6 - Trocar de Num");
            System.out.print("Pick an option: ");
            choice = input.nextInt();

            if (choice == 1) {
                if (par(num)) {
                    System.out.println("Par");
                } else {
                    System.out.println("Impar");
                }
            }
            if (choice == 2) {
                if (positivo(num)) {
                    System.out.println("Positivo");
                } else {
                    System.out.println("Negativo");
                }
            }
            if (choice == 3) {
                if (primo(num)) {
                    System.out.println("Primo");
                } else {
                    System.out.println("Nao Primo");
                }
            }
            if (choice == 4) {
                if (perfeito(num)) {
                    System.out.println("Perfeito");
                } else {
                    System.out.println("Nao Perfeito");
                }
            }
            if (choice == 5) {
                if (triangular(num)) {
                    System.out.println("Triangular");
                } else {
                    System.out.println("Nao Triangular");
                }
            }
            if (choice == 6) {
                System.out.print("Escolha outro num: ");
                num = input.nextInt();
            }

        } while(num != 6);
    }
}
