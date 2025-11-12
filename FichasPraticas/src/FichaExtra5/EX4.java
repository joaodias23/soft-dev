package FichaExtra5;

public class EX4 {

    public static void imprimirTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main() {
        imprimirTabuada(2);
    }
}
