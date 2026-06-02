package Ex4JogoRpg;

public class Main {

    public static void main(String[] args) {

        Guerreiro g = new Guerreiro("Arthas", 60);
        Mago m = new Mago("Merlin", 50);

        // Simulação até alguém cair
        try {
            while (!m.estaDerrotado()) {
                g.atacar(m);
                System.out.println("Vida do Mago: " + m.getPontosVida());
            }

            System.out.println("Mago foi derrotado!");

            // Tentando atacar depois da morte (força exceção)
            g.atacar(m);

        } catch (AlvoInvalidoException e) {
            System.out.println("EXCEÇÃO CAPTURADA: " + e.getMessage());
        }

        System.out.println("\n--- Teste de cura inválida ---");

        Paladino p = new Paladino("Uther", 40);

        try {
            p.curarAliado(m); // m já está morto
        } catch (AlvoInvalidoException e) {
            System.out.println("EXCEÇÃO CAPTURADA: " + e.getMessage());
        }
    }
}