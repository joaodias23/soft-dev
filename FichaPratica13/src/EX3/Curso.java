package EX3;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String nome;
    private ArrayList<DisciplinaCurso> disciplinaCurso;
    private boolean longaDuracao; // false curtaduracao (<=100) true longaduracao (>100)
    private ArrayList<Disciplina> disciplinasSistema;
    private ArrayList<Professor> professoresSistema;

    public Curso(boolean longaDuracao, String nome) {
        this.longaDuracao = longaDuracao;
        this.nome = nome;
        this.disciplinaCurso = new ArrayList<DisciplinaCurso>();
        this.disciplinasSistema = new ArrayList<Disciplina>();
        this.professoresSistema = new ArrayList<Professor>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDisciplinaCurso(DisciplinaCurso discourse) {
        this.disciplinaCurso.add(discourse);
    }

    public void criarCurso() {

        Scanner input = new Scanner(System.in);
        System.out.println("Criar Curso");

        System.out.print("Nome do Curso: ");
        this.nome = input.nextLine();

        System.out.println("\nDisciplinas disponíveis no sistema:");
        for (int i = 0; i < disciplinasSistema.size(); i++) {
            Disciplina d = disciplinasSistema.get(i);
            System.out.println(i + " - " + d.getNome() + " (" + d.getArea() + ") - " + d.getDuracaoHoras() + "h");
        }

        System.out.print("\nQuantas disciplinas tem o curso? ");
        int quatid = input.nextInt();
        input.nextLine();

        for (int i = 0; i < quatid; i++) {
            System.out.print("\nEscolha a disciplina pelo índice: ");
            int indiceDisc = input.nextInt();
            input.nextLine();

            Disciplina disciplinaEscolhida = disciplinasSistema.get(indiceDisc);

            System.out.println("\nProfessores aptos " + disciplinaEscolhida.getNome() + ":");
            ArrayList<Professor> profApto = new ArrayList<>();

            for (Professor p : professoresSistema) {
                if (p.getAreaFormacao().contains(disciplinaEscolhida.getArea())) {
                    profApto.add(p);
                }
            }

            if (profApto.isEmpty()) {
                System.out.println("Nenhum professor apto.");
                continue;
            }

            for (int j = 0; j < profApto.size(); j++) {
                System.out.println(j + " - " + profApto.get(j).nome + " (nível " + profApto.get(j).getNivelAcademico() + ")");
            }

            System.out.print("Escolha o professor pelo índice: ");
            int indiceProf = input.nextInt();
            input.nextLine();
            Professor professorEscolhido = profApto.get(indiceProf);
            DisciplinaCurso disc = new DisciplinaCurso(disciplinaEscolhida, professorEscolhido);
            this.disciplinaCurso.add(disc);
        }

        int totalHoras = 0;
        for (DisciplinaCurso disc : disciplinaCurso) {
            totalHoras += disc.getDisciplina().getDuracaoHoras();
        }

        this.longaDuracao = totalHoras > 100;
        System.out.println("\nCurso criado com sucesso!");
        System.out.println("Total de horas: " + totalHoras);
        if (longaDuracao) {
            System.out.println("Tipo: Longa duração");
        } else {
            System.out.println("Tipo: Curta duração");
        }
    }

    public ArrayList<Disciplina> getDisciplinasSistema() {
        return disciplinasSistema;
    }

    public ArrayList<Professor> getProfessoresSistema() {
        return professoresSistema;
    }

    public ArrayList<DisciplinaCurso> getDisciplinaCurso() {
        return disciplinaCurso;
    }
}
