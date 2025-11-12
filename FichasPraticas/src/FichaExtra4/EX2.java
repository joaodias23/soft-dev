package FichaExtra4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/FichaPraticaExtraFicheiros/exercicio_01.txt");

        Scanner sc = new Scanner(file);

        String tudoPraqui = "";

        while (sc.hasNextLine()) {
            tudoPraqui += sc.nextLine() + " ";
        }

        String[] palavras = tudoPraqui.split(" ");

        String[] uniqueWords = new String[palavras.length];

        int[] countador = new int[palavras.length];

        int uniqueCount = 0;

        for (int i = 0; i < palavras.length; i++) {
            String atual = palavras[i];

            if (atual.equals("")) continue;

            int index = -1;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueWords[j].equals(atual)) {
                    index = j;
                    break;
                }
            }

            if (index != -1) {
                countador[index]++;
            } else {
                uniqueWords[uniqueCount] = atual;
                countador[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        int maior = 0;
        String maisFrequente = "";

        for (int i = 0; i < uniqueCount; i++) {
            if (countador[i] > maior) {
                maior = countador[i];
                maisFrequente = uniqueWords[i];
            }
        }

        System.out.println("Palavra mais frequente: " + maisFrequente + " (" + maior + " vezes)");

        System.out.println("\nTop 10 palavras mais frequentes:\n");

        for (int i = 0; i < 10 && i < uniqueCount; i++) {
            int indexMaximo = -1;
            int valorMaximo = 0;
            for (int j = 0; j < uniqueCount; j++) {
                if (countador[j] > valorMaximo) {
                    valorMaximo = countador[j];
                    indexMaximo = j;
                }
            }

            if (indexMaximo != -1) {
                System.out.println((i + 1) + ". " + uniqueWords[indexMaximo] + " - " + countador[indexMaximo] + " vezes");
                countador[indexMaximo] = 0;
            }
        }

        sc.close();
    }
}
