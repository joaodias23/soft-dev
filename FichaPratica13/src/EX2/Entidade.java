package EX2;

abstract class Entidade {
    protected String nome;
    protected double vida;
    protected double forca;

    public Entidade(String nome, double vida, double forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }
}
