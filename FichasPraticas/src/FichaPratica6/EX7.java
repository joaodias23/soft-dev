package FichaPratica6;

import java.util.Scanner;

public class EX7 {
    static void drawSquare(char letter, int lines, int cols) {
        for (int i = 0; i < lines; i++) {
            if (i == 0 || i == lines - 1) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(letter);
                }
            }
            else {
                for (int k = 0; k < cols; k++) {
                    if (k == 0 || k == cols - 2) {
                        System.out.print(letter);
                    }
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char letter;
        int lines, cols;

        System.out.print("Introduza um char: ");
        letter = input.next().charAt(0);
        System.out.print("Introduza o numero de linhas: ");
        lines = input.nextInt();
        System.out.print("Introduza o numero de colunas: ");
        cols = input.nextInt();

        drawSquare(letter, lines, cols);
    }
}
