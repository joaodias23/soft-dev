package EX2;

import EX2.Enums.TipoCombustivel;
import EX2.Veiculos.Camiao;
import EX2.Veiculos.Carro;
import EX2.Veiculos.Mota;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", "Preto", 2020, 120, 1600, TipoCombustivel.GASOLINA, 6.5f, 5);
        Mota mota = new Mota("Yamaha", "MT-07", "Azul", 2021, 75, 689, TipoCombustivel.GPL, 4.3f);
        Camiao camiao = new Camiao("Mercedes", "Actros", "Branco", 2019, 450, 12000, TipoCombustivel.DIESEL, 30.0f, 18000);

        System.out.println("========================================================================");
        carro.calcularCusto(carro.combustivel, 100);
        System.out.println("========================================================================");
        mota.imagem();
        System.out.println("========================================================================");
        camiao.viagem(500, 200);
        System.out.println("========================================================================");

    }
}
