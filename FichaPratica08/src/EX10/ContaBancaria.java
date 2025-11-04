package EX10;

public class ContaBancaria {
    private int iban;
    private String titular;
    private int saldo = 0;

    public ContaBancaria(int iban, String titular) {
        this.iban = iban;
        this.titular = titular;
    }

    public void exibirDetalhes() {
        System.out.println("\n------------------------ FUNCIONARIO ------------------------");
        System.out.println("{ " + this.iban + " , " + this.titular + " , " + this.saldo + " }");
        System.out.println("-------------------------------------------------------");
    }

    public void depositar(float deposito) {
        this.saldo += deposito;
        System.out.println(deposito + " paus foram creditados na sua conta: " + this.iban);
    }

    public void levantar(float levantamento) {
        if (this.saldo > levantamento) {
            this.saldo -= levantamento;
            System.out.println(levantamento + " paus foram debitados da sua conta: " + this.iban);
        } else {
            System.out.println("tas pobre mano, esquece");
        }
    }

    public void transferencia(ContaBancaria ibanDestino, int valorTransferencia) {
        if (this.saldo > valorTransferencia) {
            System.out.println(valorTransferencia + " transferidos para a conta: " + ibanDestino);
            this.saldo -= valorTransferencia;
            ibanDestino.depositar(valorTransferencia);
        } else {
            System.out.println("Desta vez não foi");
        }
    }

}
