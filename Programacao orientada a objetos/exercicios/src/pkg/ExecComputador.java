package pkg;
import java.util.Scanner;

public class ExecComputador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		computador pc1 = new computador();
		
		System.out.println("\nPC1:");
		System.out.println("Digite a marca do computador:");
		pc1.marca = teclado.nextLine();
		
		System.out.println("Digite o modelo do computador:");
		pc1.modelo = teclado.nextLine();
		
		System.out.println("Digite o tipo (ex: not ou pc):");
		pc1.tipo = teclado.nextLine();
		
		System.out.println("Digite o preco do computador");
		pc1.preco = teclado.nextDouble();
		
		System.out.println("Informacoes do PC1:");
		System.out.println("Marca:" + pc1.marca);
		System.out.println("Modelo:" + pc1.modelo);
		System.out.println("Tipo:" + pc1.tipo);
		System.out.println("Preco:" + pc1.preco);
		
		
		computador pc2 = new computador();
		
		pc2.marca = "Dell";
		pc2.modelo = "Inspiron";
		pc2.tipo  ="Notebook";
		pc2.preco = 4000;
		
		System.out.println("\nInformacoes do PC2:");
		System.out.println("Marca:" + pc2.marca);
		System.out.println("Modelo:" + pc2.modelo);
		System.out.println("Tipo:" + pc2.tipo);
		System.out.println("Preco:" + pc2.preco);
		
		
		teclado.close();
		
	}

}
