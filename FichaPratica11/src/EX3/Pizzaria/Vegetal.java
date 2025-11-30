package EX3.Pizzaria;

import EX3.Enums.OrigemIngrediente;
import EX3.Enums.TipoVegetal;
import EX3.Enums.UnidadeMedida;

public class Vegetal extends Topping{
    private TipoVegetal tipo;

    public Vegetal(int codigo, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoVegetal tipo) {
        super(codigo, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }
}
