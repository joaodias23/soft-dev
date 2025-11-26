package EX3.Pizzaria;

import EX3.Enums.UnidadeMedida;

public class Ingrediente {
    protected int codigo;
    protected String nome;
    protected UnidadeMedida unidadeMedida;
    protected double calorias;

    //5kcal - GRAMA; 15kcal - LITRO; 35kcal - UNIDADE

    public Ingrediente(int codigo, String nome, UnidadeMedida unidadeMedida, double calorias) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.calorias = calorias;
    }

    public String getNome() {
        return nome;
    }
}
