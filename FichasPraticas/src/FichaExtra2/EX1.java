package FichaExtra2;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age;

        System.out.print("Your age: ");
        age = input.nextInt();

        if (age >= 18) {
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }
    }
}
