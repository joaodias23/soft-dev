package EX4;

public class Main {
    public static void main(String[] args) {

        Circulo circle = new Circulo("Vermelho", 11);
        Circulo circle1 = new Circulo("Amarelo", 12);

        if(circle.getRadius() > circle1.getRadius()){
            System.out.println(circle.circlePerimeter());
            System.out.println(circle.circleArea());
        } else {
            System.out.println(circle1.circlePerimeter());
            System.out.println(circle1.circleArea());
        }
    }
}
