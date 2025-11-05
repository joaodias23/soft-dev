package EX2;

public class Main {
    public static void main() {

        ContaBancaria conta1 = new ContaBancaria(12345, "Joao");
        ContaBancaria conta2 = new ContaBancaria(67890, "Ze");
        ContaBancaria conta3 = new ContaBancaria(54321, "Bolinha");

        conta1.depositar(2000);
        conta2.depositar(3000);
        conta3.depositar(4000);

        conta1.pedirEmprestimo(2000);


        conta1.pedirEmprestimo(1000);
        conta1.pedirEmprestimo(1000);
        conta2.pedirEmprestimo(1500);
        conta3.pedirEmprestimo(120414);
    }
}
