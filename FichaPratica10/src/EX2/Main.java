package EX2;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Tio", 24, 985493024, "tio@gmail.com");
        Pessoa pessoa2 = new Pessoa("Tia", 23, 984673024, "tia@gmail.com");
        Pessoa pessoa3 = new Pessoa("Pai", 27, 98864324, "pai@gmail.com");
        Pessoa pessoa4 = new Pessoa("Mae", 25, 985574524, "mae@gmail.com");
        Pessoa pessoa5 = new Pessoa("Filho", 20, 987557024, "filho@gmail.com");
        Pessoa pessoa6 = new Pessoa("Filha", 29, 985835624, "filha@gmail.com");
        Pessoa pessoa7 = new Pessoa("Primo", 21, 988635024, "primo@gmail.com");

        Sorteio sorteio = new Sorteio("Sorteio do chouriço", "Chouriço");

        System.out.println();
        sorteio.inscreverParticipantes(pessoa1);
        sorteio.inscreverParticipantes(pessoa2);
        sorteio.inscreverParticipantes(pessoa3);
        sorteio.inscreverParticipantes(pessoa4);
        sorteio.inscreverParticipantes(pessoa5);
        sorteio.inscreverParticipantes(pessoa6);
        sorteio.inscreverParticipantes(pessoa7);

        System.out.println();
        sorteio.imprimirParticipantes();

        System.out.println();
        sorteio.sortear();
    }
}
