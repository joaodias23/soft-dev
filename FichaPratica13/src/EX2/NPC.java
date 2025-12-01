package EX2;

public class NPC extends Entidade{
    private int nivel;
    private Categoria categoria;
    private String arma;

    public NPC(String nome, double vida, double forca, int nivel, Categoria categoria, String arma) {
        super(nome, vida, forca);
        this.nivel = nivel;
        this.categoria = categoria;
        this.arma = arma;
    }


}
