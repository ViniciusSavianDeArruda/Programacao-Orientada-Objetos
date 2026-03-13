package pkg;
import java.util.Scanner;

public class ExecCarro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		carro c1 = new carro();
		
		System.out.println("\nCarro c1:");
		System.out.println("Digite a marca do carro:");
		c1.marca = teclado.nextLine();
		System.out.println("Digite o modelo do veiculo:");
		c1.modelo = teclado.nextLine();
		System.out.println("Digite o ano de fabricacao do veiculo");
		c1.anoFabricacao = teclado.nextInt();
		
		System.out.println("\nInformacoes do veiculo c1:");
		System.out.println("Marca:" + c1.marca);
		System.out.println("Modelo:" + c1.modelo);
		System.out.println("Ano de fabricao:" + c1.anoFabricacao);
		
		carro c2 = new carro();
		
		System.out.println("\nCarro c2:");
		System.out.println("Digite a marca do carro:");
		teclado.nextLine(); //limpar o buffer
		c2.marca = teclado.nextLine();
		System.out.println("Digite o modelo do veiculo:");
		c2.modelo = teclado.nextLine();
		System.out.println("Digite o ano de fabricacao do veiculo");
		c2.anoFabricacao = teclado.nextInt();
		
		System.out.println("\nInformacoes do veiculo c2:");
		System.out.println("Marca:" + c2.marca);
		System.out.println("Modelo:" + c2.modelo);
		System.out.println("Ano de fabricao:" + c2.anoFabricacao);
		
		teclado.close();
		
		
	}
}
