package DemonstracaoPOO;

public class Cao {

    String nome = "Fido";
    String raca = "Boerboel";
    String latido = "Wooof!";
    int idade = 6;

    Cao(String nome_temp) {
        nome = nome_temp;
    }

    Cao(String nome_temp, String raca_temp, String latido_temp, int idade_temp) {
        nome = nome_temp;
        raca=raca_temp;
        latido=latido_temp;
        idade=idade_temp;
    }
}
