package EX2.Veiculos;

import EX2.Enums.TipoCombustivel;
import EX2.Veiculo;

public class Mota extends Veiculo {

    public Mota(String marca, String modelo, String cor, int ano, int potencia, int cilindrada, TipoCombustivel combustivel, float consumoLitros100Km) {
        super(marca, modelo, cor, ano, potencia, cilindrada, combustivel, consumoLitros100Km);
    }

    public void imagem(){
        System.out.println("                ,\n" +
                "              //\n" +
                "            /' ([],----~~~~~---__                             _________\n" +
                "          /' _-~~\\0              ~~--_               ___---~~~        /'\n" +
                "         /_-~                       _-~-_______---~~/               /'\n" +
                "         (___________/           _-~     \\_____--~~/             _-~\n" +
                "      _ ----- _~-_\\\\\\\\        _-~                 (_ ______---~~~--_\n" +
                "   _-~         ~-_~\\\\\\\\      (                      ~-_  |          ~-_\n" +
                "  /~~~~\\          \\ \\~~       ~-_        ____          ~~--__-----_    \\\n" +
                " ;    / \\ ______-----\\           ~-__--~~    ~-_             ~~--_ \\    .\n" +
                " |   | \\((*)~~~~~~~~~~|      __--~~             ~-_               ) |   |\n" +
                " |    \\  |~|~---------)__--~~                      \\_____________/ /    ,\n" +
                "  \\    ~-----~    /  /~                             )  \\    ~-----~    /\n" +
                "   ~-_         _-~ /_______________________________/    `-_         _-~\n" +
                "      ~ ----- ~                                            ~ ----- ~");
    }

}
