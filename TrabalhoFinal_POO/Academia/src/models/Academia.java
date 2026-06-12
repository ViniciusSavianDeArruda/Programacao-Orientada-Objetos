package models;

import java.util.ArrayList;
import java.util.List;

public class Academia {

    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Plano> planos = new ArrayList<>();
    private List<Pagamento> pagamentos = new ArrayList<>();

    // metodos de aluno

    public void adicionarAluno(Aluno a) {
        // verifica se o CPF ja esta em uso antes de adicionar
        if (cpfJaExiste(a.getCpf()))
            throw new IllegalArgumentException("Ja existe uma pessoa com este CPF");
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
        // percorre a lista comparando o CPF de cada aluno
        for (Aluno a : alunos) {
            if (a.getCpf().equals(cpf))
                return a;
        }
        return null;
    }

    // metodos de professor

    public void adicionarProfessor(Professor p) {
        if (cpfJaExiste(p.getCpf()))
            throw new IllegalArgumentException("Ja existe uma pessoa com este CPF");
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

    // metodos de plano

    public void adicionarPlano(Plano p) {
        planos.add(p);
    }

    public Plano getPlano(int index) {
        // retorna null se o indice for invalido para nao quebrar o programa
        if (index < 0 || index >= planos.size())
            return null;
        return planos.get(index);
    }

    // metodos de pagamento

    public void adicionarPagamento(Pagamento p) {
        pagamentos.add(p);
    }

    // lista alunos e professores juntos usando polimorfismo
    public void listarPessoas() {
        if (alunos.isEmpty() && professores.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
            return;
        }

        // junta as duas listas em uma lista do tipo Pessoa (superclasse)
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.addAll(alunos);
        pessoas.addAll(professores);

        System.out.println("\nPessoas cadastradas");
        for (Pessoa p : pessoas) {
            // cada subclasse executa sua propria versao de exibirDados
            p.exibirDados();
        }
    }

    // verifica se um CPF ja esta cadastrado em alunos ou professores
    private boolean cpfJaExiste(String cpf) {
        for (Aluno a : alunos)
            if (a.getCpf().equals(cpf)) return true;
        for (Professor p : professores)
            if (p.getCpf().equals(cpf)) return true;
        return false;
    }

    // getters retornam copias das listas para preservar o encapsulamento

    public List<Aluno> getAlunos() {
        return new ArrayList<>(alunos);
    }

    public List<Professor> getProfessores() {
        return new ArrayList<>(professores);
    }

    public List<Plano> getPlanos() {
        return new ArrayList<>(planos);
    }

    public List<Pagamento> getPagamentos() {
        return new ArrayList<>(pagamentos);
    }
}