package EX2.Veiculos;

import EX2.Enums.TipoCombustivel;
import EX2.Veiculo;

public class Camiao extends Veiculo {
    private double capacidadeCarga;

    public Camiao(String marca, String modelo, String cor, int ano, int potencia, int cilindrada, TipoCombustivel combustivel, float consumoLitros100Km, double capacidadeCarga) {
        super(marca, modelo, cor, ano, potencia, cilindrada, combustivel, consumoLitros100Km);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void viagem(float distanciaKm, int carga){
        if(carga > this.capacidadeCarga){
            System.out.println("Assim também não, é pesado.");
        } else {
            double custo = 0;
            double consumo = calcularConsumo(distanciaKm);

            if(carga >= 100){
                int cargaExtra = carga / 100;
                consumo += cargaExtra * 0.1;
                custo = consumo * 1.95;
            } else {
                custo = consumo * 1.95;
            }

            System.out.println("Consumo da viagem: " + consumo + "L");
            System.out.println("Custo da viagem: " + custo + "€");

        }
    }
}
