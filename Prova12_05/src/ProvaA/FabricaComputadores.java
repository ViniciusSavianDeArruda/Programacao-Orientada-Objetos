package ProvaA;
import java.util.ArrayList;
import java.util.Scanner;

public class FabricaComputadores {

    static class ViolacaoOrcamentariaException extends Exception {
        public ViolacaoOrcamentariaException(String mensagem) {
            super(mensagem);
        }
    }

    static abstract class Computador {
        protected String modelo;
        protected String numeroSerie;
        protected double custoBase;
        protected double custosAdicionais = 0;

        public static final double LIMITE_MAXIMO = 15000;

        public Computador(String modelo, String numeroSerie, double custoBase)
                throws ViolacaoOrcamentariaException {

            if (custoBase < 0) {
                throw new ViolacaoOrcamentariaException(
                        "Erro: custo base não pode ser negativo!");
            }

            if (custoBase > LIMITE_MAXIMO) {
                throw new ViolacaoOrcamentariaException(
                        "Erro: custo base ultrapassa o limite de R$ " + LIMITE_MAXIMO);
            }

            this.modelo = modelo;
            this.numeroSerie = numeroSerie;
            this.custoBase = custoBase;
        }

        public abstract void aplicarUpgrade(int quantidade);

        public double calcularCustoFinal() {
            return custoBase + custosAdicionais;
        }

        @Override
        public String toString() {
            return "Modelo: " + modelo +
                    "\nNúmero Série: " + numeroSerie +
                    "\nCusto Base: R$ " + custoBase +
                    "\nCustos Adicionais: R$ " + custosAdicionais +
                    "\nCusto Final: R$ " + calcularCustoFinal();
        }
    }

    static class Notebook extends Computador {

        private static final double CUSTO_BATERIA = 500;

        public Notebook(String modelo, String numeroSerie, double custoBase)
                throws ViolacaoOrcamentariaException {
            super(modelo, numeroSerie, custoBase);
        }

        @Override
        public void aplicarUpgrade(int quantidade) {
            custosAdicionais += quantidade * CUSTO_BATERIA;
        }

        @Override
        public String toString() {
            return "\n notbook\n" + super.toString();
        }
    }

    
    static class Desktop extends Computador {

        private static final double CUSTO_RAM = 300;

        public Desktop(String modelo, String numeroSerie, double custoBase)
                throws ViolacaoOrcamentariaException {
            super(modelo, numeroSerie, custoBase);
        }

        @Override
        public void aplicarUpgrade(int quantidade) {
            custosAdicionais += quantidade * CUSTO_RAM;
        }

        @Override
        public String toString() {
            return "\n desktop\n" + super.toString();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Computador> lote = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n MENU ");
            System.out.println("1 - Cadastrar Notebook");
            System.out.println("2 - Cadastrar Desktop");
            System.out.println("3 - Aplicar Upgrade");
            System.out.println("4 - Relatório do Lote");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    try {
                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();

                        System.out.print("Número de Série: ");
                        String serie = sc.nextLine();

                        System.out.print("Custo Base: ");
                        double custo = sc.nextDouble();

                        Notebook nb = new Notebook(modelo, serie, custo);
                        lote.add(nb);

                        System.out.println("Notebook cadastrado!");

                    } catch (ViolacaoOrcamentariaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();

                        System.out.print("Número de Série: ");
                        String serie = sc.nextLine();

                        System.out.print("Custo Base: ");
                        double custo = sc.nextDouble();

                        Desktop desk = new Desktop(modelo, serie, custo);
                        lote.add(desk);

                        System.out.println("Desktop cadastrado!");

                    } catch (ViolacaoOrcamentariaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:

                    if (lote.isEmpty()) {
                        System.out.println("Nenhum computador cadastrado.");
                        break;
                    }

                    for (int i = 0; i < lote.size(); i++) {
                        System.out.println(i + " - " + lote.get(i).modelo);
                    }

                    System.out.print("Escolha o índice: ");
                    int indice = sc.nextInt();

                    if (indice >= 0 && indice < lote.size()) {

                        System.out.print("Quantidade do upgrade: ");
                        int qtd = sc.nextInt();

                        lote.get(indice).aplicarUpgrade(qtd);

                        System.out.println("Upgrade aplicado!");
                    } else {
                        System.out.println("Índice inválido.");
                    }

                    break;

                case 4:

                    double totalLote = 0;

                    System.out.println("\n relatorio ");

                    for (Computador c : lote) {
                        System.out.println(c);

                        totalLote += c.calcularCustoFinal();
                    }

                    System.out.println("TOTAL DO LOTE: R$ " + totalLote);

                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}