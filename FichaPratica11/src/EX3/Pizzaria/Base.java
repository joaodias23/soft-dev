package EX3.Pizzaria;

import EX3.Enums.BasePizza;
import EX3.Enums.UnidadeMedida;

public class Base extends Ingrediente{
    private BasePizza tipoBase;
    private String descricao;

    public Base(int codigo, String nome, UnidadeMedida unidadeMedida, double calorias, BasePizza tipoBase, String descricao) {
        super(codigo, nome, unidadeMedida, calorias);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }
}
