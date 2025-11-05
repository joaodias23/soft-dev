package EX4;

public class Main {
    public static void main(String[] args) {

        Imovel imovel1 = new Imovel("Rua dos musicos", 23, "Porto", TipoHabitacao.APARTAMENTO, Acabamento.USADA, 35, 3, 1, 65);
        Imovel imovel2 = new Imovel("Rua dos cantores", 26, "Lisboa", TipoHabitacao.CASA, Acabamento.NOVA_COM_ALTO_ACABAMENTO, 23, 4, 2, 40);

        if (imovel1.compararImoveis(imovel1) == imovel1){
            System.out.println("Casa mais cara");
            imovel1.exibirDetalhes();
        } else{
            System.out.println("Casa mais cara");
            imovel2.exibirDetalhes();
        }
    }
}
