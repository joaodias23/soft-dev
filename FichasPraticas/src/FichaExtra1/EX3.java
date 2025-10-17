package FichaExtra1;

public class EX3 {
    public static void main(String[] args) {
        int mult;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++) {
                mult = j * i;
                System.out.println(j + "x" + i + "=" + mult);
            }
        }
    }
}
