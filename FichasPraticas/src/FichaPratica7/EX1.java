package FichaPratica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/FichaPratica7/FichaPratica07/exercicio_01_Alternativa02.txt");
        Scanner sc = new Scanner(file);

        String line = sc.nextLine();
        System.out.println(line);

        while(sc.hasNextLine()) {
            line = sc.nextLine();
            System.out.println(line);
        }
    }
}
