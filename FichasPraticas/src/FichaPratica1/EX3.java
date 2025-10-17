package FichaPratica1;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declare variables
        int length, width, area, perimeter;
        // get user input for length and width
        System.out.print("Length: ");
        length = input.nextInt();
        System.out.print("Width: ");
        width = input.nextInt();
        // calculate area and print
        area = length * width;
        System.out.println("Area: " + area);
        // calculate perimeter and print
        perimeter = (length * 2) + (width * 2);
        System.out.println("Perimeter: " + perimeter);
    }
}
