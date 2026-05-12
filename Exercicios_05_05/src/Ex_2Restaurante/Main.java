package Ex_2Restaurante;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        PratoPrincipal prato =
                new PratoPrincipal("Pizza", 50.0, 30);

        Bebida bebida1 =
                new Bebida("Refrigerante", 8.0, false);

        Bebida bebida2 =
                new Bebida("Vinho", 40.0, true);

        pedido.adicionarItem(prato);
        pedido.adicionarItem(bebida1);
        pedido.adicionarItem(bebida2);

        double total = pedido.fecharConta();

        System.out.println("Valor total: R$ " + total);
    }
}