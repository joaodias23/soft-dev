package EX1;

public class Musica {
    private String title;
    private String genre;
    private String artist;
    private int duration;

    public Musica(String title, String genre, String artist, int duration) {
        this.title = title;
        this.genre = genre;
        this.artist = artist;
        this.duration = duration;
    }

    public void exibirDetalhes() {
        System.out.println("\n------------------------ PESSOA ------------------------");
        System.out.println("{ " + this.title + " , " + this.genre + " , " + this.artist + " , " + this.duration + " }");
        System.out.println("-------------------------------------------------------");
    }

    public int getDuration() {
        return duration;
    }
}
