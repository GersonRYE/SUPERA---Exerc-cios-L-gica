package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n, x;

		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();
		List<Integer> juncaoParesImpares = new ArrayList<>();
		
		
		System.out.println("Quantos números quer cadastrar? ");
		x = scan.nextInt();

		for (int i = 0; i < x; i++) {
			System.out.println("Digite o " + (i + 1) + "º numero inteiro positivo: ");
			n = scan.nextInt();

			while (n < 0) {
				System.out.println("Invalido");
				System.out.println("Digite o " + (i + 1) + "º numero inteiro positivo: ");
				n = scan.nextInt();
			}

			if (n % 2 == 0) {
				pares.add(n);
				Collections.sort(pares);
			} else {
				impares.add(n);
				Collections.sort(impares, Collections.reverseOrder());
			}
		}
		scan.close();
		juncaoParesImpares.addAll(pares);
		juncaoParesImpares.addAll(impares);
		System.out.println("Lista de números: " + juncaoParesImpares);
	}

}
