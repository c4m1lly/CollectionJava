package ExercicioCollection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		int i = 0;
		String entradaDados = "";

		Scanner leia = new Scanner(System.in);

		for (i = 0; i < 5; i++) {
			System.out.println("Escolha uma cor :");
			entradaDados = leia.next();
			cores.add(entradaDados);
		}
		for (String cor : cores) {
			System.out.println(cor);
		}
		cores.sort(null);
		System.out.println("As cores cadastradas em ordem Crescente:");
		for (String cor : cores) {
			System.out.println(cor);
		}
	}
}
