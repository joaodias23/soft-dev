package EX3;

import java.util.Scanner;

public class Disciplina {
    private String nome;
    private AreaFormacao area;
    private int duracaoHoras;

    public Disciplina(String nome, AreaFormacao area, int duracaoHoras) {
        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
    }

    public Disciplina() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nova Disciplina");
        System.out.print("Nome:");
        nome = input.nextLine();
        System.out.print("area (INFORMATICA, ECONOMIA, CONTABILIDADE, MEDICINA):");
        String areaa = input.nextLine();
        if(areaa.equals("INFORMATICA")){
            area = AreaFormacao.INFORMATICA;
        } else if (areaa.equals("ECONOMIA")){
            area = AreaFormacao.ECONOMIA;
        } else if (areaa.equals("CONTABILIDADE")){
            area = AreaFormacao.CONTABILIDADE;
        } else if (areaa.equals("MEDICINA")){
            area = AreaFormacao.MEDICINA;
        } else {
            System.out.println("Area não encontrada.");
        }
        System.out.print("duracaoHoras:");
        duracaoHoras = input.nextInt();
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public String getNome() {
        return nome;
    }

    public AreaFormacao getArea() {
        return area;
    }
}
