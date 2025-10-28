package FichaPratica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX9 {

    public static String musicSearch(String genre) throws FileNotFoundException{
        File file = new File("src/FichaPratica7/FichaPratica07/exercicio_09.csv");

        Scanner sc = new Scanner(file);

        String line = sc.nextLine();

        System.out.println();

        while(sc.hasNextLine()) {
            line = sc.nextLine();
            String [] music = line.split(",");
            if (music[2].equalsIgnoreCase(genre)) {
                    System.out.println(music[0]);
            };
        }
        return "All " + genre + " Songs";
    }

    public static String artistSearch() {
        return "2";
    }

    public static String longestSong() {
        return "3";
    }

    public static String durationSearch() {
        return "4";
    }

    public static String songsNumber() {
        return "5";
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {

            System.out.println();
            System.out.println("1. Pesquisar por musicas de um determinado genero");
            System.out.println("2. Pesquisar musicas de um determinado artista");
            System.out.println("3. Pesquisar musica com maior duracao");
            System.out.println("4. Pesquisar musicas com duracao acima de um valor especificado");
            System.out.println("5. Numero de musicas no ficheiro");
            System.out.println("6. Exit");
            System.out.println();

            System.out.print("Selecione a opcao que deseja: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.print("Selecione um genero: Rock | Pop | Grunge | Heavy Metal | Folk:  ");
                    String genre = input.next();
                    System.out.println(musicSearch(genre));
                    break;
                case 2:
                    System.out.println("Selecione um artista: ");
                    System.out.println(artistSearch());
                    break;
                case 3:
                    System.out.println(longestSong());
                    break;
                case 4:
                    System.out.println(durationSearch());
                    break;
                case 5:
                    System.out.println(songsNumber());
                    break;
                default:
                    System.out.println("bruh");
            }
        } while(opcao != 6);
    }
}
