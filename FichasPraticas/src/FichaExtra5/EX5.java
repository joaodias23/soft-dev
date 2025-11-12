package FichaExtra5;

public class EX5 {
    public static String contarPiada(int piada) {
        String[] bibliotecaPiadas = new String[6];

        bibliotecaPiadas[0] = "Que nome se dá a uma ferramenta perdida? Foice.";
        bibliotecaPiadas[1] = "O que 17 alentejanos fazem em frente ao cinema? À espera que chegue mais um porque o filme é para maiores de 18.";
        bibliotecaPiadas[2] = "Qual é a panela que está sempre triste? A panela depressão.";
        bibliotecaPiadas[3] = "O que acontece se o Pai Natal morrer? Ele não estará mais em trenós.";
        bibliotecaPiadas[4] = "Governo português.";
        bibliotecaPiadas[5] = "O que é pior do que encontrar um bebé no lixo? Encontrar um bebé em vários caixotes do lixo.";

        if (piada < 1 || piada > bibliotecaPiadas.length) {
            return "Só há " + bibliotecaPiadas.length + " piadas.";
        }

        return bibliotecaPiadas[piada - 1];
    }

    public static void main() {
        System.out.println(contarPiada(6));
    }
}
