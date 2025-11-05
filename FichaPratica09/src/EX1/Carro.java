package EX1;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel combustivel;
    private float consumoLitros100Km;

    public Carro(String marca, String modelo, String cor, int ano, int potencia, int cilindrada, TipoCombustivel combustivel, float consumoLitros100Km){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.consumoLitros100Km = consumoLitros100Km;
    }

    public void exibirDetalhes() {
        System.out.println("\n------------------------ CARRO ------------------------");
        System.out.println("{ " + this.marca + " , " + this.modelo + " , " + this.cor + " , " + this.ano + " , " + this.potencia + " , " + this.cilindrada + " , " + this.combustivel + " , " + this.consumoLitros100Km + " }");
        System.out.println("-------------------------------------------------------");
    }

    public void ligar(){
        if(this.ano < 1995) {
            if(this.combustivel.equals(TipoCombustivel.DIESEL)) {
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }
        }

        if(this.ano >= 1995){
            if(this.potencia < 250){
                System.out.println("O carro está ligado!");
                System.out.println("Vruummmmmmm");
            } else {
                System.out.println("O carro está ligado!");
                System.out.println("VRUUMMMMMM");
            }
        }
    }

    public void corrida(Carro adversario){
        if(this.potencia > adversario.potencia){
            System.out.println("Ganha o " + this.marca);
        }

        if(this.potencia < adversario.potencia){
            System.out.println("Ganha o " + adversario.marca);
        }

        if(this.potencia == adversario.potencia){
            if(this.cilindrada > adversario.cilindrada){
                System.out.println("Ganha o " + this.marca);
            }

            if(this.cilindrada < adversario.cilindrada){
                System.out.println("Ganha o " + adversario.marca);
            }

            if(this.cilindrada == adversario.cilindrada){
                if(this.ano > adversario.ano){
                    System.out.println("Ganha o " + this.marca);
                }

                if(this.ano < adversario.ano){
                    System.out.println("Ganha o " + adversario.marca);
                }

                if(this.ano == adversario.ano){
                    System.out.println("Olhem empatou, tem carros iguais, parabens.");
                }
            }
        }
    }

    public void calcularConsumo(float distanciaKm){
        System.out.println((this.consumoLitros100Km * distanciaKm / 100));
    }

}
