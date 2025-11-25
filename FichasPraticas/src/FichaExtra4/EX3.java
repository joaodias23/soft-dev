package FichaExtra4;

import java.io.*;
import java.util.Scanner;

public class EX3 {

    public static void printSpa() throws IOException{
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/galeriaSpaHotel.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        System.out.println();
    }

    public static void printQuarto() throws IOException{
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/galeriaQuartoHotel.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        System.out.println();
    }

    public static void printFachada() throws IOException{
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/galeriaFachadaHotel.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        System.out.println();
    }

    public static void produtoMaisLucrativo() throws IOException {
        File fileServicos = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/servicoQuartoHotel.csv");
        Scanner scProdutos = new Scanner(fileServicos);

        String produtoTop = "";
        double maiorLucro = 0;

        while (scProdutos.hasNextLine()) {
            String line = scProdutos.nextLine();
            String[] cols = line.split(";");

            String produtoAtual = cols[2];
            double totalProduto = 0;

            Scanner scContador = new Scanner(fileServicos);
            while (scContador.hasNextLine()) {
                String[] p = scContador.nextLine().split(";");
                if (p[2].equals(produtoAtual)) {
                    int qtd = Integer.parseInt(p[3]);
                    double preco = Double.parseDouble(p[4]);
                    totalProduto += qtd * preco;
                }
            }
            scContador.close();

            if (totalProduto > maiorLucro) {
                maiorLucro = totalProduto;
                produtoTop = produtoAtual;
            }
        }
        scProdutos.close();

        System.out.println("\n===== Produto/Serviço Mais Lucrativo =====");
        System.out.println("Produto/Serviço: " + produtoTop);
        System.out.println("Lucro Gerado: " + maiorLucro + "€");
        System.out.println("========================================\n");
    }

    public static void produtoMenosProcurado() throws IOException {
        File fileServicos = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/servicoQuartoHotel.csv");
        Scanner scProdutos = new Scanner(fileServicos);

        String produtoTop = "";
        int menorQtd = Integer.MAX_VALUE;

        while (scProdutos.hasNextLine()) {
            String line = scProdutos.nextLine();
            String[] cols = line.split(";");

            String produtoAtual = cols[2];
            int totalProduto = 0;

            Scanner scContador = new Scanner(fileServicos);
            while (scContador.hasNextLine()) {
                String[] p = scContador.nextLine().split(";");
                if (p[2].equals(produtoAtual)) {
                    totalProduto += Integer.parseInt(p[3]);
                }
            }
            scContador.close();

            if (totalProduto < menorQtd) {
                menorQtd = totalProduto;
                produtoTop = produtoAtual;
            }
        }
        scProdutos.close();

        System.out.println("\n===== Produto/Serviço Menos Procurado =====");
        System.out.println("Produto/Serviço: " + produtoTop);
        System.out.println("Unidades Vendidas: " + menorQtd);
        System.out.println("=========================================\n");
    }

    public static void produtoMaisProcurado() throws IOException {
        File fileServicos = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/servicoQuartoHotel.csv");
        Scanner scProdutos = new Scanner(fileServicos);

        String produtoTop = "";
        int maiorQtd = 0;

        while (scProdutos.hasNextLine()) {
            String line = scProdutos.nextLine();
            String[] cols = line.split(";");

            String produtoAtual = cols[2];
            int totalProduto = 0;

            Scanner scContador = new Scanner(fileServicos);
            while (scContador.hasNextLine()) {
                String[] p = scContador.nextLine().split(";");
                if (p[2].equals(produtoAtual)) {
                    totalProduto += Integer.parseInt(p[3]);
                }
            }
            scContador.close();

            if (totalProduto > maiorQtd) {
                maiorQtd = totalProduto;
                produtoTop = produtoAtual;
            }
        }
        scProdutos.close();

        System.out.println("\n===== Produto/Serviço Mais Procurado =====");
        System.out.println("Produto/Serviço: " + produtoTop);
        System.out.println("Unidades Vendidas: " + maiorQtd);
        System.out.println("========================================\n");
    }

    public static void temaMenosLucrativo() throws IOException {
        File fileReservas = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/reservasHotel.csv");
        File fileQuartos  = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/quartosHotel.csv");
        File fileTemas    = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/temasHotel.csv");

        Scanner scTemas = new Scanner(fileTemas);

        String temaMenosLucrativo = "";
        double menorLucroTotal = Double.MAX_VALUE;

        while (scTemas.hasNextLine()) {
            String[] t = scTemas.nextLine().split(";");
            String temaAtual = t[0].trim();
            double multiplicador = Double.parseDouble(t[2].trim());

            double lucroTema = 0;

            Scanner scRes = new Scanner(fileReservas);
            while (scRes.hasNextLine()) {
                String[] r = scRes.nextLine().split(";");
                String numQuarto = r[4].trim();

                Scanner scQ = new Scanner(fileQuartos);
                String tipoQuarto = "";
                String temaQuarto = "";
                while (scQ.hasNextLine()) {
                    String[] q = scQ.nextLine().split(";");
                    if (q[0].trim().equals(numQuarto)) {
                        temaQuarto = q[1].trim();
                        tipoQuarto = q[2].trim();
                        break;
                    }
                }
                scQ.close();

                if (!temaQuarto.equals(temaAtual)) continue;

                String[] dataIni = r[1].split("/");
                String[] dataFim = r[2].split("/");

                int diaI = Integer.parseInt(dataIni[0]);
                int mesI = Integer.parseInt(dataIni[1]);
                int anoI = Integer.parseInt(dataIni[2]);

                int diaF = Integer.parseInt(dataFim[0]);
                int mesF = Integer.parseInt(dataFim[1]);
                int anoF = Integer.parseInt(dataFim[2]);

                int noites = (anoF * 360 + mesF * 30 + diaF) - (anoI * 360 + mesI * 30 + diaI);

                double precoBase = 0;
                if (tipoQuarto.equalsIgnoreCase("SINGLE")) precoBase = 95;
                if (tipoQuarto.equalsIgnoreCase("DOUBLE")) precoBase = 110;
                if (tipoQuarto.equalsIgnoreCase("SUITE")) precoBase = 250;

                double receita = noites * precoBase * multiplicador;
                double despesa = noites * (17.5 + 12.75 + 7.25);
                lucroTema += receita - despesa;
            }
            scRes.close();

            if (lucroTema < menorLucroTotal) {
                menorLucroTotal = lucroTema;
                temaMenosLucrativo = temaAtual;
            }
        }
        scTemas.close();

        System.out.println("\n===== Tema Menos Lucrativo =====");
        System.out.println("Tema: " + temaMenosLucrativo);
        System.out.println("Lucro: " + menorLucroTotal + "€");
        System.out.println("================================\n");
    }

    public static void temaMaisLucrativo() throws IOException {

        File fileReservas = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/reservasHotel.csv");
        File fileQuartos  = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/quartosHotel.csv");
        File fileTemas    = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/temasHotel.csv");

        Scanner scQuartos = new Scanner(fileQuartos);

        String temaTop = "";
        double maxLucro = 0;

        while (scQuartos.hasNextLine()) {
            String lineQ = scQuartos.nextLine();
            String[] q = lineQ.split(";");
            String numQuarto = q[0];
            String tema = q[1];
            String tipo = q[2];

            double totalLucro = 0;

            Scanner scReservas = new Scanner(fileReservas);
            while (scReservas.hasNextLine()) {
                String lineR = scReservas.nextLine();
                String[] r = lineR.split(";");

                if (r[4].equals(numQuarto)) {
                    String dataIni = r[1];
                    String dataFim = r[2];

                    int diaI = Integer.parseInt(dataIni.split("/")[0]);
                    int mesI = Integer.parseInt(dataIni.split("/")[1]);
                    int anoI = Integer.parseInt(dataIni.split("/")[2]);

                    int diaF = Integer.parseInt(dataFim.split("/")[0]);
                    int mesF = Integer.parseInt(dataFim.split("/")[1]);
                    int anoF = Integer.parseInt(dataFim.split("/")[2]);

                    int diasInicioTotal = anoI * 360 + mesI * 30 + diaI;
                    int diasFimTotal    = anoF * 360 + mesF * 30 + diaF;

                    int noites = diasFimTotal - diasInicioTotal;

                    double precoBase = 0;
                    if (tipo.equalsIgnoreCase("SINGLE")) precoBase = 95;
                    if (tipo.equalsIgnoreCase("DOUBLE")) precoBase = 110;
                    if (tipo.equalsIgnoreCase("SUITE"))  precoBase = 250;

                    double multiplicador = 1;
                    Scanner scTemas = new Scanner(fileTemas);
                    while (scTemas.hasNextLine()) {
                        String[] t = scTemas.nextLine().split(";");
                        if (t[0].equals(tema)) {
                            multiplicador = Double.parseDouble(t[2]);
                            break;
                        }
                    }
                    scTemas.close();

                    double valorReserva = noites * precoBase * multiplicador;
                    totalLucro += valorReserva;
                }
            }
            scReservas.close();

            if (totalLucro > maxLucro) {
                maxLucro = totalLucro;
                temaTop = tema;
            }
        }

        scQuartos.close();

        System.out.println("\n===== Tema Mais Lucrativo =====");
        System.out.println("Tema: " + temaTop);
        System.out.println("Lucro Total: " + maxLucro + "€");
        System.out.println("================================\n");
    }

    public static void temaMaisProcurado() throws IOException {

        File fileReservas = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/reservasHotel.csv");
        File fileQuartos  = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/quartosHotel.csv");

        Scanner scMain = new Scanner(fileQuartos);

        String temaTop = "";
        int maxNoites = 0;

        while (scMain.hasNextLine()) {
            String lineQ = scMain.nextLine();
            String[] q = lineQ.split(";");
            String tema = q[1];

            int totalNoites = 0;

            Scanner scR = new Scanner(fileReservas);
            while (scR.hasNextLine()) {
                String lineR = scR.nextLine();
                String[] r = lineR.split(";");

                String numQuarto = r[4];

                if (q[0].equals(numQuarto)) {
                    String dataIni = r[1];
                    String dataFim = r[2];

                    int diaI = Integer.parseInt(dataIni.split("/")[0]);
                    int mesI = Integer.parseInt(dataIni.split("/")[1]);
                    int anoI = Integer.parseInt(dataIni.split("/")[2]);

                    int diaF = Integer.parseInt(dataFim.split("/")[0]);
                    int mesF = Integer.parseInt(dataFim.split("/")[1]);
                    int anoF = Integer.parseInt(dataFim.split("/")[2]);

                    int diasInicioTotal = anoI * 360 + mesI * 30 + diaI;
                    int diasFimTotal    = anoF * 360 + mesF * 30 + diaF;

                    totalNoites += diasFimTotal - diasInicioTotal;
                }
            }
            scR.close();

            if (totalNoites > maxNoites) {
                maxNoites = totalNoites;
                temaTop = tema;
            }
        }

        scMain.close();

        System.out.println("\n===== Tema Mais Procurado =====");
        System.out.println("Tema: " + temaTop);
        System.out.println("Noites Totais: " + maxNoites);
        System.out.println("================================\n");
    }

    public static void clientePresente() throws IOException {

        File fileReservas = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/reservasHotel.csv");
        Scanner scMain = new Scanner(fileReservas);

        String clienteTop = "";
        int maxNoites = 0;

        while (scMain.hasNextLine()) {
            String line = scMain.nextLine();
            String[] r = line.split(";");

            String idCliente = r[3];
            String dataIni   = r[1];
            String dataFim   = r[2];

            int diaI = Integer.parseInt(dataIni.split("/")[0]);
            int mesI = Integer.parseInt(dataIni.split("/")[1]);
            int anoI = Integer.parseInt(dataIni.split("/")[2]);

            int diaF = Integer.parseInt(dataFim.split("/")[0]);
            int mesF = Integer.parseInt(dataFim.split("/")[1]);
            int anoF = Integer.parseInt(dataFim.split("/")[2]);

            int diasInicioTotal = anoI * 360 + mesI * 30 + diaI;
            int diasFimTotal    = anoF * 360 + mesF * 30 + diaF;

            int noites = diasFimTotal - diasInicioTotal;

            int totalNoites = 0;
            Scanner scC = new Scanner(new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/reservasHotel.csv"));
            while (scC.hasNextLine()) {
                String[] c = scC.nextLine().split(";");
                if (c[3].equals(idCliente)) {
                    int diaStart = Integer.parseInt(c[1].split("/")[0]);
                    int mesStart = Integer.parseInt(c[1].split("/")[1]);
                    int anoStart = Integer.parseInt(c[1].split("/")[2]);

                    int diaEnd = Integer.parseInt(c[2].split("/")[0]);
                    int mesEnd = Integer.parseInt(c[2].split("/")[1]);
                    int anoEnd = Integer.parseInt(c[2].split("/")[2]);

                    int diasStartTotal = anoStart * 360 + mesStart * 30 + diaStart;
                    int diasEndTotal   = anoEnd * 360 + mesEnd * 30 + diaEnd;

                    totalNoites += diasEndTotal - diasStartTotal;
                }
            }
            scC.close();

            if (totalNoites > maxNoites) {
                maxNoites = totalNoites;
                clienteTop = idCliente;
            }
        }

        scMain.close();

        System.out.println("\n===== Cliente Mais Presente =====");
        System.out.println("Cliente: " + clienteTop);
        System.out.println("Noites Passadas: " + maxNoites);
        System.out.println("================================\n");
    }

    public static void clienteConsumista() throws IOException {
        File fileServicos = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/servicoQuartoHotel.csv");
        Scanner scMain = new Scanner(fileServicos);

        String clienteTop = "";
        double maiorGasto = 0;

        String produtoTop = "";
        int maiorQtd = 0;

        while (scMain.hasNextLine()) {
            String line = scMain.nextLine();
            String[] cols = line.split(";");

            String idCliente = cols[0];
            String produto   = cols[2];

            double totalCliente = 0;
            Scanner scC = new Scanner(fileServicos);
            while (scC.hasNextLine()) {
                String[] c = scC.nextLine().split(";");
                if (c[0].equals(idCliente)) {
                    int qtd = Integer.parseInt(c[3]);
                    double preco = Double.parseDouble(c[4]);
                    totalCliente += qtd * preco;
                }
            }
            scC.close();

            if (totalCliente > maiorGasto) {
                maiorGasto = totalCliente;
                clienteTop = idCliente;
            }

            int totalProduto = 0;
            Scanner scP = new Scanner(fileServicos);
            while (scP.hasNextLine()) {
                String[] p = scP.nextLine().split(";");
                if (p[2].equals(produto)) {
                    totalProduto += Integer.parseInt(p[3]);
                }
            }
            scP.close();

            if (totalProduto > maiorQtd) {
                maiorQtd = totalProduto;
                produtoTop = produto;
            }
        }

        scMain.close();

        System.out.println("\n===== Cliente Mais Consumista =====");
        System.out.println("Cliente: " + clienteTop);
        System.out.println("Total Gasto: " + maiorGasto + "€");

        System.out.println("\n===== Produto Mais Comprado =====");
        System.out.println("Produto: " + produtoTop);
        System.out.println("Quantidade: " + maiorQtd);

        System.out.println("===================================\n");
    }

    public static void melhorCliente() throws IOException {

        File fileReservas = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/reservasHotel.csv");
        File fileQuartos  = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/quartosHotel.csv");
        File fileTemas    = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/temasHotel.csv");

        Scanner scRes = new Scanner(fileReservas);

        String melhorCliente = "";
        double maiorValor = 0;

        while (scRes.hasNextLine()) {

            String lineR = scRes.nextLine();
            String[] r = lineR.split(";");

            String dataIni   = r[1];
            String dataFim   = r[2];
            String idCliente = r[3];
            String numQuarto = r[4];

            int diaI = Integer.parseInt(dataIni.split("/")[0]);
            int mesI = Integer.parseInt(dataIni.split("/")[1]);
            int anoI = Integer.parseInt(dataIni.split("/")[2]);

            int diaF = Integer.parseInt(dataFim.split("/")[0]);
            int mesF = Integer.parseInt(dataFim.split("/")[1]);
            int anoF = Integer.parseInt(dataFim.split("/")[2]);

            int diasInicioTotal = anoI * 360 + mesI * 30 + diaI;
            int diasFimTotal = anoF * 360 + mesF * 30 + diaF;

            int noites = diasFimTotal - diasInicioTotal;

            Scanner scQ = new Scanner(fileQuartos);
            String tipo = "";
            String tema = "";

            while (scQ.hasNextLine()) {
                String lineQ = scQ.nextLine();
                String[] q = lineQ.split(";");

                if (q[0].equals(numQuarto)) {
                    tema = q[1];
                    tipo = q[2];
                    break;
                }
            }
            scQ.close();

            Scanner scT = new Scanner(fileTemas);
            double multiplicador = 1;

            while (scT.hasNextLine()) {
                String lineT = scT.nextLine();
                String[] t = lineT.split(";");

                if (t[0].equals(tema)) {
                    multiplicador = Double.parseDouble(t[2]);
                    break;
                }
            }
            scT.close();

            double precoBase = 0;
            if (tipo.equalsIgnoreCase("SINGLE")) precoBase = 95;
            if (tipo.equalsIgnoreCase("DOUBLE")) precoBase = 110;
            if (tipo.equalsIgnoreCase("SUITE"))  precoBase = 250;

            double valorReserva = noites * precoBase * multiplicador;

            if (valorReserva > maiorValor) {
                maiorValor = valorReserva;
                melhorCliente = idCliente;
            }
        }

        scRes.close();

        if (melhorCliente.equals("")) {
            System.out.println("Nao existem reservas.");
        } else {
            System.out.println("\n===== Melhor Cliente =====");
            System.out.println("ID: " + melhorCliente);
            System.out.println("Total Gasto: " + maiorValor + "€");
            System.out.println("==========================\n");
        }
    }

    public static void lucroAnos() throws IOException {

        File fileReservas = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/reservasHotel.csv");
        File fileQuartos = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/quartosHotel.csv");

        Scanner sc = new Scanner(fileReservas);
        Scanner scQ;

        double[] receitaAno = new double[3000];
        double[] despesaAno = new double[3000];

        double precoSingle = 95;
        double precoDouble = 110;
        double precoSuite = 250;

        double limpezaDia = 17.5;
        double luzAguaDia = 12.75;
        double adminDia = 7.25;

        while (sc.hasNextLine()) {
            String[] array = sc.nextLine().split(";");

            String numQuarto = array[0];
            String dataInicio = array[1];
            String dataFim = array[2];

            int year1 = Integer.parseInt(dataInicio.split("/")[2]);
            int mes1 = Integer.parseInt(dataInicio.split("/")[1]);
            int day1 = Integer.parseInt(dataInicio.split("/")[0]);

            int year2 = Integer.parseInt(dataFim.split("/")[2]);
            int mes2 = Integer.parseInt(dataFim.split("/")[1]);
            int day2 = Integer.parseInt(dataFim.split("/")[0]);

            int noites = (year2 - year1) * 360 + (mes2 - mes1) * 30 + (day2 - day1);

            scQ = new Scanner(fileQuartos);
            String tipo = "";

            while (scQ.hasNextLine()) {
                String[] q = scQ.nextLine().split(";");

                if (q[0].equals(numQuarto)) {
                    tipo = q[2];
                    break;
                }
            }
            scQ.close();

            double precoNoite = 0;

            if (tipo.equalsIgnoreCase("SINGLE")){
                precoNoite = precoSingle;
            }
            else if (tipo.equalsIgnoreCase("DOUBLE")){
                precoNoite = precoDouble;
            }
            else if (tipo.equalsIgnoreCase("SUITE")){
                precoNoite = precoSuite;
            }

            double receita = noites * precoNoite;

            double despesa = noites * (limpezaDia + luzAguaDia + adminDia);

            receitaAno[year1] += receita;
            despesaAno[year1] += despesa;
        }

        sc.close();

        System.out.println("\n---------------- LUCRO POR ANOS ----------------");
        for (int ano = 2000; ano < 2100; ano++) {
            if (receitaAno[ano] > 0) {
                double lucro = receitaAno[ano] - despesaAno[ano];
                System.out.printf("%d: %.2f€\n", ano, lucro);
            }
        }
        System.out.println("------------------------------------------------\n");
    }

    public static void despesaTotalAnos() throws IOException {

        File fileReservas = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/reservasHotel.csv");

        Scanner sc = new Scanner(fileReservas);

        double[] limpezaAno = new double[3000];
        double[] luzAguaAno = new double[3000];
        double[] adminAno = new double[3000];
        double[] totalAno = new double[3000];

        double limpezaDia = 17.5;
        double luzAguaDia = 12.75;
        double adminDia = 7.25;

        while (sc.hasNextLine()) {
            String[] array = sc.nextLine().split(";");

            String dataInicio = array[1];
            String dataFim = array[2];

            int year1 = Integer.parseInt(dataInicio.split("/")[2]);
            int mes1 = Integer.parseInt(dataInicio.split("/")[1]);
            int day1 = Integer.parseInt(dataInicio.split("/")[0]);

            int year2 = Integer.parseInt(dataFim.split("/")[2]);
            int mes2 = Integer.parseInt(dataFim.split("/")[1]);
            int day2 = Integer.parseInt(dataFim.split("/")[0]);

            int noites = (year2 - year1) * 360 + (mes2 - mes1) * 30 + (day2 - day1);

            double custoLimpeza = noites * limpezaDia;
            double custoLuzAgua = noites * luzAguaDia;
            double custoAdmin = noites * adminDia;
            double custoTotal = custoLimpeza + custoLuzAgua + custoAdmin;

            limpezaAno[year1] += custoLimpeza;
            luzAguaAno[year1] += custoLuzAgua;
            adminAno[year1] += custoAdmin;
            totalAno[year1] += custoTotal;
        }

        sc.close();

        System.out.println("\n------------- DESPESA TOTAL POR ANOS -------------");
        for (int ano = 2000; ano < 2100; ano++) {
            if (totalAno[ano] > 0) {
                System.out.printf("\n%d:\n", ano);
                System.out.printf("    Limpeza: %.2f€\n", limpezaAno[ano]);
                System.out.printf("    Despesas Luz/Água: %.2f€\n", luzAguaAno[ano]);
                System.out.printf("    Custos Administrativos: %.2f€\n", adminAno[ano]);
                System.out.printf("    Total: %.2f€\n", totalAno[ano]);
            }
        }
        System.out.println("--------------------------------------------------\n");
    }

    public static void receitaTotalAnos() throws IOException {

        File fileReservas = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/reservasHotel.csv");
        File fileQuartos = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/quartosHotel.csv");
        File fileTemas = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/temasHotel.csv");

        Scanner sc = new Scanner(fileReservas);

        double precoSingle = 95;
        double precoDouble = 110;
        double precoSuite  = 250;

        double despesas = 17.5 + 12.75 + 7.25;

        double[] totalAno = new double[20];

        while (sc.hasNextLine()) {

            String linha = sc.nextLine();

            String[] array = linha.split(";");

            String dataInicio = array[1];
            String dataFim    = array[2];
            String idCliente  = array[3];
            String numQuarto  = array[4];

            int anoInicio = Integer.parseInt(dataInicio.split("/")[2]);

            int dia1 = Integer.parseInt(dataInicio.split("/")[0]);
            int mes1 = Integer.parseInt(dataInicio.split("/")[1]);
            int ano1 = Integer.parseInt(dataInicio.split("/")[2]);

            int dia2 = Integer.parseInt(dataFim.split("/")[0]);
            int mes2 = Integer.parseInt(dataFim.split("/")[1]);
            int ano2 = Integer.parseInt(dataFim.split("/")[2]);

            int noites = (ano2 - ano1) * 360 + (mes2 - mes1) * 30 + (dia2 - dia1);

            Scanner scQuartos = new Scanner(fileQuartos);
            String tipo = "";
            String tema = "";

            while (scQuartos.hasNextLine()) {

                String quaLine = scQuartos.nextLine();
                String[] qua = quaLine.split(";");

                if (qua[0].equals(numQuarto)) {
                    tema = qua[1];
                    tipo = qua[2];
                    break;
                }
            }
            scQuartos.close();

            Scanner scTemas = new Scanner(fileTemas);
            double multiplicador = 1.0;

            while (scTemas.hasNextLine()) {
                String tLine = scTemas.nextLine();
                String[] t = tLine.split(";");

                if (t[0].equals(tema)) {
                    multiplicador = Double.parseDouble(t[2]);
                    break;
                }
            }
            scTemas.close();

            double precoBase = 0;

            if (tipo.equalsIgnoreCase("SINGLE")){
                precoBase = precoSingle;
            }
            if (tipo.equalsIgnoreCase("DOUBLE")){
                precoBase = precoDouble;
            }
            if (tipo.equalsIgnoreCase("SUITE")){
                precoBase = precoSuite;
            }

            double lucro = (precoBase * multiplicador - despesas) * noites;

            totalAno[anoInicio - 2020] += lucro;
        }

        sc.close();

        System.out.println("\n---------- RECEITA TOTAL POR ANO ----------");

        for (int i = 0; i < totalAno.length; i++) {
            if (totalAno[i] != 0) {
                System.out.printf("%d: %.2f€\n", 2020 + i, totalAno[i]);
            }
        }

        System.out.println("-------------------------------------------\n");
    }

    public static void registarNovaReserva() throws IOException {

        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/reservasHotel.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        System.out.print("ID do Cliente (c-000n): ");
        String idCliente = input.nextLine();

        System.out.print("Número do Quarto: ");
        String numQuarto = input.nextLine();

        System.out.print("Data de Início (dd/mm/yyyy): ");
        String dataInicio = input.nextLine();

        System.out.print("Data de Fim (dd/mm/yyyy): ");
        String dataFim = input.nextLine();

        String dataInicioComplete = dataInicio.split("/")[2] + dataInicio.split("/")[1] + dataInicio.split("/")[0];
        String dataFimComplete = dataFim.split("/")[2] + dataFim.split("/")[1] + dataFim.split("/")[0];

        boolean disponivel = true;
        int lastId = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] array = line.split(";");
            String idReserva = array[0];
            String reservaInicio = array[1];
            String reservaFim = array[2];
            String reservaQuarto = array[4];

            String numeroIdStr = idReserva.substring(5);
            int numeroId = Integer.parseInt(numeroIdStr);
            if (numeroId > lastId) lastId = numeroId;

            String reservaInicioComplete = reservaInicio.split("/")[2] + reservaInicio.split("/")[1] + reservaInicio.split("/")[0];
            String reservaFimComplete = reservaFim.split("/")[2] + reservaFim.split("/")[1] + reservaFim.split("/")[0];

            if (reservaQuarto.equals(numQuarto)) {
                if (!(dataFimComplete.compareTo(reservaInicioComplete) < 0 || dataInicioComplete.compareTo(reservaFimComplete) > 0)) {
                    disponivel = false;
                    break;
                }
            }
        }

        sc.close();

        if (!disponivel) {
            System.out.println("Quarto não disponível nesse período. Aquela altura do mês é complicada...");
            return;
        }

        int novoIdNum = lastId + 1;
        String novoId = String.format("r-a%05d", novoIdNum);

        String novaReserva = novoId + ";" + dataInicio + ";" + dataFim + ";" + idCliente + ";" + numQuarto;

        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        if (file.length() > 0) {
            bw.newLine();
        }
        bw.write(novaReserva);
        bw.close();

        System.out.println("Reserva registada com sucesso! ID: " + novoId);
    }

    public static void consultarReservasAtivas() throws IOException {
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/reservasHotel.csv");
        Scanner sc = new Scanner(file);

        String dataAtual = "20240308";

        System.out.println("\n------------------ Reservas Ativas ------------------");

        boolean found = false;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] array = line.split(";");
            String[] partesDataFim = array[2].split("/");
            String dataFim = partesDataFim[2] + partesDataFim[1] + partesDataFim[0];

            if (dataFim.compareTo(dataAtual) > 0) {
                found = true;
                System.out.println("Reserva: " + array[0] + " | Inicio: " + array[1] + " | Fim: " + array[2] + " | Cliente: " + array[3] + " | Quarto: " + array[4]);
            }
        }

        if (!found) {
            System.out.println("Não existem reservas ativas, só passivas.");
        }

        System.out.println("-----------------------------------------------------\n");

        sc.close();
    }

    public static void consultarHistoricoReservas() throws IOException {

        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/reservasHotel.csv");

        Scanner sc = new Scanner(file);

        String dataAtual = "20240308";

        System.out.println("\n------------------ Histórico de Reservas ------------------");

        boolean found = false;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] array = line.split(";");
            String[] partesDataFim = array[2].split("/");
            String dataFim = partesDataFim[2] + partesDataFim[1] + partesDataFim[0];

            if (dataFim.compareTo(dataAtual) < 0) {
                found = true;
                System.out.println("Reserva: " + array[0] + " | Inicio: " + array[1] + " | Fim: " + array[2] + " | Cliente: " + array[3] + " | Quarto: " + array[4]);
            }
        }

        if (!found) {
            System.out.println("Não existem reservas históricas, só reservas normais.");
        }

        System.out.println("-----------------------------------------------------------\n");

        sc.close();
    }

    public static void tipoQuartos() throws IOException {

        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/quartosHotel.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        System.out.print("Tipo de quarto (SINGLE, DOUBLE (quartos com casas decimais), SUITE): ");
        String tipo = input.nextLine();

        System.out.println("\n------------------ Quartos Disponíveis do Tipo " + tipo + " ------------------");

        boolean found = false;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] array = line.split(";");

            if (array[2].equalsIgnoreCase(tipo)) {
                System.out.println("Quarto: " + array[0] + " | Tema: " + array[1]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Não existe");
        }

        System.out.println("--------------------------------------------------------\n");
        sc.close();
    }

    public static void temaQuartos() throws IOException {

        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/quartosHotel.csv");

        Scanner sc = new Scanner(file);
        Scanner input = new Scanner(System.in);

        System.out.print("ID do tema (t-0n): ");
        String tema = input.nextLine();

        System.out.println("\n------------------ Quartos do Tema " + tema + " ------------------");
        boolean found = false;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] array = line.split(";");

            if (array[1].equalsIgnoreCase(tema)) {
                System.out.println("Quarto: " + array[0] + " | Tipo: " + array[2]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Não existe");
        }

        System.out.println("--------------------------------------------------------\n");
        sc.close();
    }

    public static void todosQuartos() throws IOException {

        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/quartosHotel.csv");

        Scanner sc = new Scanner(file);

        System.out.println("\n------------------ Quartos Disponíveis ------------------");

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] array = line.split(";");

            System.out.println("Quarto: " + array[0] + " | Tema: " + array[1] + " | Tipo: " + array[2]);
        }

        System.out.println("--------------------------------------------------------\n");
        sc.close();
    }

    public static void consultarEmail() throws IOException {
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/clientesHotel.csv");

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
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/clientesHotel.csv");

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
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/clientesHotel.csv");

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
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/produtosHotel.csv");

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
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/loginHotel.txt");

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
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/loginHotel.txt");

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
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/quartosHotel.csv");

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

        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/temasHotel.csv");

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
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/clientesHotel.csv");

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
        File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/clientesHotel.csv");

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
                                todosQuartos();
                                break;
                            case 2:
                                temaQuartos();
                                break;
                            case 3:
                                tipoQuartos();
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
                                consultarHistoricoReservas();
                                break;
                            case 2:
                                consultarReservasAtivas();
                                break;
                        }
                    } while (opcao != 3);
                    break;
                case 5:
                    registarNovaReserva();
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
                                receitaTotalAnos();
                                break;
                            case 2:
                                despesaTotalAnos();
                                break;
                            case 3:
                                lucroAnos();
                                break;
                            case 4:
                                melhorCliente();
                                break;
                            case 5:
                                clienteConsumista();
                                break;
                            case 6:
                                clientePresente();
                                break;
                            case 7:
                                temaMaisProcurado();
                                break;
                            case 8:
                                temaMaisLucrativo();
                                break;
                            case 9:
                                temaMenosLucrativo();
                                break;
                            case 10:
                                produtoMaisProcurado();
                                break;
                            case 11:
                                produtoMenosProcurado();
                                break;
                            case 12:
                                produtoMaisLucrativo();
                                break;
                        }
                    } while (opcao != 13);
                    break;
                case 7:
                    do {
                        System.out.println("Galeria:");
                        System.out.println("1. Fachada");
                        System.out.println("2. Quarto");
                        System.out.println("3. Spa");
                        System.out.println("4. Fechar X");
                        System.out.print("\nFaxabor: ");
                        opcao = input.nextInt();

                        switch (opcao){
                            case 1:
                                printFachada();
                                break;
                            case 2:
                                printQuarto();
                                break;
                            case 3:
                                printSpa();
                                break;
                        }
                    }while (opcao != 4);
                    break;
            }
        }while(opcao != 8);

    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        boolean loggedIn = false;

        do{
            System.out.print("Login: ");
            String login = input.next();
            System.out.print("Password: ");
            String password = input.next();

            File file = new File("github.com/soft-dev/FichasPraticas/src/FichaExtra4/Ex_03 Hotel Temático/loginHotel.txt");
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