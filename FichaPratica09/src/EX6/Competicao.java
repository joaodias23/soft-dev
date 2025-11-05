package EX6;

import EX5.Pessoa;

public class Competicao {
    private String nome;
    private String pais;
    private Atleta[] listContacts;
    private int counter = 0;

    public Competicao(String nome, String pais, int tamanho) {
        this.nome = nome;
        this.pais = pais;
        this.listContacts = new Atleta[tamanho];
    }

    public void inscreverAtleta(Atleta atleta) {
        listContacts[this.counter] = atleta;
        this.counter++;
    }

    public void listarParticipantes() {
        System.out.println("\n------------------------------------------------ ATLETA ------------------------------------------------");
        for (int i = 0; i < this.listContacts.length; i++) {
            if(this.listContacts[i] != null){
                this.listContacts[i].exibirDetalhes();
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------\n\n");
    }

    public void atletasDaCasa(){
        for (int i = 0; i < this.listContacts.length; i++) {
            if(this.listContacts[i] != null) {
                if (this.listContacts[i].getPaisOrigem().equalsIgnoreCase(this.pais)) {
                    this.listContacts[i].exibirDetalhes();
                }
            }
        }
    }
}
