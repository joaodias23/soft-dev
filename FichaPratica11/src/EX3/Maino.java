package EX3;

import EX3.Enums.Tamanho;
import EX3.Enums.UnidadeMedida;
import EX3.Pizzaria.Ingrediente;
import EX3.Pizzaria.Pizza;

public class Maino {
    public static void main(String[] args) {
        Ingrediente ingrediente = new Ingrediente(255, "Arroz", UnidadeMedida.GRAMAS, 5);
        Ingrediente ingrediente1 = new Ingrediente(256, "Molho de Tomate", UnidadeMedida.LITROS, 7);
        Ingrediente ingrediente2 = new Ingrediente(257, "Salsicha", UnidadeMedida.UNIDADES, 8);

        Pizza pizzarella = new Pizza(300, "Pizolho", "Pizolho bom comó trabalho", 27.99, Tamanho.GRANDE);
        System.out.println(pizzarella.toString());
    }
}
