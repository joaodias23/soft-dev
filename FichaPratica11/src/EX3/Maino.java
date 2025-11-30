package EX3;

import EX3.Enums.Tamanho;
import EX3.Enums.UnidadeMedida;
import EX3.Pizzaria.*;
import EX3.Enums.*;

public class Maino {
    public static void main(String[] args) {

        Base base1 = new Base(1, "Massa Tradicional", 200, BasePizza.MASSAALTA, "Massa fina e crocante");
        Carne carne1 = new Carne(2, "Frango", UnidadeMedida.GRAMAS, 50, OrigemIngrediente.NACIONAL, TipoCarne.FRANGO);
        Carne carne2 = new Carne(3, "Porco", UnidadeMedida.GRAMAS, 70, OrigemIngrediente.NACIONAL, TipoCarne.PORCO);
        FrutoMar mar1 = new FrutoMar(4, "Camarão", UnidadeMedida.GRAMAS, 40, OrigemIngrediente.NACIONAL, TipoFrutoMar.CAMARAO);
        Vegetal veg1 = new Vegetal(5, "Tomate", UnidadeMedida.GRAMAS, 10, OrigemIngrediente.NACIONAL, TipoVegetal.TOMATE);
        Vegetal veg2 = new Vegetal(6, "Cebola", UnidadeMedida.GRAMAS, 5, OrigemIngrediente.NACIONAL, TipoVegetal.CEBOLA);
        Queijo queijo1 = new Queijo(7, "Mozzarela", UnidadeMedida.GRAMAS, 60, OrigemIngrediente.NACIONAL, TipoQueijo.MOZZARELA);

        Pizza pizza1 = new Pizza(101, "Pizza Simples", "Somente frango", 8.50, Tamanho.MEDIA);
        Pizza pizza2 = new Pizza(102, "Pizza do Mar", "Somente frutos do mar", 12.00, Tamanho.GRANDE);
        Pizza pizza3 = new Pizza(103, "Pizza Vegetariana", "Só vegetais", 9.50, Tamanho.MEDIA);
        Pizza pizza4 = new Pizza(104, "Pizza Completa", "Tudo junto", 15.00, Tamanho.GRANDE);
        Pizza pizza5 = new Pizza(105, "Pizza Mista", "Mistura de tudo", 13.00, Tamanho.MEDIA);

        pizza1.addIngrediente(new IngredientePizza(base1, 1));
        pizza1.addIngrediente(new IngredientePizza(carne1, 2));
        pizza1.addIngrediente(new IngredientePizza(carne2, 1));
        pizza1.addIngrediente(new IngredientePizza(queijo1, 1));

        pizza2.addIngrediente(new IngredientePizza(base1, 1));
        pizza2.addIngrediente(new IngredientePizza(mar1, 3));

        pizza3.addIngrediente(new IngredientePizza(base1, 1));
        pizza3.addIngrediente(new IngredientePizza(veg1, 2));
        pizza3.addIngrediente(new IngredientePizza(veg2, 2));

        pizza4.addIngrediente(new IngredientePizza(base1, 1));
        pizza4.addIngrediente(new IngredientePizza(carne1, 1));
        pizza4.addIngrediente(new IngredientePizza(mar1, 1));
        pizza4.addIngrediente(new IngredientePizza(veg1, 1));

        pizza5.addIngrediente(new IngredientePizza(base1, 1));
        pizza5.addIngrediente(new IngredientePizza(carne1, 1));
        pizza5.addIngrediente(new IngredientePizza(veg1, 1));

        Pizza[] pizzas = {pizza1, pizza2, pizza3, pizza4, pizza5};

        for (Pizza p : pizzas) {
            System.out.println("==================================");
            p.exibirDetalhes();
            System.out.println("Tipo da pizza: " + p.getTipoPizza());
            System.out.println("==================================\n");
        }

        System.out.println("\n--- Teste: adicionar topping sem base ---");
        Pizza teste = new Pizza(200, "Teste sem Base", "Tentativa de adicionar topping", 5.0, Tamanho.PEQUENA);
        teste.addIngrediente(new IngredientePizza(carne1, 1));

        System.out.println("\n--- Teste: adicionar segunda base ---");
        Pizza teste2 = new Pizza(201, "Teste duas bases", "Não pode ter duas bases", 6.0, Tamanho.MEDIA);
        teste2.addIngrediente(new IngredientePizza(base1, 1));
        teste2.addIngrediente(new IngredientePizza(base1, 1));

        System.out.println("\n--- Teste: máximo 4 toppings ---");
        Pizza teste3 = new Pizza(202, "Teste 4 toppings", "Adicionar mais que 4 toppings", 7.0, Tamanho.GRANDE);
        teste3.addIngrediente(new IngredientePizza(base1, 1));
        teste3.addIngrediente(new IngredientePizza(carne1, 1));
        teste3.addIngrediente(new IngredientePizza(carne2, 1));
        teste3.addIngrediente(new IngredientePizza(veg1, 1));
        teste3.addIngrediente(new IngredientePizza(mar1, 1));
    }
}
