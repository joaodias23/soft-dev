package EX7;

public class Main {
    public static void main() {

        Aluno aluno1 = new Aluno("Alberto Caeiro", 23, "fernando@gmail.com", "filosofia", 15);

        Aluno aluno2 = new Aluno("Alberto Cagueiro", 23, "fernandopessoa@gmail.com", "poesia", 7.5);

        aluno1.situacaoAprovacao();

        aluno2.situacaoAprovacao();
    }
}
