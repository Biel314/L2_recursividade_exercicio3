package view;

import java.util.Scanner;
import controller.TotalParController;

//Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quan�dade de
//números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais
//diferentes de zero.

public class main {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		TotalParController TotalParController = new TotalParController();
		
		System.out.println("Digite o tamanho do vetor: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o " + (i+1) + " termo do vetor:");
			do {
				arr[i] = in.nextInt();
			
				if (arr[i] < 1) {
					System.out.println("o numero tem que ser maior do que 0!!!\n");
					
					System.out.println("Digite novamente o " + (i+1) + " termo do vetor:");
				}
			} while(arr[i] < 1);
		}
		
		int result = TotalParController.totalPares(arr, n);
		
		System.out.println("A qtdade de pares do vetor é: " + result);
	}

}
