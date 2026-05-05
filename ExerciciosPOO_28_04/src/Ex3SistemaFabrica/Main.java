package Ex3SistemaFabrica;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<MaquinaIndustrial> maquinas = new ArrayList<>();

        InjetorPlastico i = new InjetorPlastico("INJ1");
        BracoRoboticoMontagem r = new BracoRoboticoMontagem("ROB1");
        PrensaHidraulica p = new PrensaHidraulica("PRE1");

        maquinas.add(i);
        maquinas.add(r);
        maquinas.add(p);

        i.abastecerPlastico(10);

        // tentar antes de ligar
        for (MaquinaIndustrial m : maquinas) {
            try {
                m.produzirLote(60);
            } catch (Exception e) {
                System.out.println("ERRO: " + e.getMessage());
            }
        }

        // ligar todas
        for (MaquinaIndustrial m : maquinas) {
            m.ligar();
        }

        // produção
        for (int ciclo = 0; ciclo < 3; ciclo++) {
            for (MaquinaIndustrial m : maquinas) {
                try {
                    m.produzirLote(40);
                } catch (Exception e) {
                    System.out.println("ALARME: " + e.getMessage());
                }
            }
        }

        // relatório final
        System.out.println("\n--- RELATÓRIO FINAL ---");

        for (MaquinaIndustrial m : maquinas) {
            System.out.println("Máquina: " + m.getNumeroSerie());
            System.out.println("Peças: " + m.getPecasProduzidasTotais());
            System.out.println("Energia: " + m.getEnergiaConsumidaKWh());
            System.out.println("-------------------");
        }
    }
}
