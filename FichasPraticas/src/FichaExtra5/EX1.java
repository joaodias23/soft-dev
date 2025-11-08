package FichaExtra5;

public class EX1 {

    public static void numeroMaisPequeno(int num1, int num2, int num3){
        int pequeno = num1;

        if(num2 < pequeno){
            pequeno = num2;
        }
        if(num3 < pequeno){
            pequeno = num3;
        }
        System.out.println(pequeno);
    }

    public static void main() {
        numeroMaisPequeno(20, 30, 5);
    }
}
