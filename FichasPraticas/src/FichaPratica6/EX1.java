package FichaPratica6;

import java.util.Scanner;

public class EX1 {

    public static void fazerBarulho(String animal) {

        if (animal.equalsIgnoreCase("Cão")) {
            System.out.println("Au au au");
        } else if (animal.equalsIgnoreCase("Gato")) {
            System.out.println("Miau");
        } else if (animal.equalsIgnoreCase("Peixe")) {
            System.out.println("Glub Glub");
        } else if (animal.equalsIgnoreCase("Vaca")) {
            System.out.println("Muuuuuu");
        } else if (animal.equalsIgnoreCase("Porco")) {
            System.out.println("Oinc Oinc");
        } else {
            System.out.println("METE CAO GATO PEIXE VACA OU PORCO PAH");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String animal;

        System.out.print("Type animal: ");
        animal = input.next();

        fazerBarulho(animal);
    }
}
