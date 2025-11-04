package EX9;

public class Main {
    public static void main() {

        Funcionario ze = new Funcionario("Ze", "ze@gmail.com", "pizzas", 2400.1f);

        ze.exibirDetalhes();

        ze.aumentarSalario(40);

        ze.exibirDetalhes();
    }
}
