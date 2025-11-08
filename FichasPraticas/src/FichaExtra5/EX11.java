package FichaExtra5;

import java.util.Scanner;

public class EX11 {

    public static void inicializarTabuleiro(char[][] tabuleiro) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    public static void imprimirTabuleiro(char[][] tabuleiro) {

        System.out.println("  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---------");
        }
    }

    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {

        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                    (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }

        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
                (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true;
        }
        return false;
    }

    public static boolean verificarEmpate(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void fazerJogada(char[][] tabuleiro, char jogador, Scanner scanner) {

        int linha, coluna;

        while (true) {
            System.out.print("Jogador " + jogador + ", digite a linha (0-2): ");
            linha = scanner.nextInt();
            System.out.print("Jogador " + jogador + ", digite a coluna (0-2): ");
            coluna = scanner.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Posição inválida! Tente novamente.");
            } else if (tabuleiro[linha][coluna] != ' ') {
                System.out.println("Posição já ocupada! Tente novamente.");
            } else {
                tabuleiro[linha][coluna] = jogador;
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];

        inicializarTabuleiro(tabuleiro);

        char jogadorAtual = 'X';
        boolean jogoAtivo = true;

        System.out.println("=== Cocks Game ===");

        while (jogoAtivo) {
            imprimirTabuleiro(tabuleiro);
            fazerJogada(tabuleiro, jogadorAtual, scanner);

            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Parabéns! Jogador " + jogadorAtual + " venceu!");
                jogoAtivo = false;
            } else if (verificarEmpate(tabuleiro)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Empate! Nenhum jogador venceu.");
                jogoAtivo = false;
            } else {

                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }
    }
}
