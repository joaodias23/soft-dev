package FichaPratica6;

public class EX8 {
    static void somarMatrizes(int [][] matriz1, int [][] matriz2) {
        int[][] somaTriz = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int k = 0; k < matriz1[0].length; k++) {
                somaTriz[i][k] = matriz1[i][k] + matriz2[i][k];
            }
        }
        System.out.println("Soma das Matrizes: ");
        for (int i = 0; i < somaTriz.length; i++) {
            for (int j = 0; j < somaTriz[0].length; j++) {
                System.out.print(somaTriz[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int somatorioMatrizes(int [][] matriz1, int [][] matriz2) {
        int somatorio = 0;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                somatorio += matriz1[i][j] + matriz2[i][j];
            }
        }
        return somatorio;
    }

    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matriz2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        somarMatrizes(matriz1, matriz2);

        int somatorio = somatorioMatrizes(matriz1, matriz2);
        System.out.println("Somatorio: " + somatorio);
    }
}
