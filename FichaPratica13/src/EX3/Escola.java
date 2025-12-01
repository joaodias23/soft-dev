package EX3;

import java.util.ArrayList;
import java.util.Scanner;

public class Escola {
    private String nome;
    private String localizacao;
    private int tamanhoMaximo;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Curso> cursos;
    private ArrayList<Aluno> alunos;
    private ArrayList<Funcionario> funcionarios;

    public Escola(String nome, String localizacao, int tamanhoMaximo) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanhoMaximo = tamanhoMaximo;
        this.professores = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarProfessor(Professor p) {
        professores.add(p);
        System.out.println("Professor " + p.nome + " adicionado");
    }

    public void adicionarAluno(Aluno a) {
        if (alunos.size() < tamanhoMaximo) {
            alunos.add(a);
            System.out.println("Aluno " + a.nome + " adicionado");
        } else {
            System.out.println("Erro");
        }
    }

    public void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
        System.out.println("Disciplina " + d.getNome() + " adicionada");
    }

    public void adicionarCurso(Curso c) {
        cursos.add(c);
        System.out.println("Curso " + c.getNome() + " adicionado");
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
        System.out.println("Funcionário " + f.nome + " adicionado");
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo à Escola " + nome);

        while (true) {
            System.out.println("\nLogin:");
            System.out.println("1 - Professor");
            System.out.println("2 - Aluno");
            System.out.println("3 - Funcionário");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = input.nextInt();
            input.nextLine();

            if (opcao == 0) {
                System.out.println("Saindo do sistema...");
                break;
            }

            switch (opcao) {
                case 1:
                    loginProfessor(input);
                    break;
                case 2:
                    loginAluno(input);
                    break;
                case 3:
                    loginFuncionario(input);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void loginProfessor(Scanner input) {
        System.out.println("\nLista de professores:");
        for (int i = 0; i < professores.size(); i++) {
            System.out.println(i + " - " + professores.get(i).nome);
        }
        System.out.print("Escolha seu índice: ");
        int idx = input.nextInt();
        input.nextLine();

        if (idx < 0 || idx >= professores.size()) {
            System.out.println("Professor inválido!");
            return;
        }

        Professor prof = professores.get(idx);
        System.out.println("Bem-vindo, Professor " + prof.nome);

        while (true) {
            System.out.println("\nMenu Professor:");
            System.out.println("1 - Imprimir Horário");
            System.out.println("2 - Lançar Nota");
            System.out.println("0 - Logout");
            System.out.print("Escolha: ");
            int opc = input.nextInt();
            input.nextLine();

            if (opc == 0) break;

            switch (opc) {
                case 1:
                    prof.imprimirHorario();
                    break;
                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Não há alunos!");
                        break;
                    }
                    System.out.println("Alunos disponíveis:");
                    for (int i = 0; i < alunos.size(); i++) {
                        System.out.println(i + " - " + alunos.get(i).nome);
                    }
                    System.out.print("Escolha o aluno pelo índice: ");
                    int alunoIdx = input.nextInt();
                    input.nextLine();
                    Aluno a = alunos.get(alunoIdx);

                    System.out.println("Disciplinas disponíveis:");
                    for (int i = 0; i < disciplinas.size(); i++) {
                        System.out.println(i + " - " + disciplinas.get(i).getNome());
                    }
                    System.out.print("Escolha a disciplina pelo índice: ");
                    int discIdx = input.nextInt();
                    input.nextLine();
                    Disciplina d = disciplinas.get(discIdx);

                    System.out.print("Insira a nota (0-20): ");
                    double nota = input.nextDouble();
                    input.nextLine();

                    prof.lancarNota(a, d, nota);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void loginAluno(Scanner input) {
        System.out.println("\nLista de alunos:");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(i + " - " + alunos.get(i).nome);
        }
        System.out.print("Escolha seu índice: ");
        int idx = input.nextInt();
        input.nextLine();

        if (idx < 0 || idx >= alunos.size()) {
            System.out.println("Aluno inválido!");
            return;
        }

        Aluno a = alunos.get(idx);
        System.out.println("Bem-vindo, " + a.nome);

        while (true) {
            System.out.println("\nMenu Aluno:");
            System.out.println("1 - Imprimir Horário");
            System.out.println("2 - Imprimir Pauta");
            System.out.println("3 - Ver Estado de Aprovação");
            System.out.println("0 - Logout");
            System.out.print("Escolha: ");
            int opc = input.nextInt();
            input.nextLine();

            if (opc == 0) break;

            switch (opc) {
                case 1:
                    a.imprimirHorario();
                    break;
                case 2:
                    a.imprimirPauta();
                    break;
                case 3:
                    a.estadoAprovacao();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void loginFuncionario(Scanner input) {
        System.out.println("\nLista de funcionários:");
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(i + " - " + funcionarios.get(i).nome + " (" + funcionarios.get(i).getFuncao() + ")");
        }
        System.out.print("Escolha seu índice: ");
        int idx = input.nextInt();
        input.nextLine();

        if (idx < 0 || idx >= funcionarios.size()) {
            System.out.println("Funcionário inválido!");
            return;
        }

        Funcionario f = funcionarios.get(idx);
        System.out.println("Bem-vindo, " + f.nome);

        while (true) {
            System.out.println("\nMenu Funcionário:");
            System.out.println("1 - Imprimir Horário");
            System.out.println("2 - Criar Professor/Aluno (RH apenas)");
            System.out.println("3 - Criar Disciplina/Curso (Admin apenas)");
            System.out.println("4 - Ver lista de alunos aprovados (Admin apenas)");
            System.out.println("0 - Logout");
            System.out.print("Escolha: ");
            int opc = input.nextInt();
            input.nextLine();

            if (opc == 0) break;

            switch (opc) {
                case 1:
                    f.imprimirHorario();
                    break;
                case 2:
                    if (f.getFuncao() != Funcao.RECURSOS_HUMANOS) {
                        System.out.println("Acesso negado. Apenas RH pode criar professores ou alunos.");
                        break;
                    }
                    System.out.println("1 - Criar Professor");
                    System.out.println("2 - Criar Aluno");
                    System.out.print("opcao: ");
                    int opcao = input.nextInt();
                    input.nextLine();
                    if (opcao == 1) {
                        System.out.println("criaçao de professor nao implementada");
                    } else if (opcao == 2) {
                        System.out.println("criaçao de aluno nao implementada");
                    }
                    break;
                case 3:
                    if (f.getFuncao() != Funcao.ADMINISTRACAO) {
                        System.out.println("so o admin pode");
                        break;
                    }
                    System.out.println("criaçao de cursos implementado");
                    break;
                case 4:
                    if (f.getFuncao() != Funcao.ADMINISTRACAO) {
                        System.out.println("so admins podem");
                        break;
                    }
                    System.out.println("\naprovados:");
                    for (Aluno a : alunos) {
                        a.calcularMedia();
                        if (a.getMediaNotas() >= 9.5) {
                            System.out.println("- " + a.nome + " | média: " + a.getMediaNotas());
                        }
                    }
                    break;
                default:
                    System.out.println("invalido");
            }
        }
    }
}
