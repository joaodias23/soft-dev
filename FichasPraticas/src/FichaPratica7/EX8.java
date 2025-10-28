package FichaPratica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/FichaPratica7/FichaPratica07/exercicio_08.csv");

        Scanner sc = new Scanner(file);

        String line = sc.nextLine();

        double sum = 0;

        while(sc.hasNextLine()) {
            line = sc.nextLine();
            String [] elements = line.split(",");

            for (int i = 0; i < elements.length; i++) {
                sum += Float.parseFloat(elements[2]) * Float.parseFloat(elements[3]);
            }
        }

        System.out.println("Valor total das vendas: " + sum);

    }
}
