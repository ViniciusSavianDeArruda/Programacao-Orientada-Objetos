package pkg;
import java.util.Scanner;

public class execPc {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		computador pc1 = new computador();
		
		System.out.println("Digite a marca do computador 1: ");
		pc1.marca = teclado.nextLine();
		System.out.println("Digite o modelo do computador 1: ");
		pc1.modelo = teclado.nextLine();
		System.out.println("Digite o tipo do computador 1: ");
		pc1.tipo = teclado.nextLine();
		System.out.println("Digite o preço do computador 1: ");
		pc1.preco = teclado.nextDouble();
		
		computador pc2 = new computador();
		pc2.marca = "Dell";
		pc2.modelo = "Inspiron 15";
		pc2.tipo = "Notebook";
		pc2.preco = 3850.00;
		
		System.out.println("\nCOMPUTADOR 1");
        System.out.println("Marca: " + pc1.marca);
        System.out.println("Modelo: " + pc1.modelo);
        System.out.println("Tipo: " + pc1.tipo);
        System.out.println("Preço: " + pc1.preco);

        System.out.println("\nCOMPUTADOR 2");
        System.out.println("Marca: " + pc2.marca);
        System.out.println("Modelo: " + pc2.modelo);
        System.out.println("Tipo: " + pc2.tipo);
        System.out.println("Preço: " + pc2.preco);
		
		teclado.close();
	}

}
