package EX1;

public class Main {
    public static void main() {

        Carro mercedes = new Carro("Mercedes", "a140", "preto", 1994, 140, 2000, TipoCombustivel.GASOLINA, 7.5f);
        Carro bmw = new Carro("BMW", "A4", "branco", 2008, 180, 4000, TipoCombustivel.GPL, 10.5f);
        Carro seat = new Carro("SEAT", "ibiza", "preto", 2023, 260, 2000, TipoCombustivel.DIESEL, 6.5f);

        mercedes.ligar();
        bmw.ligar();
        seat.ligar();


    }
}
