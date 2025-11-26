package EX4;

public class Triangulo extends FormaGeomatrica{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("Area: " + (base*altura)/2);
    }
}
