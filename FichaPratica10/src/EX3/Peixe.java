package EX3;

public class Peixe {
    private String especie;
    private float peso;
    private int preçoKg;

    public Peixe(String especie, float peso, int preçoKg) {
        this.especie = especie;
        this.peso = peso;
        this.preçoKg = preçoKg;
    }

    public void exibirDetalhes() {
        System.out.println("\n------------------------ PESSOA ------------------------");
        System.out.println("{ " + this.especie + " , " + this.peso + " , " + this.preçoKg + " }");
        System.out.println("-------------------------------------------------------");
    }

    public float getPeso() {
        return peso;
    }

    public int getPreçoKg() {
        return preçoKg;
    }
}
