package EX1;

import EX1.Enums.Alimentacao;

public class Animal extends SerVivo{
    private boolean fome;
    private double peso;
    private int inteligencia; // | 0 a 100 |
    private Alimentacao alimentacao;
    private String barulho;

    public Animal(String nome, String especie, String pais, int idade, boolean fome, double peso, int inteligencia, Alimentacao alimentacao, String barulho) {
        super(nome, especie, pais, idade);
        this.fome = fome;
        this.peso = peso;
        this.inteligencia = inteligencia;
        this.alimentacao = alimentacao;
        this.barulho = barulho;
    }

    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    public double getPeso() {
        return peso;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public Alimentacao getAlimentacao() {
        return alimentacao;
    }

    public String getBarulho() {
        return barulho;
    }
}
