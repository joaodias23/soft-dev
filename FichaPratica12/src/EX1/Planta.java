package EX1;

import EX1.Enums.Familia;

public class Planta extends SerVivo{
    private Familia familia;
    private int grauDefesa; // | 0 a 5 |

    public Planta(String nome, String especie, String pais, int idade, Familia familia, int grauDefesa) {
        super(nome, especie, pais, idade);
        this.familia = familia;
        this.grauDefesa = grauDefesa;
    }

    public Familia getFamilia() {
        return familia;
    }
}
