package GamingArray;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

	/*
	 * Complete the 'gamingArray' function below.
	 *
	 * The function is expected to return a STRING. The function accepts
	 * INTEGER_ARRAY arr as parameter.
	 */

	public static String gamingArray(List<Integer> arr) {
// MA VERSION DE BASE
//		int max = 0;
//		int maxIndex = -1;
//		int count = 0;
//		String result = "BOB";
//		while (arr.size() != 0) {
//			max=0;
//			maxIndex=0;
//			
//			for (int nb : arr) {
//				if (nb > max) {
//					max = nb;
//					maxIndex = arr.indexOf(nb);
//				}
//			}
// VERSION OPTIMISEE V1 CAR TIMEOUT SUR HACKERRANCK => reste 3 cas tests qui ne passent pas en timeout (on teste sur le 18)
		int count = 0;
		int maxIndex = -1; // => on sort la variable de la boucle pour gagner le temps d'init a chaque tour: testcase18 en timeout encore!
		int arraySize=arr.size();
		//while (!arr.isEmpty()) {
		while (arraySize>0) {
			int max = Integer.MIN_VALUE;
			
			for (int i = 0; i < arraySize; i++) {
				int nb = arr.get(i);
				if (nb > max) {
					max = nb;
					maxIndex = i;
				}
			}
			arraySize = maxIndex;
			//arr = arr.subList(0, maxIndex);  ==> on s'affranchit de l'ecriture des sous liste en passant la mise a jour de la taille dans la boucle avec la variable arraysize
			//Modfi V2: au lieu de re ecrire la sublist, on supprime les elements de la liste => cas 19 et 20 en timeout encore!
			//arr.subList(maxIndex, arr.size()).clear(); 
//			System.out.println(arr);
			count++;
//			System.out.println(count);
		}
		return (count % 2 == 0) ? "ANDY" : "BOB";
	}
}

public class Solution {

	public static void main(String[] args) throws IOException {
		long startTime = System.nanoTime();
		List<Integer> array = new ArrayList<Integer>();

		String pathFile = "source/GamingArray/test18.txt";
//		File fichier = new File(pathFile);
//		if (fichier.exists()) {
//			System.out.println("fichier trouvé!");
//		} else {
//			System.out.println("Fichier introuvable!");
//		}

		try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {

			int g = Integer.parseInt(reader.readLine());
//			System.out.println("g= " + g);
			for (int i = 0; i <= g; i++) {

				String n = reader.readLine();
//				System.out.println("N= " + n);
//				int ligne = Integer.parseInt(reader.readLine());
				String ligne = reader.readLine();
				if (ligne != null) {
					String[] tokens = ligne.split(" ");
					array.clear();
					for (String token : tokens) {
						array.add(Integer.parseInt(token));
					}
//					System.out.println("Liste des entiers lus: " + array);
					System.out.println(Result.gamingArray(array));
				}

			}
		} catch (FileNotFoundException e) {
			System.err.println("FICHIER INTROUVABLE!");
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1_000_000; // Convertir en millisecondes
		System.out.println("Temps d'exécution : " + duration + " ms");

	}

}
