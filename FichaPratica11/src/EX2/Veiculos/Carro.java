package EX2.Veiculos;

import EX2.Enums.TipoCombustivel;
import EX2.Veiculo;

public class Carro extends Veiculo {
    private int quantidadePassageiros;

    public Carro(String marca, String modelo, String cor, int ano, int potencia, int cilindrada, TipoCombustivel combustivel, float consumoLitros100Km, int quantidadePassageiros) {
        super(marca, modelo, cor, ano, potencia, cilindrada, combustivel, consumoLitros100Km);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public void calcularCusto(TipoCombustivel combustivel, float distanciaKm){
        double total = 0;

        if(combustivel.equals(TipoCombustivel.GASOLINA)){
            total = calcularConsumo(distanciaKm) * 2.1;
        } else if (combustivel.equals(TipoCombustivel.DIESEL)){
            total = calcularConsumo(distanciaKm) * 1.95;
        } else if (combustivel.equals(TipoCombustivel.GPL)){
            total = calcularConsumo(distanciaKm) * 1.15;
        } else if (combustivel.equals(TipoCombustivel.ELETRICO)){
            total = calcularConsumo(distanciaKm) * 0.12;
        }
        System.out.println("Consumo desta viagem: " + total + "€");
    }
}
