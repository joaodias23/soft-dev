package EX1;

import EX1.Avioes.AviaoCombate;
import EX1.Avioes.JatoParticular;
import EX1.Enums.Armas;
import EX1.Enums.Categoria;
import EX1.Enums.Instalacoes;

public class Maina {
    public static void main(String[] args) {

        JatoParticular jatao = new JatoParticular(24, "Abioum", 1993, 15.0, 20.0, 16.5, 19.4, 3, 400, 700, 17000, 8, 49, Categoria.LIGHT_JET);
        JatoParticular jatoDeMulher = new JatoParticular(24, "Xiripiti", 1994, 16.0, 20.0, 16.5, 19.4, 3, 400, 700, 17000, 8, 49, Categoria.LIGHT_JET);

        AviaoCombate combate = new AviaoCombate(24, "X5", 1995, 17.0, 20.0, 16.5, 19.4, 3, 400, 700, 17000,"Africa", true);
        AviaoCombate combatola = new AviaoCombate(24, "X6", 1996, 18.0, 20.0, 16.5, 19.4, 3, 400, 700, 17000,"Asia", false);

        jatao.addInstalacao(Instalacoes.WC);
        jatao.addInstalacao(Instalacoes.WC);
        jatao.addInstalacao(Instalacoes.WC);
        jatao.addInstalacao(Instalacoes.WC);
        jatao.addInstalacao(Instalacoes.WC);

        jatoDeMulher.addInstalacao(Instalacoes.COZINHA);
        jatoDeMulher.addInstalacao(Instalacoes.COZINHA);
        jatoDeMulher.addInstalacao(Instalacoes.COZINHA);

        combate.addArma(Armas.BOMBAS);
        combate.addArma(Armas.BOMBAS);
        combate.addArma(Armas.BOMBAS);

        combatola.addArma(Armas.METRALHADORAS);
        combatola.addArma(Armas.METRALHADORAS);

        PlaneStore lojaDoJoao = new PlaneStore();

        lojaDoJoao.adquirirAviao(jatao);
        lojaDoJoao.adquirirAviao(jatoDeMulher);
        lojaDoJoao.adquirirAviao(combate);
        lojaDoJoao.adquirirAviao(combatola);

        lojaDoJoao.listarCatalogo();

    }
}
