package EX3;

abstract class Pessoa {
    protected String nome;
    protected int anoNascimento;
    protected String email;
    protected String telemovel;

    public Pessoa(String nome, int anoNascimento, String email, String telemovel) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
        this.telemovel = telemovel;
    }

    abstract void obterFuncao();

    abstract void imprimirHorario();

    public void exibirDetalhes() {
        System.out.println("Pessoa {" + "nome='" + nome + '\'' + ", anoNascimento=" + anoNascimento +
                ", email='" + email + '\'' + ", telemovel='" + telemovel + '\'' + '}');
    }

    public String getNome() {
        return nome;
    }
}
