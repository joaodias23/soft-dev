package FichaPratica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/exercicio_05_1999.txt");

        Scanner sc = new Scanner(file);

        String line = sc.nextLine();

        String [] nums = line.split(" ");

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += Integer.parseInt(nums[i]);
        }

        System.out.println(sum);

        sc.close();
    }
}
