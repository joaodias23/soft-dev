package FichaPratica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX10 {

    public static void printAll() throws FileNotFoundException {

        File file = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/exercicio_10.csv");

        Scanner sc = new Scanner(file);

        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String [] studentPrint = line.split(",");
            System.out.println(studentPrint[0]);
        }
    }

    public static void studentDataNo() throws FileNotFoundException {

        File file = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/exercicio_10.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Introduza o numero de matricula: ");
        int numberMatric = input.nextInt();

        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String [] studentPrint = line.split(",");
            if (Integer.parseInt(studentPrint[1]) == numberMatric) {
                System.out.println();
                System.out.println("Nome: " + studentPrint[0]);
                System.out.println("Numero: " + studentPrint[1]);
                System.out.println("Curso: " + studentPrint[2]);
                System.out.println("Email: " + studentPrint[3]);
                System.out.println("Idade: " + studentPrint[4]);
                System.out.println();
            }
        }
    }

    public static void courseData() throws FileNotFoundException {

        File file = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/exercicio_10.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Introduza o nome do curso: ");
        String courseName = input.nextLine();

        int counter = 0;

        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String [] studentPrint = line.split(",");
            if (courseName.equalsIgnoreCase(studentPrint[2])) {
                System.out.println();
                System.out.println("Nome: " + studentPrint[0]);
                System.out.println("Numero: " + studentPrint[1]);
                System.out.println();
                counter++;
            }
        }

        System.out.println("Contagem de formandos inscritos no curso: " + counter);
    }

    public static void printOldest() throws FileNotFoundException{

        File file = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/exercicio_10.csv");

        Scanner sc = new Scanner(file);

        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        int oldest = 0;
        String oldestName = "";

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String [] studentPrint = line.split(",");

            if(Integer.parseInt(studentPrint[4]) > oldest) {
                oldest = Integer.parseInt(studentPrint[4]);
                oldestName = studentPrint[0];
            }
        }

        System.out.println();
        System.out.println("Oldest: " + oldestName + " Age: " + oldest);
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao;

        do{
            System.out.println();
            System.out.println("1. Pesquisas");
            System.out.println("2. Criar Formando");
            System.out.println("3. Editar Formando");
            System.out.println("4. Eliminar Formando");
            System.out.println("5. Exit");
            System.out.println();

            System.out.print("Selecione a opcao que deseja: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    do {
                        System.out.println();
                        System.out.println("1. Imprimir todos os formandos");
                        System.out.println("2. Dados do formando por nº de matricula");
                        System.out.println("3. Lista de formandos por curso");
                        System.out.println("4. Imprimir aluno mais velho");
                        System.out.println("5. Imprimir alunos que estão inscritos em mais de um curso");
                        System.out.println("6. Numero total de formandos");
                        System.out.println("7. Exit");
                        System.out.println();

                        System.out.print("Selecione a opcao que deseja: ");
                        opcao = input.nextInt();

                        switch (opcao){
                            case 1:
                                printAll();
                                break;
                            case 2:
                                studentDataNo();
                                break;
                            case 3:
                                courseData();
                                break;
                            case 4:
                                printOldest();
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                        }
                    } while(opcao != 7);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Bye Bye");
            }

        } while(opcao != 5);
    }

}
