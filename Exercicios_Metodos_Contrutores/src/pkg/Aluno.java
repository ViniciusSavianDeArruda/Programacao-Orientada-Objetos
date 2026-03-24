package pkg;

public class Aluno {

    String nome;
    String matricula;
    String dataNascimento;
    int anoIngresso;

    // Construtor 1: nome e matricula
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;

        System.out.println("Construtor 1 utilizado");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }

    // Construtor 2: data de nascimento
    public Aluno(String dataNascimento) {
        this.dataNascimento = dataNascimento;

        System.out.println("Construtor 2 utilizado");
        System.out.println("Data de nascimento: " + dataNascimento);
    }

    // Construtor 3: nome, data de nascimento, ano de ingresso
    public Aluno(String nome, String dataNascimento, int anoIngresso) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoIngresso = anoIngresso;

        System.out.println("Construtor 3 utilizado");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Ano de ingresso: " + anoIngresso);
    }
}