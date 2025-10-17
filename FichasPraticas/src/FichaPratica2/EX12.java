package FichaPratica2;

import java.awt.desktop.SystemEventListener;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // declare variables
        int option;

        System.out.print("1. Create " +
                "2. Update " +
                "3. Delete " +
                "4. Leave :");
        option = input.nextInt();
        // switch case 1,2,3,4
        switch (option) {
            case 1:
                System.out.println("Create");
                break;
            case 2:
                System.out.println("Update");
                break;
            case 3:
                System.out.println("Delete");
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid!");
        }
    }
}
