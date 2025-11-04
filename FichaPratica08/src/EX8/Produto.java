package EX8;

import java.util.Scanner;

public class Produto {
    private String name;
    private double price;
    private int stockQuantity = 0;

    public Produto(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void exibirDetalhes(){
        System.out.println("\n------------------------ PRODUTO ------------------------");
        System.out.println("{ " + this.name + " , " + this.price + " , " + this.stockQuantity + " }");
        System.out.println("-------------------------------------------------------");
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getStockQuantity(){
        return this.stockQuantity;
    }

    Scanner input = new Scanner(System.in);

    public int acquireStock(int addStock){

        if (addStock <= 0) {
            System.out.println("Invalid quantity.");
        }

        System.out.print("Are you sure you want to proceed with this operation? (y/n): ");
        String answer = input.next();

        if (answer.equalsIgnoreCase("y")){
            this.stockQuantity += addStock;
            System.out.println("Stock updated to: " + this.stockQuantity);
        } else {
            System.out.println("Operation cancelled.");
        }

        return this.stockQuantity;
    }

    public int sellProduct(int sellQuantity){
        if(this.stockQuantity >= sellQuantity){
            System.out.println("Total da compra: " + this.price * sellQuantity + " paus.");
            this.stockQuantity -= sellQuantity;
        } else {
            System.out.println("\nNao ha mais, temos pena...");
        }
        return this.stockQuantity;
    }

}
