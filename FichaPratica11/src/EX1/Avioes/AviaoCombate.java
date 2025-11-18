package EX1.Avioes;

import EX1.Enums.Armas;

import java.util.ArrayList;

public class AviaoCombate extends Aviao{
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Armas> armas;

    public AviaoCombate(int numSerie, String modelo, int modeloFabrico, double peso, double comFuselagem, double envergaduraAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, modeloFabrico, peso, comFuselagem, envergaduraAsas, altCauda, numMotores, autonomia, velMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.armas = new ArrayList<Armas>();
    }

    public void addArma(Armas arminha){
        if(armas.size()<3){
            armas.add(arminha);
            System.out.println("Arma adicionada com sucesso, trrrr trrrr");
        } else{
            System.out.println("Ta cheio");
        }

    }

    public void removeArma(Armas arminha){
        armas.remove(arminha);
    }

    public void listarArma(Armas arminha){
        for(Armas arma : armas){
            System.out.println(arma);
        }
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("======================================================================");
        System.out.println(this.numSerie + " | " +  this.modelo + " | " + this.anoFabrico + " | " + this.paisOrigem + " | " + this.armas);
        System.out.println("======================================================================");
    }
}
