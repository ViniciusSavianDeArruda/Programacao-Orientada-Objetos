//3. Formulário de Idade (NumberFormatException)
//Peça para o usuário digitar sua idade através da classe Scanner, mas leia a entrada como uma String (usando nextLine()). 
//Tente converter essa String para inteiro usando Integer.parseInt(). 
//Trate a exceção caso o usuário digite a idade por extenso (ex: "vinte") e exiba um alerta: "Por favor, utilize apenas algarismos numéricos".
package Exercicio3FormularioIdade;
import java.util.Scanner;

public class FormularioIdade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		String texto = teclado.nextLine();
		
		try {
			int idade = Integer.parseInt(texto);
			
			System.out.println("Idade valida: " + idade);
			
		} catch (NumberFormatException e) {
            // 3. Se não conseguir converter
            System.out.println("Por favor, utilize apenas numeros");
        }
		teclado.close();
	}

}
