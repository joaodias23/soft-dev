package FichaPratica6;

import java.util.Scanner;

public class EX5and6 {
    static int biggestNum(int [] array) {
        int biggest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array [i] > biggest) {
                biggest = array [i];
            }
        }
        return biggest;
    }

    static int smallestNum(int [] array) {
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array [i] < smallest) {
                smallest = array [i];
            }
        }
        return smallest;
    }

    static boolean crescente(int [] array) {
        boolean flag = true;
        int previous;

        for (int i = 1; i < array.length; i++) {
            previous = array [i - 1];
            if (array [i] < previous) {
                flag = false;
            }
        }

        if (flag) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, choice, biggest, smallest;

        System.out.print("How many nums would you like in your array? ");
        num = input.nextInt();

        int [] array = new int [num];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Input the num " + i + " for the array: ");
            array [i] = input.nextInt();
        }

        do {
            System.out.println("1. Biggest element");
            System.out.println("2. Smallest element");
            System.out.println("3. Crescente ou Nao Crescente");

            choice = input.nextInt();

            if(choice == 1) {
                biggest = biggestNum(array);
                System.out.println("Biggest element is: " + biggest);
            }
            if(choice == 2) {
                smallest = smallestNum(array);
                System.out.println("Smallest element is: " + smallest);
            }
            if(choice == 3) {
                if (crescente(array)) {
                    System.out.println("Crescente");
                } else {
                    System.out.println("Nao Crescente");
                }
            }
        } while (choice != -1);
    }
}
