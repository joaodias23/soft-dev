package EX1;

import EX1.Enums.Alimentacao;

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

    @Override
    public String toString() {
        String tipo = "🌍 Ser Vivo";
        if (this instanceof Animal) {
            Animal a = (Animal) this;
            tipo = "🦁 Animal";
            if (a.getAlimentacao() == Alimentacao.CARNIVORO) tipo = "🦁 Carnívoro";
            else if (a.getAlimentacao() == Alimentacao.HERBIVORO) tipo = "🦌 Herbívoro";
            else if (a.getAlimentacao() == Alimentacao.OMNIVORO) tipo = "🐻 Omnívoro";
        } else if (this instanceof Planta) {
            tipo = "🌿 Planta";
        } else if (this instanceof Insecto) {
            tipo = "🐛 Inseto";
        }

        return "┌─────────────────────────────────────────┐\n" +
                "│ " + String.format("%-39s", tipo) + "│\n" +
                "├─────────────────────────────────────────┤\n" +
                "│ Nome:    " + String.format("%-29s", nome) + "│\n" +
                "│ Espécie: " + String.format("%-29s", especie) + "│\n" +
                "│ País:    " + String.format("%-29s", pais) + "│\n" +
                "│ Idade:   " + String.format("%-29s", idade + " anos") + "│\n" +
                "└─────────────────────────────────────────┘";
    }
}
