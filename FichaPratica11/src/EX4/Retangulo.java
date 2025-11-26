package EX4;

public class Retangulo extends FormaGeomatrica{
    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public void calcularArea() {
        System.out.println("Area: " + this.largura * this.comprimento);
    }
}
