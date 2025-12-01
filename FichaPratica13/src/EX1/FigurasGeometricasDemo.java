package EX1;

public class FigurasGeometricasDemo {
    public static void main(){

        Retangulo retangulo = new Retangulo("Vermelho", 20, 15);
        Circulo circulo = new Circulo("Verde", 3.5);
        Triangulo triangulo = new Triangulo("Azul", 15, 7, 7);

        retangulo.mostrarCor();
        circulo.mostrarCor();
        triangulo.mostrarCor();

        System.out.println(retangulo.calcularArea());
        System.out.println(circulo.calcularArea());
        System.out.println(triangulo.calcularArea());
    }
}
