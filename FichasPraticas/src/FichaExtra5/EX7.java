package FichaExtra5;

public class EX7 {

    public static int inverterInteiro(int numero) {
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        if (numero < 0) {
            invertido = -invertido;
        }

        return invertido;
    }

    public static void main() {
        System.out.println(inverterInteiro(45));
    }
}
