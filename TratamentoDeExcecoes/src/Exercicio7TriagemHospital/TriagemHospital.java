//7. Triagem no Hospital(Hierarquia de Exceções)
//Crie um sistema simples de cadastro de pacientes para o hospital. O método de cadastro pode gerar duas exceções: NullPointerException (se o nome estiver vazio) 
//ou InputMismatchException (se o peso digitado for inválido). Crie um bloco try com múltiplos catch. Ao final, adicione um catch genérico para Exception e (polimorfismo) 
//para capturar qualquer outro erro imprevisto, imprimindo: "Erro interno no sistema do hospital: " + e.getMessage().

package Exercicio7TriagemHospital;

import java.util.InputMismatchException;

public class TriagemHospital {

    public void cadastrarPaciente(String nome, double peso) {

        if (nome == null || nome.isEmpty()) {
            throw new NullPointerException("Nome do paciente não pode estar vazio!");
        }

        if (peso <= 0) {
            throw new InputMismatchException("Peso inválido!");
        }

        System.out.println("Paciente cadastrado: " + nome + " - " + peso + "kg");
    }
}