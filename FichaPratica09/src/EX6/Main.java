package EX6;

public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("binolino", "fobal", 1.56f, 68, "Ghana", 3);

        Atleta atleta2 = new Atleta("bilu", "fobal", 1.76f, 78, "Sydney", 5);

        Atleta atleta3 = new Atleta("matumbas", "fobal", 1.66f, 54, "Açores", 8);

        Atleta atleta4 = new Atleta("acrilico", "fobal", 1.86f, 76, "Ásia", 2);

        Atleta atleta5 = new Atleta("leitonas", "fobal", 1.96f, 69, "Sibéria", 1);

        Atleta atleta6 = new Atleta("barracao", "fobal", 2.06f, 96, "Starbucks", 300);

        Competicao competicao1 = new Competicao("Antonio", "Ghana", 10);

        Competicao competicao2 = new Competicao("Roberto", "Ásia", 8);

        competicao1.inscreverAtleta(atleta3);
        competicao1.inscreverAtleta(atleta1);

        competicao2.inscreverAtleta(atleta2);
        competicao2.inscreverAtleta(atleta4);
        competicao2.inscreverAtleta(atleta5);
        competicao2.inscreverAtleta(atleta6);

        competicao1.listarParticipantes();
        competicao2.listarParticipantes();

        competicao1.atletasDaCasa();
        competicao2.atletasDaCasa();

    }
}
