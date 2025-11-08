package EX3;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCargaKg;
    private Marca marca;
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscoPescado;

    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCargaKg, Marca marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.marca = marca;
        this.peixesPescados = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }

    public void pescarPeixe(Peixe peixe){
        double pesoAtual = 0;

        for (Peixe p : peixesPescados) pesoAtual += p.getPeso();
        for (Marisco m : mariscoPescado) pesoAtual += m.getPeso();

        if (pesoAtual + peixe.getPeso() <= capacidadeCargaKg) {
            peixesPescados.add(peixe);
        } else {
            System.out.println("Muito pesado");
        }
    }

    public void pescarMarisco(Marisco marisco){
        double pesoAtual = 0;

        for (Peixe p : peixesPescados) pesoAtual += p.getPeso();
        for (Marisco m : mariscoPescado) pesoAtual += m.getPeso();

        if (pesoAtual + marisco.getPeso() <= capacidadeCargaKg) {
            mariscoPescado.add(marisco);
        } else {
            System.out.println("Muito pesado");
        }
    }

    public void largarPeixe(int posicao){
        peixesPescados.remove(posicao);
    }

    public void largarMarisco(int posicao){
        mariscoPescado.remove(posicao);
    }

    public void calcularTotal(){
        int total = 0;

        for(Peixe peixe : peixesPescados){
            total += peixe.getPeso() * peixe.getPreçoKg();
        }

        for(Marisco marisco : mariscoPescado){
            total += marisco.getPeso() * marisco.getPreçoKg();
        }

        System.out.println("Preço total em Kg: " + total);
    }

    public void salarioTripulacao(double salarioBruto){
        int tripulacaoAcapitoada = this.tripulacao - 1;

        double salarioLiquido = salarioBruto;

        salarioLiquido = salarioBruto * 0.6;

        double salarioFinal = salarioLiquido;

        salarioFinal /= tripulacaoAcapitoada;

        System.out.println("Salario para cada um: " + salarioFinal);
    }

}
