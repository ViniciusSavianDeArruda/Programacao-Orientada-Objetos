package pkg;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		carro carro1 = new carro();
		
		System.out.println("Digite a marca do carro 1: ");
		carro1.marca = teclado.nextLine();
		System.out.println("Digite o modelo do carro 1: ");
		carro1.modelo = teclado.nextLine();
		System.out.println("Digite o ano de fabricação do carro 1: ");
		carro1.anoFabricacao = teclado.nextInt();
		teclado.nextLine(); 
		
		carro carro2 = new carro();
		System.out.println("Digite a marca do carro 2: ");
		carro2.marca = teclado.nextLine();
		System.out.println("Digite o modelo do carro 2: ");
		carro2.modelo = teclado.nextLine();
		System.out.println("Digite o ano de fabricação do carro 2: ");
		carro2.anoFabricacao = teclado.nextInt();
		
		System.out.println("Carro 1: " + carro1.marca + " " + carro1.modelo + " " + carro1.anoFabricacao);
		System.out.println("Carro 2: " + carro2.marca + " " + carro2.modelo + " " + carro2.anoFabricacao);
		
		teclado.close();
	}

}
