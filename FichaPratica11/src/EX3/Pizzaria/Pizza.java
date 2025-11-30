package EX3.Pizzaria;

import EX3.Enums.Tamanho;

import java.util.ArrayList;

public class Pizza {
    private final int MAX_INGREDIENTES = 4;
    private int codigo;
    private String nome;
    private String descriçao;
    private double preco;
    private Tamanho tamanho;
    private ArrayList<IngredientePizza> ingredientes;

    public Pizza(int codigo, String nome, String descriçao, double preco, Tamanho tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descriçao = descriçao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new ArrayList<IngredientePizza>();
    }

    public void addIngrediente(IngredientePizza ingrediente) {
        Ingrediente ingre = ingrediente.getIngrediente();
        boolean temBase = false;
        int totalToppings = 0;

        for (IngredientePizza ip : ingredientes) {
            if (ip.getIngrediente() instanceof Base) {
                temBase = true;
            }
            if (ip.getIngrediente() instanceof Topping) {
                totalToppings++;
            }
        }

        if (ingre instanceof Topping && !temBase) {
            System.out.println("Não podes adicionar toppings sem uma base primeiro nabo!");
            return;
        }

        if (ingre instanceof Base && temBase) {
            System.out.println("A pizza já tem uma base. Não podes adicionar outra nabo.");
            return;
        }

        if (ingre instanceof Topping && totalToppings >= MAX_INGREDIENTES) {
            System.out.println("Já tens 4 toppings. Não podes adicionar mais toppings.");
            return;
        }

        if (ingredientes.size() >= MAX_INGREDIENTES) {
            System.out.println("Pizza tá cheia");
            return;
        }

        ingredientes.add(ingrediente);
        System.out.println(ingre.getNome() + " adicionado.");
    }

    public void editIngrediente(int idIngrediente, int novaQuantia){
        boolean found = false;

        for (IngredientePizza ingrePi : ingredientes){
            if(ingrePi.getIngrediente().codigo == idIngrediente){
                ingrePi.setQuantidade(novaQuantia);
                System.out.println("Quantidade atualizada de " + ingrePi);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Oute papaoutai");
        }
    }

    public void removeIngrediente(int idIngrediente) {
        boolean found = false;
        for (int i = 0; i < ingredientes.size(); i++) {
            if (ingredientes.get(i).getIngrediente().codigo == idIngrediente) {
                System.out.println("Ingrediente " + ingredientes.get(i).getIngrediente().getNome() + " removido");
                ingredientes.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Não encontrado.");
        }
    }

    public double calcularCalorias() {
        double total = 0;
        for (IngredientePizza ip : ingredientes) {
            total += ip.getIngrediente().calorias * ip.getQuantidade();
        }
        return total;
    }

    public void exibirDetalhes() {
        System.out.println("Pizza: " + nome);
        System.out.println("Descrição: " + descriçao);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: " + preco);
        System.out.println("Ingredientes:");
        for (IngredientePizza ip : ingredientes) {
            System.out.println("- " + ip.getIngrediente().getNome() + ": " + ip.getQuantidade() +
                    " " + ip.getIngrediente().unidadeMedida + ", " +
                    (ip.getIngrediente().calorias * ip.getQuantidade()) + " calorias");
        }
        System.out.println("Total de calorias: " + calcularCalorias());
    }

    public String getTipoPizza() {

        boolean temCarne = false;
        boolean temFrutoMar = false;
        boolean temVegetal = false;
        boolean temOutros = false;

        for (IngredientePizza ip : ingredientes) {

            Ingrediente ing = ip.getIngrediente();

            if (ing instanceof Carne) {
                temCarne = true;
            }
            else if (ing instanceof FrutoMar) {
                temFrutoMar = true;
            }
            else if (ing instanceof Vegetal) {
                temVegetal = true;
            }
            else if (ing instanceof Topping) {
                temOutros = true;
            }
        }

        if (temCarne && !temFrutoMar && !temVegetal && !temOutros) {
            return "Pizza de Carne";
        }

        if (temFrutoMar && !temCarne && !temVegetal && !temOutros) {
            return "Pizza do Mar";
        }

        if (temVegetal && !temCarne && !temFrutoMar && !temOutros) {
            return "Pizza Vegetariana";
        }

        if (temCarne && temFrutoMar && temVegetal) {
            return "Pizza De Tudo";
        }

        return "Pizza Com 4 Quartos";
    }

}