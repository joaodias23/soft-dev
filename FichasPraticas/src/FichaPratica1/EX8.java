package FichaPratica1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // formato hh:mm:ss
        // declarar variaveis
        int minutes, seconds, hours;
        // get user input for minutes and seconds for 5 songs
        System.out.print("Minutos da musica 1: ");
        minutes = input.nextInt();
        System.out.print("Minutos da musica 1: ");
        seconds = input.nextInt();

        System.out.print("Minutos da musica 2: ");
        minutes += input.nextInt();
        System.out.print("Minutos da musica 2: ");
        seconds += input.nextInt();

        System.out.print("Minutos da musica 3: ");
        minutes += input.nextInt();
        System.out.print("Minutos da musica 3: ");
        seconds += input.nextInt();

        System.out.print("Minutos da musica 4: ");
        minutes += input.nextInt();
        System.out.print("Minutos da musica 4: ");
        seconds += input.nextInt();

        System.out.print("Minutos da musica 5: ");
        minutes += input.nextInt();
        System.out.print("Minutos da musica 5: ");
        seconds += input.nextInt();

        hours = minutes / 60;
        minutes = minutes % 60;
        minutes += seconds / 60;
        seconds = seconds % 60;

        // print result of hh:mm:ss
        System.out.printf("Total duration of Album: %d:%d:%d", hours, minutes, seconds);
    }
}
