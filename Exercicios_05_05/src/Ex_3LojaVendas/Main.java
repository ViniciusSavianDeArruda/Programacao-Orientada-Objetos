package Ex_3LojaVendas;

public class Main {

    public static void main(String[] args) {

        Produto[] produtos = new Produto[3];

        produtos[0] = new Eletronico("Notebook", 3000);
        produtos[1] = new Vestuario("Camiseta", 100);
        produtos[2] = new Alimento("Arroz", 30);

        double totalImpostos = 0;

        for (int i = 0; i < produtos.length; i++) {

            if (produtos[i] instanceof Tributavel) {

                Tributavel t = (Tributavel) produtos[i];

                totalImpostos += t.calcularImposto();
            }
        }

        System.out.println("Total de impostos: R$ " + totalImpostos);
    }
}