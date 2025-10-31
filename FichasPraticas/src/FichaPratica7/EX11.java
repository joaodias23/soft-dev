package FichaPratica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) throws FileNotFoundException {

        String [] months = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
                            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        File file = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/exercicio_11.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        if(sc.hasNextLine()){
            sc.nextLine();
        }

        System.out.print("Mes dos eventos: ");
        String mes = input.next();

        boolean found = false;

        while(sc.hasNextLine()){
            String line = sc.nextLine();

            String [] linhaMes = line.split(",");

            if (linhaMes[2].equalsIgnoreCase(mes)) {
                System.out.println("Evento: " + linhaMes[0]);
                found = true;
            }
        }

        if(!found){
            System.out.println("nao ha eventos lol");
        }
    }
}
