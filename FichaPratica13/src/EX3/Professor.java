package EX3;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private ArrayList<AreaFormacao> areaFormacao;
    private int nivelAcademico;
    private ArrayList<DisciplinaCurso> disciplinasLecionadas;

    public Professor(String nome, int anoNascimento, String email, String telemovel, int nivelAcademico) {
        super(nome, anoNascimento, email, telemovel);
        this.nivelAcademico = nivelAcademico;
        this.areaFormacao = new ArrayList<AreaFormacao>();
        this.disciplinasLecionadas = new ArrayList<DisciplinaCurso>();
    }

    @Override
    void obterFuncao() {
        System.out.println("Função: Professor");
    }

    @Override
    void imprimirHorario() {
        System.out.println("\nHorário do Professor " + nome + ":");
        if (disciplinasLecionadas.isEmpty()) {
            System.out.println("nenhuma disciplina.");
            return;
        }
        for (DisciplinaCurso disc : disciplinasLecionadas) {
            System.out.println("Curso: " + disc.getDisciplina().getNome() +
                    " Disciplina: " + disc.getDisciplina().getNome() +
                    " Área: " + disc.getDisciplina().getArea());
        }
    }

    public int getNivelAcademico() {
        return nivelAcademico;
    }

    public ArrayList<AreaFormacao> getAreaFormacao() {
        return areaFormacao;
    }

    public void lancarNota(Aluno aluno, Disciplina disciplina, double nota) {
        if (nota < 0 || nota > 20) {
            System.out.println("Erro: Nota inválida. Deve estar entre 0 e 20.");
            return;
        }

        boolean leciona = false;
        for (DisciplinaCurso dc : disciplinasLecionadas) {
            if (dc.getDisciplina() == disciplina) {
                leciona = true;
                break;
            }
        }
        if (!leciona) {
            System.out.println("Erro: O professor não leciona esta disciplina.");
            return;
        }

        boolean alunoTemDisciplina = false;
        for (DisciplinaCurso dc : aluno.getCurso().getDisciplinaCurso()) {
            if (dc.getDisciplina() == disciplina) {
                alunoTemDisciplina = true;
                break;
            }
        }
        if (!alunoTemDisciplina) {
            System.out.println("não está inscrito nesta disciplina.");
            return;
        }

        int linhas = aluno.getPauta().length;
        int colunas = aluno.getPauta()[0].length;

        boolean notaLancada = false;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (aluno.getPauta()[i][0].equals(disciplina.getNome())) {
                    aluno.getPauta()[i][1] = String.valueOf(nota);
                    notaLancada = true;
                    break;
                }
            }
            if (notaLancada) break;
        }

        System.out.println("Nota lançada com sucesso para o alonu " + aluno.getNome() + " na disciplina " + disciplina.getNome() + ": " + nota);
    }

    public void adicionarDisciplinaCurso(DisciplinaCurso disc) {
        disciplinasLecionadas.add(disc);
    }
}
