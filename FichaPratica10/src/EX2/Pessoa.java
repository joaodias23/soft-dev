package EX2;

public class Pessoa {
    private String nome;
    private int idade;
    private int telefone;
    private String email;

    public Pessoa(String nome, int idade, int telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
    }

    public void exibirDetalhes() {
        System.out.println("\n------------------------ PESSOA ------------------------");
        System.out.println("{ " + this.nome + " , " + this.idade + " , " + this.telefone + " , " + this.email + " }");
        System.out.println("-------------------------------------------------------");
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}
