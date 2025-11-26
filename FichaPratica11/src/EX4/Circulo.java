package EX4;

public class Circulo extends FormaGeomatrica{
    private double raio;
    private final double PI = 3.14159;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Area: " + PI * Math.pow(raio, 2));
    }
}
