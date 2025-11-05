package EX2;

public class ContaBancaria {
    private int iban;
    private String titular;
    private int saldo = 0;
    private int anoAbertura = 2025;
    private float margemEmprestimo = 0.5f;
    private float valorDivida = 0;

    public ContaBancaria(int iban, String titular) {
        this.iban = iban;
        this.titular = titular;
    }

    public void exibirDetalhes() {
        System.out.println("\n------------------------ CONTABANCARIA ------------------------");
        System.out.println("{ " + this.iban + " , " + this.titular + " , " + this.saldo + " , " + this.anoAbertura + " , " + this.margemEmprestimo + " , " + this.valorDivida + " }");
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

    public void pedirEmprestimo(float valorPedir){
        if(this.valorDivida > 0){
            System.out.println("Tas em divida ze");
        } else if(this.saldo * margemEmprestimo >= valorPedir && this.valorDivida == 0){
            this.saldo += valorPedir;
            this.valorDivida += valorPedir;
            System.out.println("Tas em divida para connosco. Sucesso.");
        } else {
            System.out.println("Assim tambem nao ne");
        }
    }

    public void amortizarEmprestimo(float valor){
        if(this.valorDivida < valor){
            System.out.println("Valor em excesso");
        } else if(this.saldo >= valor){
            this.valorDivida -= valor;
            System.out.println("Estas safo, por enquanto");
        } else{
            System.out.println("Nao tens dinheiro que chegue");
        }
    }
}
