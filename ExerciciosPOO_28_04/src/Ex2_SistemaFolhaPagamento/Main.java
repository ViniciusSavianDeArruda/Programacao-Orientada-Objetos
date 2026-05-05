package Ex2_SistemaFolhaPagamento;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<FuncionarioHospitalar> lista = new ArrayList<>();

        Medico m = new Medico("João", "M1", 5000, "Cirurgia", 800, 5);
        Enfermeiro e = new Enfermeiro("Ana", "E1", 3000, "UTI");
        Administrativo a = new Administrativo("Carlos", "A1", 2500, "RH", true);

        e.setPercentualInsalubridade(0.40);
        e.setHorasTrabalhadasMensais(180);

        lista.add(m);
        lista.add(e);
        lista.add(a);

        // testes de encapsulamento
        try {
            a.setSalarioBase(900);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            e.setPercentualInsalubridade(0.99);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            m.setHorasTrabalhadasMensais(300);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // polimorfismo
        for (FuncionarioHospitalar f : lista) {
            f.exibirResumoMensal();
        }
    }
}
