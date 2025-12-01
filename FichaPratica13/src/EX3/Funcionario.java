package EX3;

public class Funcionario extends Pessoa{
    private Funcao funcao;

    public Funcionario(String nome, int anoNascimento, String email, String telemovel, Funcao funcao) {
        super(nome, anoNascimento, email, telemovel);
        this.funcao = funcao;
    }

    @Override
    void imprimirHorario() {
        System.out.println("8h a " + funcao.toString().toLowerCase());
    }

    @Override
    void obterFuncao() {
        System.out.println("Função: Funcionario " + funcao);
    }

    public Funcao getFuncao() {
        return funcao;
    }
}
