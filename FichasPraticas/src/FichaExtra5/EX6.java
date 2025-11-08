package FichaExtra5;

public class EX6 {

    public static double somatorio(int numero) {
        int soma = 0;

        while (numero > 0) {
            soma += numero % 10;
            numero /= 10;
        }

        return soma;
    }

    public static void main() {
        System.out.println(somatorio(361));
    }
}
