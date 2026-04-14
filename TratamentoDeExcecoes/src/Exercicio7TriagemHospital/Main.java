package Exercicio7TriagemHospital;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        TriagemHospital hospital = new TriagemHospital();

        try {

            hospital.cadastrarPaciente("Vinicius", 60); 

        } catch (NullPointerException e) {
            System.out.println("Erro: nome vazio");

        } catch (InputMismatchException e) {
            System.out.println("Erro: peso inválido");

        } catch (Exception e) {
            System.out.println("Erro interno no sistema do hospital: " + e.getMessage());
        }

        System.out.println("Fim do atendimento.");
    }
}