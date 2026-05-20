package Exercicio2;

public class Main {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente("João Silva");

        conta.depositar(1000);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        try {
            conta.sacar(2000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro no saque: " + e.getMessage());
        }

        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        try {
            conta.depositar(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no depósito: " + e.getMessage());
        }
    }
}
