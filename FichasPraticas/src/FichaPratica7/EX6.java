package FichaPratica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) throws FileNotFoundException {

    int biggest = 0;

    File file = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/exercicio_06.txt");

    Scanner sc = new Scanner(file);

    String line;

    while(sc.hasNextLine()) {
        line = sc.nextLine();
        String [] nameAges = line.split(",");
        for (int i = 0; i < nameAges.length; i++) {
            if (i % 2 != 0) {
                if(Integer.parseInt(nameAges[i]) > biggest) {
                    biggest = Integer.parseInt(nameAges[i]);
                }
            }
        }
    }

    System.out.println(biggest);

    sc.close();
    }
}
