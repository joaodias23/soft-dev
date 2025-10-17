package FichaExtra1;

public class EX503 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 5; k >= i; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            for (int l = 1; l < i; l++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
