package EX2;

public class Personagem extends Entidade{
    private int nivel;
    private Categoria categoria;
    private String arma;

    public Personagem(String nome, double vida, double forca, int nivel, Categoria categoria, String arma) {
        super(nome, vida, forca);
        this.nivel = nivel;
        this.categoria = categoria;
        this.arma = arma;
    }

    public void atacar(NPC npc){
        while (this.vida > 0 && npc.vida > 0){
            npc.vida -= this.forca;

            this.vida -= npc.forca;
        }

        if(this.vida <= 0){
            System.out.println("O heroi moriu :(");
        } else {
            System.out.println("O npc " + npc.getNome() + " moriu :)");
            this.nivel++;
            this.vida = this.vida + (this.vida * 0.1);
            this.forca = this.forca + (this.forca * 0.1);
        }
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nivel=" + nivel +
                ", categoria=" + categoria +
                ", arma='" + arma + '\'' +
                ", nome='" + nome + '\'' +
                ", vida=" + vida +
                ", forca=" + forca +
                '}';
    }
}
