package EX4;

public class Circulo {
    private String cor;
    private double raio;
    double PI = 3.1459;

    public Circulo(String cor, double raio){
        this.cor = cor;
        this.raio = raio;
    }

    // 2PIr | PIr^2

    public double circlePerimeter(){
        return (2 * PI * this.raio);
    }

    public double circleArea(){
        return (PI * (this.raio*this.raio));
    }

    public double getRadius(){
        return this.raio;
    }
}
