package FichaPratica3;

public class EX7 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i > 1) {
                sum += i;
            }
        }
        sum += 1;
        System.out.println(sum);
    }
}
