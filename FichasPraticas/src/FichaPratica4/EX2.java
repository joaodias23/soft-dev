package FichaPratica4;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String create, update, delete, leave;
        int choice;

        do {
            System.out.println("1. Create");
            create = "Create";
            System.out.println("2. Update");
            update = "Update";
            System.out.println("3. Delete");
            delete = "Delete";
            System.out.println("4. Leave");
            leave = "Leaving...";

            System.out.println("Introduza a sua escolha: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println(create);
            } else if (choice == 2) {
                System.out.println(update);
            } else if (choice == 3) {
                System.out.println(delete);
            } else if (choice == 4) {
                System.out.println(leave);
            }
        }
        while(choice != 4);
    }
}
