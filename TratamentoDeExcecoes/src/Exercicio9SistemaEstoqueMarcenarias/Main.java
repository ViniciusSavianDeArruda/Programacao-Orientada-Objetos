package Exercicio9SistemaEstoqueMarcenarias;

public class Main {

    public static void main(String[] args) {	

        Estoque estoque = new Estoque(10, 5);

        try {
            estoque.cortarPeca("mdf", 50);
            estoque.cortarPeca("mdf", 3);
            estoque.cortarPeca("macaudiba", 2);

        } catch (MadeiraInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Fim do programa");
    }
}