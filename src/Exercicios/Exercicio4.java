package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int n;
		String p;
		List<String> o = new ArrayList<>();
		List<String> o1 = new ArrayList<>();
		List<String> o2 = new ArrayList<>();
		List<String> o3 = new ArrayList<>();
		String charToString, charToString1;

		System.out.println("Quantas palavras/frases quer inserir?");
		n = scan.nextInt();

		System.out.println("A palavras/ frases deve ter no minimo 2 e máximo 100 caracteres ");
		for (int i = 0; i < n; i++) {
			System.out.println("Digite a " + (i + 1) + "º palavra:");
			p = scan2.nextLine();

			while (p.length() < 2) {
				System.out.println("Invalido");
				System.out.println("Digite a " + (i + 1) + "º palavra:");
				p = scan2.nextLine();
			}
			for (int j = p.length() / 2; j > 0; j--) {
				char c = p.charAt(j - 1);
				charToString = c + "";
				o1.add(charToString);
			}
			for (int k = p.length() - 1; k > 1; k--) {
				if (k + 1 != p.length() / 2) {
					char c = p.charAt(k);
					charToString1 = String.valueOf(c);
					o2.add(charToString1);
				} else {
					k = 1;
				}
			}
			o.addAll(o1);
			o.addAll(o2);
			StringBuilder str = new StringBuilder();
			for (String m : o) {
				str.append(m);
			}
			o3.add(str.toString());
			o1.clear();
			o2.clear();
			o.clear();
		}

		System.out.println();
		for (String g : o3) {
			System.out.println(g);
		}
		scan.close();
		scan2.close();
	}

}
// I ENIL SIHTHSIREBBIG S
//LEVELKAYAK
//H YPPAHSYADILO
//I ENIL SIHTHSIREBBIG S
//VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE