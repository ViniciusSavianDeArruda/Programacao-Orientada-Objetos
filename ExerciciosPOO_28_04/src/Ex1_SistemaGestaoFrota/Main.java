package Ex1_SistemaGestaoFrota;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<NaveEspacial> naves = new ArrayList<>();

        NaveCargueira cargueiro = new NaveCargueira("C1", 5000, 10, 1000);
        NaveCombate combate = new NaveCombate("B1", 3000, 20, 5, true);
        NaveExploracao exploracao = new NaveExploracao("E1", 2000, 15, true);

        naves.add(cargueiro);
        naves.add(combate);
        naves.add(exploracao);

        //teset de encapsulamento
        try {
            cargueiro.setCombustivelAtual(99999);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Teste de polimorfismo
        for (NaveEspacial nave : naves) {
            try {
                System.out.println("Nave: " + nave.getIdentificador());
                nave.viajar(1000);
            } catch (CombustivelInsuficienteException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}