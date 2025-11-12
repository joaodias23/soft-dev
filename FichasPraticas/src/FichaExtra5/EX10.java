package FichaExtra5;

import java.util.Scanner;

public class EX10 {

    public static double areaQuadrado(double lado) {
        return lado * lado;
    }

    public static double areaRetangulo(double comprimento, double largura) {
        return comprimento * largura;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double areaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public static void analisarPreco(double preco, String tipologia) {
        double min = 0, max = 0;

        switch(tipologia.toUpperCase()) {
            case "URBANO":
                min = 450;
                max = 750;
                break;
            case "URBANIZAVEL":
                min = 150;
                max = 500;
                break;
            case "RUSTICO":
                min = 30;
                max = 60;
                break;
            default:
                System.out.println("Nao existe!");
                return;
        }

        if(preco >= min && preco <= max) {
            System.out.println("O preço está dentro do valor de mercado.");
        } else if(preco < min) {
            System.out.printf("O preço está abaixo do valor de mercado em: " + (min - preco));
        } else {
            System.out.printf("O preço está acima do valor de mercado em: " + (preco - max));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a forma do terreno:");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Triângulo");
        System.out.println("4 - Círculo");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double area = 0;

        switch(opcao) {
            case 1:
                System.out.print("Lado do quadrado (m): ");
                double lado = scanner.nextDouble();
                area = areaQuadrado(lado);
                break;
            case 2:
                System.out.print("Comprimento (m): ");
                double comprimento = scanner.nextDouble();
                System.out.print("Largura (m): ");
                double largura = scanner.nextDouble();
                area = areaRetangulo(comprimento, largura);
                break;
            case 3:
                System.out.print("Base do triângulo (m): ");
                double base = scanner.nextDouble();
                System.out.print("Altura do triângulo (m): ");
                double altura = scanner.nextDouble();
                area = areaTriangulo(base, altura);
                break;
            case 4:
                System.out.print("Raio do círculo (m): ");
                double raio = scanner.nextDouble();
                area = areaCirculo(raio);
                break;
            default:
                System.out.println("Nao da!");
                scanner.close();
                return;
        }

        System.out.println("Área do terreno: " + area);

        System.out.print("Preço do terreno: ");
        double preco = scanner.nextDouble();

        System.out.print("Tipologia (URBANO, URBANIZAVEL, RUSTICO): ");
        String tipologia = scanner.next();

        analisarPreco(preco, tipologia);

        scanner.close();
    }
}
