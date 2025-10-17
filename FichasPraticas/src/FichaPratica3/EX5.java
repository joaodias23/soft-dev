package FichaPratica3;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declarar variaveis
        int num;
        String sentence;
        // input numero e mensagem
        System.out.print("Introduce the num: ");
        num = input.nextInt();
        System.out.print("Introduce the sentence: ");
        sentence = input.next();
        // loop de print a mensagem vezes o numero
        for (int i = 0; i < num; i++) {
            System.out.println(sentence);
        }
    }
}
