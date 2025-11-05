package EX1;

public class Main {
    public static void main() {

        Carro mercedes = new Carro("Mercedes", "a140", "preto", 1994, 140, 2000, TipoCombustivel.GASOLINA, 7.5f);
        Carro bmw = new Carro("BMW", "A4", "branco", 2008, 180, 4000, TipoCombustivel.GPL, 10.5f);
        Carro seat = new Carro("SEAT", "ibiza", "preto", 2023, 260, 4500, TipoCombustivel.DIESEL, 6.5f);
        Carro pajeuteco = new Carro("peugeot", "laferrari", "vermelho", 2028, 300, 6000, TipoCombustivel.GASOLINA, 60.5f);

        System.out.println();

        mercedes.ligar();
        bmw.ligar();
        seat.ligar();
        pajeuteco.ligar();

        System.out.println();

        mercedes.corrida(bmw);
        seat.corrida(pajeuteco);

        bmw.corrida(pajeuteco);

        System.out.println();

        pajeuteco.calcularConsumo(65.0f);

    }
}
