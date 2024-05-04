package training;

import java.util.ArrayList;
import java.util.List;

public class day11Array2D {
	//Fonction maxHourGlass
	static int maxHourGlass(List<List<Integer>> matrice) {
		int maxValue = Integer.MIN_VALUE;
		int i = 0, j = 0;
		// while(i+2<matrice.size() && j+2<matrice.get(i).size())
		for (i = 0; i <= matrice.size() - 3; i++) {
			for (j = 0; j <= matrice.get(i).size()-3; j++) {
				int Value = matrice.get(i).get(j) + matrice.get(i).get(j + 1) + matrice.get(i).get(j + 2)
						+ matrice.get(i + 1).get(j + 1) + matrice.get(i + 2).get(j) + matrice.get(i + 2).get(j + 1)
						+ matrice.get(i + 2).get(j + 2);
				if (Value > maxValue) {
					maxValue = Value;
				}
			}
		}
		return maxValue;

	}

	public static void main(String[] args) {

		List<List<Integer>> matrice = new ArrayList<>();

		int rowSize = 6, colSize = 6, aijValue = 0, maxValue=0;
		
//		// Remplissage matrice
		for (int i = 0; i < rowSize; i++) {
			List<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j < colSize; j++, aijValue++) {
				row.add(aijValue);
			}
			matrice.add(row);
		}
		//Matrice de test HackerRank**********************************************
//		matrice.add(new ArrayList<Integer>() {{
//            add(-1);
//            add(-1);
//            add(0);
//            add(-9);
//            add(-2);
//            add(-2);
//        }});
//
//        matrice.add(new ArrayList<Integer>() {{
//            add(-2);
//            add(-1);
//            add(-6);
//            add(-8);
//            add(-2);
//            add(-5);
//        }});
//
//        matrice.add(new ArrayList<Integer>() {{
//            add(-1);
//            add(-1);
//            add(-1);
//            add(-2);
//            add(-3);
//            add(-4);
//        }});
//
//        matrice.add(new ArrayList<Integer>() {{
//            add(-1);
//            add(-9);
//            add(-2);
//            add(-4);
//            add(-4);
//            add(-5);
//        }});
//
//        matrice.add(new ArrayList<Integer>() {{
//            add(-7);
//            add(-3);
//            add(-3);
//            add(-2);
//            add(-9);
//            add(-9);
//        }});
//
//        matrice.add(new ArrayList<Integer>() {{
//            add(-1);
//            add(-3);
//            add(-1);
//            add(-2);
//            add(-4);
//            add(-5);
//        }});
//		
		//*************************************************************

		// Affichage matrice
		System.out.println("############## MATRICE 6x6 ##############");
		for (List<Integer> row : matrice) {
			for (int value : row) {
				System.out.print(value + "\t ");
			}
			System.out.println();
		}
		
		//Calcul du max hourGlass
		maxValue = maxHourGlass(matrice);
		System.out.println("#########################################");
		System.out.println("Max HourGlass value: "+maxValue);
//		int test = matrice.get(0).get(0) + matrice.get(0).get(1);
//		System.out.println(test);
	}

}
