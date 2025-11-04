package EX10;

public class Main {
    public static void main() {

        ContaBancaria conta1 = new ContaBancaria(12345, "Joao");
        ContaBancaria conta2 = new ContaBancaria(67890, "Ze");
        ContaBancaria conta3 = new ContaBancaria(54321, "Bolinha");

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();

        conta1.depositar(2000);
        conta2.depositar(4000);
        conta3.depositar(5);

        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();

        conta1.levantar(5);

        conta1.exibirDetalhes();

        conta1.levantar(2000000);

        conta1.exibirDetalhes();

        conta2.transferencia(conta3, 40000);

        conta2.exibirDetalhes();
        conta3.exibirDetalhes();

        conta2.transferencia(conta3, 2000);

        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
    }
}
