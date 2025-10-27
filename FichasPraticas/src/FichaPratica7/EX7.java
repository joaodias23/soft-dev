package FichaPratica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) throws FileNotFoundException {

        int counterLines = 0, counterWords = 0;

        File file = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/exercicio_07.txt");

        Scanner sc = new Scanner(file);

        String line;

        while(sc.hasNextLine()){
            line = sc.nextLine();
            String [] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                counterWords++;
            }
            counterLines++;
        }

        System.out.println("Lines: " + counterLines + " Words: " + counterWords);

        sc.close();
    }
}
