////6 - Crie uma classe chamada Aluno com os atributos:
//nome
//matrícula
//nota1
//Nota2
//nota3
//Crie uma classe executável que:
//Solicite os dados do aluno pelo teclado.
//Calcule a média das duas notas.
//Exiba os dados do aluno e sua média.
//Mostre também se o aluno está:
//Aprovado (média = 6)
//Reprovado (média < 6)

package pkg;
import java.util.Scanner;

public class ExecAluno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Aluno a = new Aluno();
		
		System.out.println("Digite o nome do aluno:");
		a.nome = teclado.nextLine();
		
		System.out.println("Digite a matrícula:");
		a.matricula = teclado.nextLine();

		System.out.println("Digite a nota 1:");
		a.nota1 = teclado.nextDouble();

		System.out.println("Digite a nota 2:");
		a.nota2 = teclado.nextDouble();

		System.out.println("Digite a nota 3:");
		a.nota3 = teclado.nextDouble();

		double media = (a.nota1 + a.nota2 + a.nota3) / 3;

		System.out.println("\n Dados do Aluno");
		System.out.println("Nome: " + a.nome);
		System.out.println("Matrícula: " + a.matricula);
		System.out.println("Nota 1: " + a.nota1);
		System.out.println("Nota 2: " + a.nota2);
		System.out.println("Nota 3: " + a.nota3);
		System.out.println("Média: " + media);

		if (media >= 6) {
			System.out.println("Situação: Aprovado");
		} else {
			System.out.println("Situação: Reprovado");
		}

		teclado.close();

	}

}
