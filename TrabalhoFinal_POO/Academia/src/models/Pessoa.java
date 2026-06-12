package models;

import exceptions.IdadeInvalidaException;

public abstract class Pessoa {

    private String nome;
    private String cpf;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, int idade) {
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
    }

    public abstract void exibirDados();

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty())
            throw new IllegalArgumentException("Nome nao pode ser vazio");

        if (nome.trim().length() < 2)
            throw new IllegalArgumentException("Nome deve ter pelo menos 2 caracteres");

        // Nome nao pode ser apenas numeros
        if (nome.trim().matches("\\d+"))
            throw new IllegalArgumentException("Nome nao pode ser apenas numeros");

        this.nome = nome.trim();
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty())
            throw new IllegalArgumentException("CPF nao pode ser vazio");

        String cpfLimpo = cpf.trim();

        // CPF deve ter exatamente 11 digitos
        if (cpfLimpo.length() != 11)
            throw new IllegalArgumentException("CPF deve ter 11 digitos");

        // CPF deve conter apenas numeros
        if (!cpfLimpo.matches("\\d+"))
            throw new IllegalArgumentException("CPF deve conter apenas numeros");

        this.cpf = cpfLimpo;
    }

    public void setIdade(int idade) {
        if (idade < 16 || idade > 80)
            throw new IdadeInvalidaException(
                "Idade invalida: " + idade + ". Deve estar entre 16 e 80 anos."
            );
        this.idade = idade;
    }
}