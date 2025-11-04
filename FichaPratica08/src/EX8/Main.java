package EX8;

public class Main {
    public static void main() {

        Produto leite = new Produto("leite", 2.99);
        Produto banana = new Produto("banana", 1.69);
        Produto cloroform = new Produto("cloroform", 43.99);

        leite.acquireStock(23);
        banana.acquireStock(67);
        cloroform.acquireStock(3);

        System.out.println();
        leite.sellProduct(10);
        leite.sellProduct(14);

        System.out.println();
        cloroform.setPrice(29.99);
        cloroform.sellProduct(2);

        leite.exibirDetalhes();
        banana.exibirDetalhes();
        cloroform.exibirDetalhes();
        System.out.println("Tudo certinho no stock.");
    }
}
