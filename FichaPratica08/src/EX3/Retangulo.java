package EX3;

public class Retangulo {
    private String cor;
    private int largura;
    private int altura;

    public Retangulo(String cor, int largura, int altura) {
        this.cor = cor;
        this.largura = largura;
        this.altura = altura;
    }

    public int getPerimeter() {
        int perimeter = (this.largura * 2) + (this.altura * 2);
        return perimeter;
    }

    public int getArea() {
        int area = this.largura * this.altura;
        return area;
    }
}
