package FichaPratica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/exercicio_03_Alternativa01.txt");

        Scanner sc = new Scanner(file);

        PrintWriter printWriter = new PrintWriter("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/exercicio_new03.txt");

        while(sc.hasNextLine()) {
            String frase = sc.nextLine();
            printWriter.println(frase);
        }

        sc.close();
        printWriter.close();
    }
}
