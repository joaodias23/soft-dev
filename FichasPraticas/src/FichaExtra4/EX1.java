package FichaExtra4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/FichaExtra4/FichaPraticaExtraFicheiros/exercicio_01.txt");

        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(file);

        // loop por fora nextline, por dentro nextword, if word = word in input then return line

        System.out.print("Que palavra queres buscar, amigo?: ");
        String word = input.next();
        boolean flag = false;

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String [] array = line.split(" ");

            String[] words = line.split("\\s+");
            if (line.toLowerCase().contains(word.toLowerCase())) {
                System.out.println(line);
                flag = true;
            }

        }

        if(!flag) {
            System.out.println("A palavra " + word + " não foi encontrada no ficheiro.");
        }

        sc.close();
        input.close();

    }
}
