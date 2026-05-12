package Ex_1SistemaVoos;

public class Main {

    public static void main(String[] args) {

        Voo voo = new Voo("AZ123", "São Paulo");

        try {

            voo.reservarAssento(10);
            System.out.println("Assento 10 reservado com sucesso!");

            voo.reservarAssento(20);
            System.out.println("Assento 20 reservado com sucesso!");

            // Tentando reservar novamente o mesmo assento
            voo.reservarAssento(10);

        } catch (AssentoOcupadoException e) {

            System.out.println("Erro: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Voo: " + voo.getNumeroDoVoo());
        System.out.println("Destino: " + voo.getDestino());
    }
}