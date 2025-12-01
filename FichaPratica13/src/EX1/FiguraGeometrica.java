package EX1;

abstract class FiguraGeometrica {
    protected String cor;

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }

    public void mostrarCor(){
        System.out.println("A forma geometrica é " + cor);
    }

    abstract double calcularArea();

    abstract double calcularPerimetro();
}
