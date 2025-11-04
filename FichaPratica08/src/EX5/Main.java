package EX5;

public class Main {
    public static void main(String[] args) {

        Carro coche = new Carro("Mitsubicha", "Femme", "Rosa", 1999);
        Carro carrinho = new Carro("Bayerische Motoren Werke", "E36", "Rosinha", 1997);

        coche.ligar();
        carrinho.ligar();
    }
}
