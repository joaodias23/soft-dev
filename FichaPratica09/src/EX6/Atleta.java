package EX6;

public class Atleta {
    private String nome;
    private String modalidade;
    private float altura;
    private float peso;
    private String paisOrigem;
    private int rankingMundial;

    public Atleta(String nome, String modalidade, float altura, float peso, String paisOrigem, int rankingMundial) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
        this.rankingMundial = rankingMundial;
    }

    public void exibirDetalhes() {
        System.out.println("\n------------------------ PESSOA ------------------------");
        System.out.println("{ " + this.nome + " , " + this.modalidade + " , " + this.altura + " , " + this.peso + " , " + this.paisOrigem + " , " + this.rankingMundial + " }");
        System.out.println("-------------------------------------------------------");
    }

    public String getPaisOrigem() {
        return this.paisOrigem;
    }
}
