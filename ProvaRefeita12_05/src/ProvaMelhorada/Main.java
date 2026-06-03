
package ProvaMelhorada;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	// erro anterior: nextInt/nextDouble quebravam com entrada inválida
	// melhoria: leitura segura com tratamento de erro

	public static int lerInteiro(Scanner sc) {
		while (true) {
			try {
				String v = sc.nextLine();
				if (v.trim().isEmpty())
					continue;
				return Integer.parseInt(v);
			} catch (Exception e) {
				System.out.println("numero invalido");
			}
		}
	}

	public static double lerDouble(Scanner sc) {
		while (true) {
			try {
				String v = sc.nextLine();
				if (v.trim().isEmpty())
					continue;
				return Double.parseDouble(v);
			} catch (Exception e) {
				System.out.println("valor invalido");
			}
		}
	}

	// melhoria: busca por número de série (correto no enunciado)
	// antes era usado índice da lista
	public static Computador buscar(ArrayList<Computador> lista, String serie) {

		for (Computador c : lista) {
			if (c.getNumeroSerie().equalsIgnoreCase(serie)) {
				return c;
			}
		}
		return null;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Computador> lista = new ArrayList<>();

		int op;

		do {
			System.out.println("\nmenu");
			System.out.println("1 cadastrar notebook");
			System.out.println("2 cadastrar desktop");
			System.out.println("3 upgrade");
			System.out.println("4 relatorio");
			System.out.println("0 sair");

			op = lerInteiro(sc);

			switch (op) {

			case 1:
			case 2:

				try {

					System.out.print("modelo: ");
					String modelo = sc.nextLine();

					System.out.print("serie: ");
					String serie = sc.nextLine();

					// melhoria: validação de campos vazios
					if (modelo.trim().isEmpty() || serie.trim().isEmpty()) {
						System.out.println("dados invalidos");
						break;
					}

					// melhoria: evita duplicidade de série
					if (buscar(lista, serie) != null) {
						System.out.println("serie ja existe");
						break;
					}

					System.out.print("custo: ");
					double custo = lerDouble(sc);

					if (op == 1) {
						lista.add(new Notebook(modelo, serie, custo));
						System.out.println("notebook cadastrado");
					} else {
						lista.add(new Desktop(modelo, serie, custo));
						System.out.println("desktop cadastrado");
					}

				} catch (Exception e) {
					System.out.println("erro: " + e.getMessage());
				}

				break;

			case 3:

				System.out.print("serie: ");
				String s = sc.nextLine();

				Computador c = buscar(lista, s);

				if (c == null) {
					System.out.println("nao encontrado");
					break;
				}

				System.out.print("quantidade: ");
				int q = lerInteiro(sc);

				// erro anterior: aceitava valores inválidos
				// melhoria: validação forte do upgrade
				if (q <= 0 || q > 100) {
					System.out.println("quantidade invalida");
					break;
				}

				c.aplicarUpgrade(q);

				System.out.println("upgrade ok");
				break;

			case 4:

				double total = 0;

				System.out.println("\nrelatorio");

				for (Computador x : lista) {
					System.out.println(x);
					System.out.println("----");
					total += x.calcularCustoFinal();
				}

				System.out.println("total: " + total);
				break;
			}

		} while (op != 0);

		sc.close();
	}
}