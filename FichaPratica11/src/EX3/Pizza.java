package EX3;

import Pizzaria.Enums.Tamanho;

import java.util.ArrayList;

public class Pizza {
    protected int codigo;
    protected String nome;
    protected String descriçao;
    protected double preco;
    protected Tamanho tamanho;
    protected ArrayList<Ingrediente> ingredientes;

    public Pizza(int codigo, String nome, String descriçao, double preco, Tamanho tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descriçao = descriçao;
        this.preco = preco;
        this.tamanho = tamanho;
        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
    }

    // max ingredients - 5

    public void addIngrediente(Ingrediente ingrediente) {
        while (ingredientes.size() != 5) {
            ingredientes.add(ingrediente);
            System.out.println(ingrediente.getNome() + " adicionado.");
        }
    }

    public void editQuantity(Ingrediente ingrediente, double quantidade) {
        ingrediente.setQuantidade(quantidade);
    }

    @Override
    public String toString() {
        return this.nome + " | " + this.descriçao;
    }
}

// arroz.editQuantity(arroz, 20)