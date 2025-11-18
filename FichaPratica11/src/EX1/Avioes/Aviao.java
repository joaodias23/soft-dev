package EX1.Avioes;

public class Aviao {
    protected int numSerie;
    protected String modelo;
    protected int anoFabrico;
    protected double peso;
    protected double comFuselagem;
    protected double envergaduraAsas;
    protected double altCauda;
    protected int numMotores;
    protected double autonomia;
    protected double velMax;
    protected double preco;

    public Aviao(int numSerie, String modelo, int anoFabrico, double peso, double comFuselagem, double envergaduraAsas, double altCauda, int numMotores, double autonomia, double velMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.comFuselagem = comFuselagem;
        this.envergaduraAsas = envergaduraAsas;
        this.altCauda = altCauda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velMax = velMax;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes(){
        System.out.println("======================================================================");
        System.out.println(this.numSerie + " | " +  this.modelo + " | " + this.anoFabrico);
        System.out.println("======================================================================");
    }
}
