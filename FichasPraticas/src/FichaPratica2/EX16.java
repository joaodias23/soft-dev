package FichaPratica2;

import java.util.Scanner;

public class EX16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare variables, amount, and notes
        int amount, sum;
        int note200 = 0, note100 = 0, note50 = 0, note20 = 0, note10 = 0, note5 = 0;
        // get user input for amount which is a multiple of 5
        System.out.print("Introduce amount: ");
        amount = input.nextInt();
        // print user input

        // if statement for each note, divide amount for notes, and the remainder goes to the amount update
        if (amount >= 200) {
            note200 = amount / 200;
            amount = amount % 200;
            System.out.println("200s: " + note200);
        }
        if (amount >= 100) {
            note100 = amount / 100;
            amount = amount % 100;
            System.out.println("100s: " + note100);
        }
        if (amount >= 50) {
            note50 = amount / 50;
            amount = amount % 50;
            System.out.println("50s: " + note50);
        }
        if (amount >= 20) {
            note20 = amount / 20;
            amount = amount % 20;
            System.out.println("20s: " + note20);
        }
        if (amount >= 10) {
            note10 = amount / 10;
            amount = amount % 10;
            System.out.println("10s: " + note10);
        }
        if (amount >= 5) {
            note5 = amount / 5;
            amount = amount % 5;
            System.out.println("5s: " + note5);
        }

        sum = amount + note200 + note100 + note50 + note20 + note10 + note5;
        System.out.println("Total notes used: " + sum);
    }
}
