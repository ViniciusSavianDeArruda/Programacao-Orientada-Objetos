package pkg;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] vetor = new int[5];
//		vetor[0] = 10;
//		vetor[1] = 15;
//		vetor[2] = 20;
//		vetor[3] = 25;
//		vetor[4] = 30;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o elemento " + i + ":");
			vetor[i] = teclado.nextInt();
		}
	
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Elemento " + i + "= " + vetor[i]);
		}
	}

}

public class Matrizes {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o elemento [" + i + "][" + j + "]:");
                matriz[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t"); // isso é igual a system.out.print("Elemento ["+i+"]["+j+"]: " + matriz[i][j]); ");
                
            }
            System.out.println();
        }

        teclado.close();
    }

}
