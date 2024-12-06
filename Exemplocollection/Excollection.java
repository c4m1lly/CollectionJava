package Exemplocollection;

import java.util.ArrayList;

public class Excollection {

	public class CollectionList {

		public static void main(String[] args) {

			
			ArrayList<Double> notas = new ArrayList<Double>();

			
			Double y = Double.valueOf(9);

			notas.add(y);
			notas.add(7.0);
			notas.add(5.0);
			notas.add(4.0);
			notas.add(10.0);
			notas.add(4.0);

			System.out.println("\nNotas cadastradas: " + notas);

			
		}

	}
}