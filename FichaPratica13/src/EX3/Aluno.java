package EX3;

public class Aluno extends Pessoa{
    private Curso curso;
    private double mediaNotas;
    private String[][] pauta;

    public Aluno(String nome, int anoNascimento, String email, String telemovel, Curso curso, double mediaNotas, String[][] pauta) {
        super(nome, anoNascimento, email, telemovel);
        this.curso = curso;
        this.mediaNotas = mediaNotas;
        this.pauta = pauta;
    }

    @Override
    void imprimirHorario() {
        System.out.println("\ndisciplinas " + nome + ":");
        if (curso.getDisciplinaCurso().isEmpty()) {
            System.out.println("Nenhuma disciplina");
            return;
        }
        for (DisciplinaCurso dc : curso.getDisciplinaCurso()) {
            System.out.println("- " + dc.getDisciplina().getNome() + " | Professor: " + dc.getProfessor().nome);
        }
    }

    @Override
    void obterFuncao() {
        System.out.println("Função: Aluno do curso " + curso.getNome());
    }

    public void imprimirPauta() {
        System.out.println("\npauta de " + nome + ":");
        for (int i = 0; i < pauta.length; i++) {
            System.out.println(pauta[i][0] + " : " + pauta[i][1]);
        }
    }

    public void calcularMedia() {
        double soma = 0;
        int contador = 0;
        for (int i = 0; i < pauta.length; i++) {
            double nota = Double.parseDouble(pauta[i][1]);
            soma += nota;
            contador++;
        }
        if (contador > 0) {
            mediaNotas = soma / contador;
        } else {
            mediaNotas = 0;
        }
    }

    public void estadoAprovacao() {
        calcularMedia();
        System.out.println("\nAluno: " + nome);
        System.out.println("Média: " + mediaNotas);
        if (mediaNotas >= 9.5) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
    }

    public String[][] getPauta() {
        return pauta;
    }

    public Curso getCurso() {
        return curso;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }
}
