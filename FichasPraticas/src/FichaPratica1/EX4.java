package FichaPratica1;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declare variables
        final double PI = 3.1415926;
        double circumference, radius;
        int diameter;
        // get user input for diameter
        System.out.print("Diameter: ");
        diameter = input.nextInt();
        // calculate radius
        radius = diameter / 2;
        // calculate circumference
        circumference = radius * radius * PI;
        // print result
        System.out.println("Circumference: " + circumference);
    }
}
