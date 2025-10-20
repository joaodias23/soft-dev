package FichaExtra1;

public class EX503 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(i - j);
            }

            for (int l = i-2; l >= 0; l--) {
                System.out.print(i-l);
            }

            System.out.println();
        }
    }
}
