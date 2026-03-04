/*2 - Um motorista de taxi deseja calcular o rendimento de seu carro na praça. Sabendose que o preço do combustível é de R$4,90, escreva um algoritmo para ler a marcação
do odômetro (marcador de quilometragem) no início do dia, a marcação no final do dia, o
número de litros de combustível gasto e o valor total (R$) recebido dos passageiros.
Calcule e escreva a média do consumo em Km/l e o lucro líquido do dia.

• Fórmulas: Total quilometragem = marcação odômetro final do dia - marcação odômetro
início do dia
• Média do consumo = Total quilometragem/ quantidade de combustível gasto
• Lucro do dia = Valor total recebido - (quantidade de combustível gasto * 4,90)*/

package exercicios;
import java.util.Scanner;

public class taxiCalculo {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a marcação do odômetro no início do dia: ");
		double odometroInicio = teclado.nextDouble();
		
		System.out.println("Digite a marcação do odômetro no final do dia: ");
		double odometroFim = teclado.nextDouble();
		
		System.out.println("Digite o número de litros de combustível gasto: ");
		double litrosGastos = teclado.nextDouble();
		
		System.out.println("Digite o valor total recebido dos passageiros em R$: ");
		double valorRecebido = teclado.nextDouble();
		
		//calculos
		double totalQuilometragem = odometroFim - odometroInicio;
		double mediaConsumo = totalQuilometragem / litrosGastos;
		double lucroDia = valorRecebido - (litrosGastos * 4.90);
		
		System.out.println("Total de quilometragem: " + totalQuilometragem + " km");
		System.out.println("Média de consumo: " + mediaConsumo + " km/l");
		System.out.println("Lucro líquido do dia: R$ %.2f " + lucroDia);
		
		
		

	}

}
