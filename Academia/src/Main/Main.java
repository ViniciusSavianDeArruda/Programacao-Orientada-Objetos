package Main;

import models.*;
import exceptions.IdadeInvalidaException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Academia academia = new Academia();

    public static void main(String[] args) {

        // planos iniciais
        academia.adicionarPlano(new PlanoMensal());
        academia.adicionarPlano(new PlanoTrimestral());
        academia.adicionarPlano(new PlanoAnual());

        int op = -1;

        do {
            menu();

            try {
                op = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Digite um numero valido.");
                sc.nextLine();
                continue;
            }

            switch (op) {

                case 1: cadastrarAluno(); break;
                case 2: cadastrarProfessor(); break;
                case 3: academia.listarPessoas(); break;
                case 4: listarPlanos(); break;
                case 5: registrarPagamento(); break;
                case 6: listarPagamentos(); break;
                case 7: removerAluno(); break;
                case 8: removerProfessor(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opcao invalida");
            }

        } while (op != 0);

        sc.close();
    }

    static void menu() {
        System.out.println("\n===== GYMCONTROL =====");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Cadastrar professor");
        System.out.println("3 - Listar pessoas");
        System.out.println("4 - Listar planos");
        System.out.println("5 - Registrar pagamento");
        System.out.println("6 - Listar pagamentos");
        System.out.println("7 - Remover aluno");
        System.out.println("8 - Remover professor");
        System.out.println("0 - Sair");
        System.out.print("Opcao: ");
    }

    // ---------------- ALUNO ----------------

    static void cadastrarAluno() {
        try {
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("CPF (11 digitos): ");
            String cpf = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.println("0-Mensal 1-Trimestral 2-Anual");
            int p = sc.nextInt();
            sc.nextLine();

            Plano plano = academia.getPlano(p);

            if (plano == null) {
                System.out.println("ERRO: Plano invalido.");
                return;
            }

            academia.adicionarAluno(new Aluno(nome, cpf, idade, plano));
            System.out.println("Aluno cadastrado!");

        } catch (IdadeInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Entrada invalida.");
            sc.nextLine();
        }
    }

    static void removerAluno() {
        try {
            System.out.print("CPF do aluno: ");
            String cpf = sc.nextLine();

            if (academia.removerAluno(cpf)) {
                System.out.println("Aluno removido!");
            } else {
                System.out.println("Aluno nao encontrado.");
            }

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }

    //  PROFESSOR 

    static void cadastrarProfessor() {
        try {
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("CPF (11 digitos): ");
            String cpf = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Especialidade: ");
            String esp = sc.nextLine();

            academia.adicionarProfessor(new Professor(nome, cpf, idade, esp));
            System.out.println("Professor cadastrado!");

        } catch (IdadeInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Entrada invalida.");
            sc.nextLine();
        }
    }

    static void removerProfessor() {
        try {
            System.out.print("CPF do professor: ");
            String cpf = sc.nextLine();

            if (academia.removerProfessor(cpf)) {
                System.out.println("Professor removido!");
            } else {
                System.out.println("Professor nao encontrado.");
            }

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }

    // ---------------- PLANOS ----------------

    static void listarPlanos() {
        System.out.println("\n--- Planos ---");
        for (Plano p : academia.getPlanos()) {
            p.exibirInformacoes();
        }
    }

    // ---------------- PAGAMENTOS ----------------

    static void registrarPagamento() {
        try {
            System.out.print("CPF aluno: ");
            String cpf = sc.nextLine();

            Aluno a = academia.buscarAlunoCpf(cpf);

            if (a == null) {
                System.out.println("Aluno nao encontrado.");
                return;
            }

            if (a.getPlano() == null) {
                System.out.println("Aluno sem plano.");
                return;
            }

            academia.adicionarPagamento(
                    new Pagamento(a, a.getPlano().calcularValor(), "hoje")
            );

            System.out.println("Pagamento registrado!");

        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }

    static void listarPagamentos() {
        if (academia.getPagamentos().isEmpty()) {
            System.out.println("Nenhum pagamento registrado.");
            return;
        }

        System.out.println("\n--- Pagamentos ---");
        for (Pagamento p : academia.getPagamentos()) {
            p.exibir();
        }
    }
}