package FichaExtra2;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char letter;

        System.out.print("Insira uma letra do alfabeto (MINUSCULA FILHO): ");
        letter = input.next().charAt(0);

        if (letter == 97 || letter == 101 || letter == 105 || letter == 111 || letter == 117) {
            System.out.println("Vowel!");
        } else {
            System.out.println("Consonant!");
        }
    }
}
