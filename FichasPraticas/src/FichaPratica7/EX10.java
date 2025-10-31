package FichaPratica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX10 {

    public static void printAll() throws FileNotFoundException {

        File file = new File("src/FichaPratica7/FichaPratica07/exercicio_10.csv");

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

    public static void moreCourses() throws FileNotFoundException{
        File file = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/exercicio_10.csv");

        Scanner sc = new Scanner(file);

        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        String[] studentNames = new String[100];
        int[] courseCount = new int[100];
        int size = 0;

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String [] names = line.split(",");

            String name = names[0];

            boolean found = false;

            for (int i = 0; i < size; i++) {
                if (studentNames[i].equalsIgnoreCase(name)) {
                    courseCount[i]++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                studentNames[size] = name;
                courseCount[size] = 1;
                size++;
            }
        }

        sc.close();

        System.out.println();
        System.out.println("Alunos inscritos em mais de um curso:");
        boolean anyFound = false;

        for (int i = 0; i < size; i++) {
            if (courseCount[i] > 1) {
                System.out.println("- " + studentNames[i] + " (" + courseCount[i] + " cursos)");
                anyFound = true;
            }
        }

        if (!anyFound) {
            System.out.println("Nenhum aluno está inscrito em mais de um curso.");
        }
    }

    public static void totalNum() throws FileNotFoundException{
        File file = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/exercicio_10.csv");

        Scanner sc = new Scanner(file);

        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        int totalStudents = 0;
        String[] studentNames = new String[100];
        int[] courseCount = new int[100];
        int size = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] fields = line.split(",");
            String name = fields[0];

            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (studentNames[i].equalsIgnoreCase(name)) {
                    courseCount[i]++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                studentNames[size] = name;
                courseCount[size] = 1;
                size++;
            }

            totalStudents++;
        }

        sc.close();

        int duplicates = 0;
        for (int i = 0; i < size; i++) {
            if (courseCount[i] > 1) {
                duplicates++;
            }
        }

        System.out.println();
        System.out.println("Número total de formandos: " + totalStudents);
        System.out.println("Número de alunos únicos: " + size);
        System.out.println("Alunos inscritos em mais de um curso: " + duplicates);
    }

    public static void createStudent() throws FileNotFoundException{

        File file = new File("src/FichaPratica7/FichaPratica07/exercicio_10.csv");

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Numero de matricula: ");
        int number = input.nextInt();
        input.nextLine();

        System.out.print("Curso: ");
        String course = input.nextLine();

        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Idade: ");
        int age = input.nextInt();

        File tempFile = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/temp.csv");
        Scanner sc = new Scanner(file);
        java.io.PrintWriter printWriter = new java.io.PrintWriter(tempFile);

        while (sc.hasNextLine()) {
            printWriter.println(sc.nextLine());
        }

        printWriter.println(name + "," + number + "," + course + "," + email + "," + age);

        sc.close();
        printWriter.close();

        file.delete();
        tempFile.renameTo(file);

        System.out.println("Formando criado com sucesso!");
    }

    public static void editStudent() throws FileNotFoundException{
        File file = new File("src/FichaPratica7/FichaPratica07/exercicio_10.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        String [] lines = new String[200];
        int size = 0;

        while(sc.hasNextLine()){
            lines[size] = sc.nextLine();
            size++;
        }

        sc.close();

        System.out.println("Introduza o numero do formando a editar: ");
        int number = input.nextInt();

        boolean found = false;

        for (int i = 1; i < size; i++){
            String [] data = lines[i].split(",");
            if (Integer.parseInt(data[1]) == number){
                found = true;
                System.out.println("Nome: " + data[0]);
                String name = input.nextLine();

                System.out.print("Novo curso (" + data[2] + "): ");
                String course = input.nextLine();
                if (course.equals("")) course = data[2];

                System.out.print("Novo email (" + data[3] + "): ");
                String email = input.nextLine();
                if (email.equals("")) email = data[3];

                System.out.print("Nova idade (" + data[4] + "): ");
                String ageStr = input.nextLine();
                if (ageStr.equals("")) ageStr = data[4];

                lines[i] = name + "," + data[1] + "," + course + "," + email + "," + ageStr;
                break;
            }
        }

        if(!found) {
            System.out.println("nao ha");
            return;
        }

        File tempFile = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/temp.csv");
        java.io.PrintStream ps = new java.io.PrintStream(tempFile);

        for (int i = 0; i < size; i++) {
            ps.println(lines[i]);
        }
        ps.close();

        file.delete();
        tempFile.renameTo(file);

        System.out.println("Ta pronto!");
    }

    public static void deleteStudent() throws FileNotFoundException {

        File file = new File("src/FichaPratica7/FichaPratica07/exercicio_01_Alternativa02.txt");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        String[] lines = new String[200];
        int size = 0;

        while (sc.hasNextLine()) {
            lines[size] = sc.nextLine();
            size++;
        }

        sc.close();

        System.out.print("Introduza o numero do formando a eliminar: ");
        int number = input.nextInt();

        File tempFile = new File("soft-dev/FichasPraticas/src/FichaPratica7/FichaPratica07/temp.csv");
        java.io.PrintStream ps = new java.io.PrintStream(tempFile);

        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                ps.println(lines[i]);
                continue;
            }

            String[] data = lines[i].split(",");
            if (Integer.parseInt(data[1]) == number) {
                found = true;
                System.out.println("Formando " + data[0] + " eliminado!");
                continue;
            }

            ps.println(lines[i]);
        }

        ps.close();
        file.delete();
        tempFile.renameTo(file);

        if (!found) {
            System.out.println("Nao encontrado!");
        } else {
            System.out.println("Removido!");
        }
    }

    static void main(String[] args) throws FileNotFoundException {

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
                        System.out.println("2. Dados do formando por no de matricula");
                        System.out.println("3. Lista de formandos por curso");
                        System.out.println("4. Imprimir aluno mais velho");
                        System.out.println("5. Imprimir alunos que estao inscritos em mais de um curso");
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
                                moreCourses();
                                break;
                            case 6:
                                totalNum();
                                break;
                        }
                    } while(opcao != 7);
                    break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    editStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                default:
                    System.out.println("Bye Bye");
            }

        } while(opcao != 5);
    }

}
