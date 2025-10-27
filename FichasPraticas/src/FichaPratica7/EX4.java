package FichaPratica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/exercicio_04.csv");

        Scanner sc = new Scanner(file);

        String line = sc.nextLine();
        System.out.println(line);

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}
