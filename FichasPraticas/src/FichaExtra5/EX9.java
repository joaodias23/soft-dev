package FichaExtra5;

public class EX9 {

    public static String obterMes(int numero) {

        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        if (numero < 1 || numero > 12) {
            return "Escolha um valor entre 1 e 12.";
        }

        return meses[numero - 1];
    }

    public static void main() {
        System.out.println(obterMes(11));
    }
}
