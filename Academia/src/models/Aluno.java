package models;

import interfaces.Exibivel;

public class Aluno extends Pessoa implements Exibivel {

    private Plano plano;

    public Aluno(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }

    public Aluno(String nome, String cpf, int idade, Plano plano) {
        super(nome, cpf, idade);
        this.plano = plano;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nAluno: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());

        if (plano != null)
            System.out.println("Plano: " + plano.getNomePlano());
        else
            System.out.println("Sem plano");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(getNome() + " (Aluno)");
    }
}