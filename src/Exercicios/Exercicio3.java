package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int k, n, cont = 0;

		System.out.println("Digite o valor alvo: ");
		k = scan.nextInt();

		System.out.println("Quantos elementos quer inserir no array? ");
		n = scan.nextInt();
		int array[] = new int[n];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º elemento");
			array[i] = scan.nextInt();
			
			while(array[i]<=0) {
				System.out.println("Inválido! Digite valores positivos");
				System.out.println("Digite o " + (i + 1) + "º elemento");
				array[i] = scan.nextInt();
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j] > array[i] ) {
					int sub = (array[j] - array[i]);
					if (sub == k) {
						cont++;
					}
				}
			}
		}
		scan.close();

		System.out.println("Pares que satisfazem o criterio de k: " + cont);

	}
}


