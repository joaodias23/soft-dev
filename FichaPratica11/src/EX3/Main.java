package EX3;

import Pizzaria.Enums.Tamanho;
import Pizzaria.Enums.UnidadeMedida;

public class Main {
    public static void main(String[] args) {
        Ingrediente ingrediente = new Ingrediente(255, "Arroz", UnidadeMedida.GRAMAS, 5, 100);
        Ingrediente ingrediente1 = new Ingrediente(256, "Molho de Tomate", UnidadeMedida.LITROS, 7, 25);
        Ingrediente ingrediente2 = new Ingrediente(257, "Salsicha", UnidadeMedida.UNIDADES, 8, 20);

        Pizza pizzarella = new Pizza(300, "Pizolho", "Pizolho bom comó trabalho", 27.99, Tamanho.GRANDE);
        System.out.println(pizzarella.toString());
        pizzarella.toString();
    }
}
