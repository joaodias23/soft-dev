package EX1;

public class Retangulo extends FiguraGeometrica{
    private double comprimento;
    private double largura;

    public Retangulo(String cor, double comprimento, double largura) {
        super(cor);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    double calcularArea() {
        return comprimento * largura;
    }

    @Override
    double calcularPerimetro() {
        return (comprimento * 2) + (largura * 2);
    }
}
