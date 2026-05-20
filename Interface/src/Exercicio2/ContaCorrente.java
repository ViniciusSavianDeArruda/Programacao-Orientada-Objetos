package Exercicio2;

public class ContaCorrente extends ContaBancaria implements Tributavel, TransacaoOnline {

    private static final double TAXA_SAQUE = 5.0;

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        double total = valor + TAXA_SAQUE;

        if (total > getSaldo()) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque + taxa.");
        }

        debitar(total);
        System.out.println("Saque realizado com sucesso: R$ " + valor + " (taxa R$ 5.00)");
    }

    @Override
    public void calcularImpostos() {
        System.out.println("Calculando impostos da conta corrente...");
    }

    @Override
    public void fazerPix(String chavePix, double valor) {
        System.out.println("PIX enviado para " + chavePix + " no valor de R$ " + valor);
    }
}
