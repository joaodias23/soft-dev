package FichaPratica2;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // declare variables - dois numeros reais e uma operação
        String operator;
        int num1, num2, sum, sub, mult, div;
        // get user input
        System.out.print("Numero 1: ");
        num1 = input.nextInt();
        System.out.print("Numero 2: ");
        num2 = input.nextInt();

        System.out.print("Operador: ");
        operator = input.next();

        if (operator.equals("+")) {
            sum = num1 + num2;
            System.out.println(sum);
        } else if (operator.equals("-")) {
            sub = num1 - num2;
            System.out.println(sub);
        } else if (operator.equals("*")) {
            mult = num1 * num2;
            System.out.println(mult);
        } else if (operator.equals("/")){
            div = num1 / num2;
            System.out.println(div);
        } else {
            System.out.println("Error: Select valid input");
        }
    }
}
