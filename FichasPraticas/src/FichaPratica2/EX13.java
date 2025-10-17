package FichaPratica2;

import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables
        int hours, minutes;

        // user input for hours
        System.out.print("Hours: ");
        hours = input.nextInt();
        // user input for minutes
        System.out.print("Minutes: ");
        minutes = input.nextInt();
        // if hour > 12 , hour - 12 && print PM
        if (hours > 12) {
            hours -= 12;
            System.out.printf("%d:%dPM", hours, minutes);
        }
        // else, hour = hour && print AM
        else {
            System.out.printf("%d:%dAM", hours, minutes);
        }

    }
}
