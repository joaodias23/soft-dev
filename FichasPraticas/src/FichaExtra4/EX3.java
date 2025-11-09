package FichaExtra4;

import java.io.*;
import java.util.Scanner;

public class EX3 {



    public static void menu() throws IOException{

        Scanner input = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Gerir Base de Dados");
            System.out.println("2. Consultar Clientes");
            System.out.println("3. Consultar Quartos Disponíveis");
            System.out.println("4. Consultar Reservas");
            System.out.println("5. Registar Nova Reserva");
            System.out.println("6. Dashboard de Análise");
            System.out.println("7. Galeria");
            System.out.println("8. Fechar X");
            System.out.print("\nFaxabor: ");
            opcao = input.nextInt();

            switch (opcao){
                case 1:

                    int opcao1;

                    do{
                        System.out.println("Clientes:");
                        System.out.println("    1. Novo Cliente");
                        System.out.println("    2. Atualizar Contactos do Cliente");
                        System.out.println("Temas:");
                        System.out.println("    3. Novo Tema");
                        System.out.println("Quartos:");
                        System.out.println("    4. Novo Quarto");
                        System.out.println("Autenticação:");
                        System.out.println("    5. Novas Credenciais");
                        System.out.println("    6. Excluir Credenciais");
                        System.out.println("Produtos:");
                        System.out.println("    7. Novo Produto");
                        System.out.println("8. Fechar X");
                        System.out.print("\nFaxabor: ");
                        opcao1 = input.nextInt();

                        switch (opcao1){
                            case 1:
                                novoCliente();
                                break;
                            case 2:
                                atualizarCliente();
                                break;
                            case 3:
                                novoTema();
                                break;
                            case 4:
                                novoQuarto();
                                break;
                            case 5:
                                novasCredenciais();
                                break;
                            case 6:
                                excluirCredenciais();
                                break;
                            case 7:
                                novoProduto();
                                break;
                        }
                    } while (opcao1 != 8);
                    break;
                case 2:

                    do{
                        System.out.println("Consultar Clientes:");
                        System.out.println("1. Por idClientes");
                        System.out.println("2. Por telemovel");
                        System.out.println("3. Por email");
                        System.out.println("4. Fechar X");
                        System.out.print("\nFaxabor: ");
                        opcao = input.nextInt();

                        switch (opcao){
                            case 1:
                                consultarId();
                                break;
                            case 2:
                                consultarTelemovel();
                                break;
                            case 3:
                                consultarEmail();
                                break;
                        }
                    } while (opcao != 4);
                    break;
                case 3:

                    do{
                        System.out.println("Consultar Quartos Disponíveis:");
                        System.out.println("1. Todos os quartos disponíveis");
                        System.out.println("2. Por tema");
                        System.out.println("3. Por tipo");
                        System.out.println("4. Fechar X");
                        System.out.print("\nFaxabor: ");
                        opcao = input.nextInt();

                        switch (opcao){
                            case 1:
                                // todosQuartos();
                                break;
                            case 2:
                                // temaQuartos();
                                break;
                            case 3:
                                // tipoQuartos();
                                break;
                        }
                    } while (opcao != 4);
                    break;
                case 4:

                    do{
                        System.out.println("Consultar Reservas:");
                        System.out.println("1. Consultar Histórico de Reservas");
                        System.out.println("2. Consultar Reservas Ativas");
                        System.out.println("3. Fechar X");
                        System.out.print("\nFaxabor: ");
                        opcao = input.nextInt();

                        switch (opcao){
                            case 1:
                                // consultarHistoricoReservas();
                                break;
                            case 2:
                                // consultarReservasAtivas();
                                break;
                        }
                    } while (opcao != 3);
                    break;
                case 5:
                    // registarNovaReserva();
                    break;
                case 6:

                    do{
                        System.out.println("Dashboard:");
                        System.out.println("1. Receita Total por Anos");
                        System.out.println("2. Despesa Total por Anos");
                        System.out.println("3. Lucro por Anos");
                        System.out.println("4. Melhor Cliente");
                        System.out.println("5. Cliente Mais Consumista | Produto Mais Comprado");
                        System.out.println("6. Cliente Mais Presente");
                        System.out.println("7. Tema Mais Procurado");
                        System.out.println("8. Tema Mais Lucrativo");
                        System.out.println("9. Tema Menos Lucrativo");
                        System.out.println("10. Produto/Serviço Mais Procurado");
                        System.out.println("11. Produto/Serviço Menos Procurado");
                        System.out.println("12. Produto/Serviço Mais Lucrativo");
                        System.out.println("13. Fechar X");
                        System.out.print("\nFaxabor: ");
                        opcao = input.nextInt();

                        switch (opcao){
                            case 1:
                                // receitaTotalAnos();
                                break;
                            case 2:
                                // despesaTotalAnos();
                                break;
                            case 3:
                                // lucroAnos();
                                break;
                            case 4:
                                // melhorCliente();
                                break;
                            case 5:
                                // clienteConsumista();
                                break;
                            case 6:
                                // clientePresente();
                                break;
                            case 7:
                                // temaMaisProcurado();
                                break;
                            case 8:
                                // temaMaisLucrativo();
                                break;
                            case 9:
                                // temaMenosLucrativo();
                                break;
                            case 10:
                                // produtoMaisProcurado();
                                break;
                            case 11:
                                // produtoMenosProcurado();
                                break;
                            case 12:
                                // produtoMaisLucrativo();
                                break;
                        }
                    } while (opcao != 13);
                    break;
                case 7:
                    break;
            }
        }while(opcao != 8);

    }

    public static void consultarEmail() throws IOException {
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/clientesHotel.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        System.out.print("Email do cliente que deseja consultar: ");
        String email = input.nextLine();
        boolean found = false;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] array = line.split(";");

            if (array[4].equalsIgnoreCase(email)) {
                found = true;
                System.out.println("\n------------------ Cliente Encontrado ------------------");
                System.out.println("ID: " + array[0]);
                System.out.println("Nome: " + array[1]);
                System.out.println("Data de Nascimento: " + array[2]);
                System.out.println("Telemóvel: " + array[3]);
                System.out.println("Email: " + array[4]);
                System.out.println("----------------- Estilo Mesmo À Vitor -----------------\n");
                break;
            }
        }

        sc.close();

        if (!found) {
            System.out.println("Não há, amigo");
        }
    }

    public static void consultarTelemovel() throws IOException {
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/clientesHotel.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        System.out.print("Telemóvel do cliente: ");
        String telemovel = input.nextLine();
        boolean found = false;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] array = line.split(";");

            if (array[3].equals(telemovel)) {
                found = true;
                System.out.println("\n------------------ Cliente Encontrado ------------------");
                System.out.println("ID: " + array[0]);
                System.out.println("Nome: " + array[1]);
                System.out.println("Data de Nascimento: " + array[2]);
                System.out.println("Telemóvel: " + array[3]);
                System.out.println("Email: " + array[4]);
                System.out.println("----------------- Estilo Mesmo À Vitor -----------------\n");
                break;
            }
        }

        sc.close();

        if (!found) {
            System.out.println("Não ten");
        }
    }

    public static void consultarId() throws IOException {
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/clientesHotel.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        System.out.print("ID do customer (ex: c-0001): ");
        String id = input.nextLine();
        boolean found = false;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] array = line.split(";");

            if (array[0].equalsIgnoreCase(id)) {
                found = true;
                System.out.println("\n------------------ Cliente Encontrado ------------------");
                System.out.println("ID: " + array[0]);
                System.out.println("Nome: " + array[1]);
                System.out.println("Data de Nascimento: " + array[2]);
                System.out.println("Telemóvel: " + array[3]);
                System.out.println("Email: " + array[4]);
                System.out.println("----------------- Estilo Mesmo À Vitor -----------------\n");
                break;
            }
        }

        sc.close();

        if (!found) {
            System.out.println("Não encontrei");
        }
    }

    public static void novoProduto() throws IOException {
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/produtosHotel.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        int lastId = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] arrayLine = line.split(";");
            String[] idArray = arrayLine[0].split("-");

            int id = Integer.parseInt(idArray[1]);

            if (id > lastId){
                lastId = id;
            }
        }
        sc.close();

        System.out.print("Nome do Produto: ");
        String nome = input.nextLine();

        System.out.print("Preço: ");
        double preco = input.nextDouble();

        int newId = lastId + 1;
        String formattedId = String.format("%04d", newId);

        String newLine = "p-" + formattedId + ";" + nome + ";" + preco;

        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        if (file.length() > 0) {
            bw.newLine();
        }
        bw.write(newLine);
        bw.close();

        System.out.println("Produto adicionado com sucesso!");
    }

    public static void excluirCredenciais() throws IOException {
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/loginHotel.txt");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o mano que deseja eliminar: ");
        String utilizador = input.nextLine();

        String fileContent = "";
        boolean found = false;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] array = line.split(";");

            if (!array[0].equalsIgnoreCase(utilizador)) {
                if (!fileContent.isEmpty()) {
                    fileContent += System.lineSeparator();
                }
                fileContent += line;
            } else {
                found = true;
            }
        }

        sc.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));
        bw.write(fileContent);
        bw.close();

        System.out.println("Mano " + utilizador + " eliminado com sucesso!");
    }

    public static void novasCredenciais() throws IOException {
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/loginHotel.txt");

        Scanner input = new Scanner(System.in);

        System.out.print("User: ");
        String utilizador = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        String newLine = utilizador + ";" + password;

        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        BufferedWriter bw = new BufferedWriter(pw);
        if (file.length() > 0) {
            bw.newLine();
        }
        bw.write(newLine);
        bw.close();

        System.out.println("Credenciais adicionadas com sucesso!");
    }

    public static void novoQuarto() throws IOException {
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/quartosHotel.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        int lastId = 0;

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String [] arrayLine = line.split(";");
            if(Integer.parseInt(arrayLine[0]) > lastId){
                lastId = Integer.parseInt(arrayLine[0]);
            }
        }
        sc.close();

        int newRoomNumber = lastId + 1;

        System.out.print("Tema do Quarto (t-0n): ");
        String temaId = input.nextLine();

        System.out.print("Tipo de Quarto (SINGLE/DOUBLE/SUITE): ");
        String tipo = input.nextLine().toUpperCase();

        String newLine = newRoomNumber + ";" + temaId + ";" + tipo;

        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        BufferedWriter bw = new BufferedWriter(pw);
        if (file.length() > 0) {
            bw.newLine();
        }
        bw.write(newLine);
        bw.close();

        System.out.println("Quarto adicionado com sucesso!");
    }

    public static void novoTema() throws IOException {

        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/temasHotel.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        int lastId = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String [] arrayLine = line.split(";");
            String [] array0Line = arrayLine[0].split("-");
            int id = Integer.parseInt(array0Line[1]);
            if(id > lastId){
                lastId = id;
            }
        }
        sc.close();

        System.out.print("Nome do Tema: ");
        String nome = input.nextLine();

        System.out.print("Preço Multiplicador (n.n): ");
        double preco = input.nextDouble();

        int newId = lastId + 1;
        String formattedId = String.format("%02d", newId);

        String newLine = "t-" + formattedId + ";" + nome + ";" + preco;

        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        BufferedWriter bw = new BufferedWriter(pw);
        if (file.length() > 0) {
            bw.newLine();
        }
        bw.write(newLine);
        bw.close();

        System.out.println("Tema adicionado com sucesso!");
    }

    public static void atualizarCliente() throws IOException{
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/clientesHotel.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        String fileLine = "";
        boolean found = false;

        System.out.print("Introduza o ID que procura: ");
        String id = input.next();

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String [] array = line.split(";");

            if(array[0].equalsIgnoreCase(id)){
                System.out.println("\nQual quer atualizar?");
                System.out.println("1. Telemóvel");
                System.out.println("2. Email");
                System.out.print("Faxabor: ");
                int opcao = input.nextInt();
                input.nextLine();

                if(opcao == 1){
                    System.out.print("Novo numero: ");
                    String novoNumero = input.nextLine();
                    array[3] = novoNumero;
                } else if (opcao == 2){
                    System.out.print("Novo email: ");
                    String novoEmail = input.nextLine();
                    array[4] = novoEmail;
                }

                line = String.join(";", array);
                System.out.println("\nCliente atualizado com sucesso!");
            }
            if (!fileLine.isEmpty()) {
                fileLine += System.lineSeparator();
            }
            fileLine += line;
        }

        sc.close();

        PrintWriter pw = new PrintWriter(new FileWriter(file, false)); // overwrite
        BufferedWriter bw = new BufferedWriter(pw);
        bw.write(fileLine);
        bw.close();
    }

    public static void novoCliente() throws IOException {
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/clientesHotel.csv");

        Scanner sc = new Scanner(file);

        Scanner input = new Scanner(System.in);

        int lastId = 0;

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String [] arrayLine = line.split(";");
            String [] array0Line = arrayLine[0].split("-");
            int id = Integer.parseInt(array0Line[1]);
            if(id > lastId){
                lastId = id;
            }
        }
        sc.close();

        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Data de Nascimento (dd-mm-aaaa): ");
        String data = input.next();
        System.out.print("Telemovel: ");
        String telemovel = input.next();
        System.out.print("Email: ");
        String email = input.next();

        int newId = lastId + 1;
        String formattedId = String.format("%04d", newId);
        String newLine = "c-" + formattedId + ";" + nome + ";" + telemovel + ";" + email;

        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        BufferedWriter bw = new BufferedWriter(pw);
        if (file.length() > 0) {
            bw.newLine();
        }
        bw.write(newLine);
        bw.close();

        System.out.println("Cliente adicionado com sucesso!");
    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        boolean loggedIn = false;

        do{
            System.out.print("Login: ");
            String login = input.next();
            System.out.print("Password: ");
            String password = input.next();

            File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/loginHotel.txt");
            Scanner sc = new Scanner(file);

            boolean found = false;

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String [] array = line.split(";");

                if(array[0].equals(login) && array[1].equals(password)){
                    System.out.println("\nLogin Successful");
                    loggedIn = true;
                    found = true;
                    break;
                }
            }

            if(!found){
                System.out.println("\nCredenciais Inválidas.");
            }

            sc.close();

        } while (!loggedIn);

        menu();
    }
}