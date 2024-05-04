package training;

import java.util.ArrayList;
import java.util.List;

public class greedyFloristArrays {

	// decomposition de n en k entiers selon principe de division euclidienne
	static List<Integer> decomposeEqui(int n, int k) {
		List<Integer> liste = new ArrayList<Integer>();
		int quotient = n / k;
		int reste = n % k;
		// decomposition selon principe de division euclidienne
		for (int i = 0; i < (k - 1); i++) {
			liste.add(quotient);
		}
		liste.add(quotient + reste);
		// Modification de la liste pour que les entiers soient les plus proches les uns
		// des autres
		for (int i = 0; i < reste; i++) {
			liste.set(i, quotient + 1);
		}
		liste.set(k - 1, quotient);
		return liste;
	}

	// Montage de la "Matrice de vente" en fonction de la décomposition (n,k)
	static List<List<Integer>> matriceVente(List<Integer> liste, int n, int k) {
		List<List<Integer>> matrix = new ArrayList<>();
		for (int i = 0; i < liste.get(0); i++) {
			List<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				if (j >= n - k * (i + 1) && j < n - k * i) {
					row.add(i + 1);
				} else {
					row.add(0);
				}
			}
			matrix.add(row);
		}
		return matrix;
	}

	// Multiplication d'une matrice (n,k) par une matrice (k,1)
	static List<Integer> resVente(List<List<Integer>> matriceV, List<Integer> liste, List<Integer> listePrix, int n) {
		List<Integer> matrixRes = new ArrayList<Integer>();

		for (int i = 0; i < liste.get(0); i++) {
			int res = 0;
			for (int j = 0; j <= (n - 1); j++) {
				res = res + matriceV.get(i).get(j) * listePrix.get(j);
			}
			matrixRes.add(res);
		}
		return matrixRes;
	}

	static int getMinimumCost(List<Integer> matrixRes,int[] c) {
		//Transformation de int[] c = new int[n] en ArrayList listePrix pour hackerrank;
//        List<Integer> listePrix = new ArrayList<>();
//        for (int entier : c) {
//            listePrix.add(entier);}
		///////////////////////////////////////////////////////////////////////////////
			
		
		int res = 0;
		for (int value:matrixRes) {
			res = res+value;
		}
		return res;

	}

	public static void main(String[] args) {
		//Donnees d'entree
		//******************
		int n = 3;
		int k = 2;
		int[] c = {2,5,6};
		//******************
        List<Integer> listePrix = new ArrayList<>();
        for (int entier : c) {
            listePrix.add(entier);}
		
		int sum = 0;
		int resFinal = 0;
//		List<Integer> listePrix = new ArrayList<Integer>();
//		listePrix.add(2);
//		listePrix.add(5);
//		listePrix.add(6);
//		listePrix.add(7);
//		listePrix.add(9);
		System.out.println(listePrix);
		List<Integer> liste = decomposeEqui(n, k);
		System.out.println("quotient: " + n / k);
		System.out.println("reste: " + n % k);
		System.out.println(liste);
		for (int element : liste) {
			sum = sum + element;
		}
		System.out.println("Check n: " + sum);
		System.out.println("dernier terme: " + liste.get(k - 1));

		List<List<Integer>> matrix = matriceVente(liste, n, k);
		System.out.println("#################  MATRICE DE VENTE ################");
		for (List<Integer> row : matrix) {
			for (int value : row) {
				System.out.print(value + "   ");
			}
			System.out.println();
		}
		System.out.println("#################  MATRICE RES ################");
		List<Integer> matriceRes = new ArrayList<Integer>();
		matriceRes = resVente(matrix, liste, listePrix, n);
		System.out.println(matriceRes);
		resFinal = getMinimumCost(matriceRes,c);
		System.out.println("PRIX MINIMUM: "+resFinal);
	}
}
