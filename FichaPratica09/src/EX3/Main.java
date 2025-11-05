package EX3;

public class Main {
    public static void main(String[] args) {

        String [] alimentaçãoGorila = {"erva", "plantas", "folhas"};

        Animal gorila = new Animal("Abilio", "Monkey", "Africa", 159, alimentaçãoGorila, Reino.MAMIFERO);

        gorila.fazerBarulho();

        gorila.exibirDetalhes();

        gorila.comer("Picanha", 59.6);

        gorila.exibirDetalhes();

        gorila.comer("erva", 200);

        gorila.exibirDetalhes();
    }
}
