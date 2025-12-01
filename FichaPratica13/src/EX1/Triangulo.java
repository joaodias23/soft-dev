package EX1;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    // triangulo equilátero
    private double lado;

    public Triangulo(String cor, double altura, double base, double lado) {
        super(cor);
        this.altura = altura;
        this.base = base;
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    double calcularPerimetro() {
        return lado * 3;
    }
}
