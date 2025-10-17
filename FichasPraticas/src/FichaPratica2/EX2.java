package FichaPratica2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declare variables
        double salary;
        // get user input of salary
        System.out.print("Salary: ");
        salary = input.nextInt();
        // if salary < 15k
        if (salary < 15000) {
            salary = salary*0.2;
            System.out.print(salary);
        }
        else {
            salary = salary*0.3;
            System.out.print(salary);
        }
    }
}
