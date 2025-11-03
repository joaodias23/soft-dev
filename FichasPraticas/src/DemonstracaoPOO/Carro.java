package DemonstracaoPOO;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private TipoCombustivel combustivel;

    public Carro(String marca, String modelo, String cor, TipoCombustivel combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void buzinar() {
        System.out.println("Buzina do " + this.marca + " " + this.cor + ": BEEP!");
    }

    public void buzinar(int numVezes) {

        for (int i = 0; i < numVezes; i++) {
            System.out.println("Buzina do " + this.marca + " " + this.cor + ": BEEP!");
        }

    }

}
