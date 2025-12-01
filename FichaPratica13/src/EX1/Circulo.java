package EX1;

public class Circulo extends FiguraGeometrica{
    private final static double PI = 3.14159;
    private double radius;

    public Circulo(String cor, double radius) {
        super(cor);
        this.radius = radius;
    }

    @Override
    double calcularArea() {
        return PI * (radius * radius);
    }

    @Override
    double calcularPerimetro() {
        return 2 * (PI * radius);
    }
}
