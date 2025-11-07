package EX1;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Olhos de cobra", "Arbitragem", "Quim Tones", 306);
        Musica musica2 = new Musica("Olhos de vaca", "Cebola", "Quim Jonas", 238);
        Musica musica3 = new Musica("Olhos de cimento", "Massa", "Quim Mantos", 219);
        Musica musica4 = new Musica("Olhos de antonio mendes", "Rockalhada", "Quim Tetos", 341);
        Musica musica5 = new Musica("Olhos de cavalo", "Pop", "Quim Broas", 420);
        Musica musica6 = new Musica("Olhos de baixo", "Hip", "Quim Avacalhado", 194);

        MusicPlayer player = new MusicPlayer("Joao");

        player.adicionarMusica(musica1);
        player.adicionarMusica(musica2);
        player.adicionarMusica(musica3);
        player.adicionarMusica(musica4);
        player.adicionarMusica(musica5);
        player.adicionarMusica(musica6);

        player.imprimirRelatorio();

        player.trocarMusica(0, 5);

        System.out.println();
        player.imprimirRelatorio();

        player.removerMusica(musica3);

        System.out.println();
        player.imprimirRelatorio();

        System.out.println();
        player.duracaoTotal();
    }
}
