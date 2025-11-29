package EX3.Pizzaria;

import EX3.Enums.OrigemIngrediente;
import EX3.Enums.TipoCarne;
import EX3.Enums.UnidadeMedida;

public class Carne extends Topping{
    private TipoCarne tipo;

    public Carne(int codigo, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoCarne tipo) {
        super(codigo, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }
}
