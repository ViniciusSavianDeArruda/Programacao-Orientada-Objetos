package models;

import java.util.ArrayList;
import java.util.List;

public class Academia {

    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Plano> planos = new ArrayList<>();
    private List<Pagamento> pagamentos = new ArrayList<>();

    // ---------------- ALUNO ----------------
    public void adicionarAluno(Aluno a) {
        if (cpfJaExiste(a.getCpf()))
            throw new IllegalArgumentException("Já existe uma pessoa com este CPF");

        alunos.add(a);
    }

    public boolean removerAluno(String cpf) {
        Aluno a = buscarAlunoCpf(cpf);
        if (a != null) {
            alunos.remove(a);
            return true;
        }
        return false;
    }

    public Aluno buscarAlunoCpf(String cpf) {
        for (Aluno a : alunos) {
            if (a.getCpf().equals(cpf))
                return a;
        }
        return null;
    }

    // ---------------- PROFESSOR ----------------
    public void adicionarProfessor(Professor p) {
        if (cpfJaExiste(p.getCpf()))
            throw new IllegalArgumentException("Já existe uma pessoa com este CPF");

        professores.add(p);
    }

    public boolean removerProfessor(String cpf) {
        Professor p = buscarProfessorCpf(cpf);
        if (p != null) {
            professores.remove(p);
            return true;
        }
        return false;
    }

    public Professor buscarProfessorCpf(String cpf) {
        for (Professor p : professores) {
            if (p.getCpf().equals(cpf))
                return p;
        }
        return null;
    }

    // ---------------- PLANO ----------------
    public void adicionarPlano(Plano p) {
        planos.add(p);
    }

    public Plano getPlano(int index) {
        if (index < 0 || index >= planos.size())
            return null;
        return planos.get(index);
    }

    // ---------------- PAGAMENTO ----------------
    public void adicionarPagamento(Pagamento p) {
        pagamentos.add(p);
    }

    // ---------------- LISTAGEM ----------------
    public void listarPessoas() {

        if (alunos.isEmpty() && professores.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
            return;
        }

        System.out.println("\n--- ALUNOS ---");
        for (Aluno a : alunos) {
            a.exibirDados();
        }

        System.out.println("\n--- PROFESSORES ---");
        for (Professor p : professores) {
            p.exibirDados();
        }
    }

    // ---------------- VALIDAÇÃO CPF ----------------
    private boolean cpfJaExiste(String cpf) {
        for (Aluno a : alunos)
            if (a.getCpf().equals(cpf)) return true;

        for (Professor p : professores)
            if (p.getCpf().equals(cpf)) return true;

        return false;
    }

    // ---------------- GETTERS ----------------
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public List<Plano> getPlanos() {
        return planos;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }
}