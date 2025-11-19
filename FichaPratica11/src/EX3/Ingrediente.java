package EX3;

import Pizzaria.Enums.UnidadeMedida;

public class Ingrediente {
    protected int codigo;
    protected String nome;
    protected UnidadeMedida unidadeMedida;
    protected double calorias;
    protected double quantidade;
    protected double caloriasPorUnidade = quantidade * calorias;

    //5kcal - GRAMA; 15kcal - LITRO; 35kcal - UNIDADE

    public Ingrediente(int codigo, String nome, UnidadeMedida unidadeMedida, double calorias, double quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.calorias = calorias;
        this.quantidade = quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
}
