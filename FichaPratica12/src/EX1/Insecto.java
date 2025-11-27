package EX1;

public class Insecto extends SerVivo{
    private boolean venenoso;

    public Insecto(String nome, String especie, String pais, int idade, boolean venenoso) {
        super(nome, especie, pais, idade);
        this.venenoso = venenoso;
    }

    public boolean isVenenoso() {
        return venenoso;
    }
}
