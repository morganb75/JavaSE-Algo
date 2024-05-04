package DiagonalesMatrix;

import java.util.ArrayList;
import java.util.List;

public class SommeDiagonalesMatrice {

	public static void main(String[] args) {
		List<List<Integer>> matrice = new ArrayList<>();

        // Ajouter des lignes à la matrice (exemple)
        matrice.add(List.of(1, 2, 3));
        matrice.add(List.of(4, 5, 6));
        matrice.add(List.of(5, 8, 9));

        // Calculer la somme des diagonales
        int sommePrincipale = sommeDiagonalePrincipale(matrice);
        int sommeAntiPrincipale = sommeDiagonaleAntiPrincipale(matrice);
        int diff = Math.abs(sommePrincipale-sommeAntiPrincipale);
        // Afficher les résultats
        System.out.println("Somme diagonale principale : " + sommePrincipale);
        System.out.println("Somme diagonale anti-principale : " + sommeAntiPrincipale);
        System.out.println("val Abs diff principale-Antiprincipale : " + diff);
    }

    // Calculer la somme des éléments sur la diagonale principale
    private static int sommeDiagonalePrincipale(List<List<Integer>> matrice) {
        int somme = 0;
        for (int i = 0; i < matrice.size(); i++) {
            somme += matrice.get(i).get(i);
        }
        return somme;
    }

    // Calculer la somme des éléments sur la diagonale anti-principale
    private static int sommeDiagonaleAntiPrincipale(List<List<Integer>> matrice) {
        int somme = 0;
        for (int i = 0; i < matrice.size(); i++) {
            somme += matrice.get(i).get(matrice.size() - 1 - i);
        }
        return somme;

	}

}
