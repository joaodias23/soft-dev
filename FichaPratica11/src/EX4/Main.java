package EX4;

public class Main {
    public static void main(String[] args) {

        FormaGeomatrica forma = new FormaGeomatrica();

        forma.calcularArea();

        Circulo circulo = new Circulo(4);
        Triangulo triangulo = new Triangulo(5, 5);
        Retangulo retangulo = new Retangulo(5, 6);

        circulo.calcularArea();
        triangulo.calcularArea();
        retangulo.calcularArea();

    }
}
