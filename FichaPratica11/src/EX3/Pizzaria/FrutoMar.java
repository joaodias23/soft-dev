package EX3.Pizzaria;

import EX3.Enums.OrigemIngrediente;
import EX3.Enums.TipoFrutoMar;
import EX3.Enums.UnidadeMedida;

public class FrutoMar extends Topping{
    private TipoFrutoMar tipo;

    public FrutoMar(int codigo, String nome, UnidadeMedida unidadeMedida, double calorias, OrigemIngrediente origem, TipoFrutoMar tipo) {
        super(codigo, nome, unidadeMedida, calorias, origem);
        this.tipo = tipo;
    }
}
