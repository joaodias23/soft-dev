package EX1;

public class SerVivo {
    protected String nome;
    protected String especie;
    protected String pais;
    protected int idade;

    public SerVivo(String nome, String especie, String pais, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
}
