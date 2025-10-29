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

        sc.close();

        return "All " + genre + " Songs";
    }

    public static void artistSearch(String artist) throws FileNotFoundException{
        File file = new File("src/FichaPratica7/FichaPratica07/exercicio_09.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        String line = sc.nextLine();

        System.out.println();

        String [] uniqueArtistNames = new String [25];

        int uniqueCount = 0;

        while(sc.hasNextLine()) {

            line = sc.nextLine();

            String [] artistNames = line.split(",");

            if (artistNames.length > 1) {
                String currentArtist = artistNames[1].trim();

                boolean exists = false;

                for (int j = 0; j < uniqueCount; j++) {
                    if (currentArtist.equalsIgnoreCase(uniqueArtistNames[j])) {
                        exists = true;
                        break;
                    }
                }

                if (!exists && uniqueCount < uniqueArtistNames.length) {
                    uniqueArtistNames[uniqueCount] = currentArtist;
                    uniqueCount++;
                }
            }
        }

        for (int i = 0; i < uniqueArtistNames.length; i++) {
            System.out.print(uniqueArtistNames[i] + " ");
        }

        System.out.println();
        System.out.print("Input here: ");

        String artistName = input.nextLine().trim();

        sc = new Scanner(file);
        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        System.out.println();

        System.out.println("Songs by " + artistName + ":");

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String[] artistNames = line.split(",");

            if (artistNames.length > 1) {
                String currentArtist = artistNames[1].trim();

                if (artistName.equalsIgnoreCase(currentArtist)) {
                    System.out.println(artistNames[0]);
                }
            }
        }

        sc.close();
    }

    public static String longestSong() throws FileNotFoundException{

        File file = new File("src/FichaPratica7/FichaPratica07/exercicio_09.csv");

        Scanner sc = new Scanner(file);

        double biggest = -1;
        String name = "";
        String artist = "";

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] lineItems = line.split(",");
            double durble = Double.parseDouble(lineItems[3].trim());
            if (durble > biggest) {
                biggest = durble;
                name = lineItems[0].trim();
                artist = lineItems[1].trim();
            }
        }
        System.out.println("Música com maior duração: " + name + " — " + artist + " [" + biggest + "]");

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
                    System.out.println();
                    System.out.println("Lista de artistas: ");
                    artistSearch("");
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
