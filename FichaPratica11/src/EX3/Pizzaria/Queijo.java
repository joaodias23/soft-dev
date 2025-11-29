package EX3.Pizzaria;

import EX3.Enums.OrigemIngrediente;
import EX3.Enums.TipoQueijo;
import EX3.Enums.UnidadeMedida;

public class Queijo extends Topping{
    private TipoQueijo tipo;

    public Queijo(int codigo, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoQueijo tipo) {
        super(codigo, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }
}
