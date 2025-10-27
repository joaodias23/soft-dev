package FichaPratica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EX2 {
    public static void main(String[] args) throws FileNotFoundException {

        String frase = "uma mensagem";

        PrintWriter printWriter = new PrintWriter("src/FichaPratica7/FichaPratica07/exercicio_02.txt");

        printWriter.println(frase);

        printWriter.close();
    }
}
