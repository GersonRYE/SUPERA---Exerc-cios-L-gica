package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double v, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11;
		int n100 = 0, n50 = 0, n20 = 0, n10 = 0, n05 = 0, n005 = 0, n02 = 0, n01 = 0, n050 = 0, n025 = 0, n010 = 0,
				n001 = 0;

		System.out.println("Digite o valor:");
		v = scan.nextDouble();

		while (v >= 100) {
			v -= 100;
			n100++;
		}

		v1 = v;
		while (v1 >= 50.00 && v1 < 100.00) {
			v1 -= 50.00;
			n50++;
		}

		v2 = v1;
		while (v2 >= 20.00 && v2 < 50.00) {
			v2 -= 20.00;
			n20++;
		}

		v3 = v2;
		while (v3 >= 10.00 && v3 < 20.00) {
			v3 -= 10.00;
			n10++;
		}

		v4 = v3;
		while (v4 >= 5.00 && v4 < 10.00) {
			v4 -= 5.00;
			n05++;
		}

		v5 = v4;
		while (v5 >= 2.00 && v5 < 5.00) {
			v5 -= 2.00;
			n02++;
		}

		v6 = v5;
		while (v6 >= 1.00 && v6 < 2.00) {
			v6 -= 1.00;
			n01++;
		}

		v7 = v6;
		while (v7 >= 0.50 && v7 < 1) {
			v7 -= 0.50;
			n050++;
		}

		v8 = v7;
		while (v8 >= 0.25 && v8 < 0.50) {
			v8 -= 0.25;
			n025++;
		}

		v9 = v8 + 0.001;
		while (v9 >= 0.10 && v9 < 0.25) {
			v9 -= 0.10;
			n010++;
		}

		v10 = v9 + 0.001;
		while (v10 >= 0.05 && v10 < 0.10) {
			v10 -= 0.05;
			n005++;
		}

		v11 = v10;
		while (v11 >= 0.01 && v11 < 0.05) {
			v11 -= 0.01;
			n001++;
		}

		scan.close();
		System.out.println("Notas:");
		System.out.println(n100 + " nota(s) de R$100,00");
		System.out.println(n50 + " nota(s) de R$50,00");
		System.out.println(n20 + " nota(s) de R$20,00");
		System.out.println(n10 + " nota(s) de R$10,00");
		System.out.println(n05 + " nota(s) de R$5,00");
		System.out.println(n02 + " nota(s) de R$2,00");
		System.out.println("Moedas:");
		System.out.println(n01 + " moeda(s) de R$1,00");
		System.out.println(n050 + " moeda(s) de R$0,50");
		System.out.println(n025 + " moeda(s) de R$0,25");
		System.out.println(n010 + " moeda(s) de R$0,10");
		System.out.println(n005 + " moeda(s) de R$0,05");
	}
}
