package EX6;

public class Main {
    public static void main(String[] args) {

        Livro harrayPotter = new Livro("Aladin", "Joao", "terror", 12498, 1198944);

        Livro arrepios = new Livro("A minha babysitter e um vampiro", "JoaoTambem", "fantasia", 12, 1199274);

        harrayPotter.exibirDetalhes();

        arrepios.exibirDetalhes();
    }
}
