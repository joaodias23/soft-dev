package EX3.Pizzaria;

import EX3.Enums.OrigemIngrediente;
import EX3.Enums.UnidadeMedida;

public class Topping extends Ingrediente{
    protected OrigemIngrediente origem;

    public Topping(int codigo, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem) {
        super(codigo, nome, unidadeMedida, calorias);
        this.origem = origem;
    }
}
