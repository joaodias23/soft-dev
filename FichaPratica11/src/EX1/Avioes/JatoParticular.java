package EX1.Avioes;

import EX1.Enums.Categoria;
import EX1.Enums.Instalacoes;

import java.util.ArrayList;

public class JatoParticular extends Aviao{
    private int lotacao;
    private double capacidadeBagagem;
    private Categoria categoria;
    private ArrayList<Instalacoes> instalacao;

    public JatoParticular(int numSerie, String modelo, int modeloFabrico, double peso, double comFuselagem, double envergaduraAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco, int lotacao, double capacidadeBagagem, Categoria categoria) {
        super(numSerie, modelo, modeloFabrico, peso, comFuselagem, envergaduraAsas, altCauda, numMotores, autonomia, velMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.instalacao = new ArrayList<Instalacoes>();
    }

    public void addInstalacao(Instalacoes instalacoes){
        instalacao.add(instalacoes);
    }

    public void removeInstalacao(Instalacoes instalacoes){
        instalacao.remove(instalacoes);
    }

    public void listarInstalacoes(Instalacoes instalacoes){
        for(Instalacoes instalacao : instalacao){
            System.out.println(instalacao);
        }
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("======================================================================");
        System.out.println(this.numSerie + " | " +  this.modelo + " | " + this.anoFabrico + " | " + this.categoria + " | " + this.instalacao);
        System.out.println("======================================================================");
    }
}
