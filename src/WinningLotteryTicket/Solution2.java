package WinningLotteryTicket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Result2 {

	public static boolean test(String input) {
		
		//utilisation d'un HashSet pour tester si tous les chiffres apparaissent
		Set<Character> digitSet = new HashSet<Character>();
		
		for (char c : input.toCharArray()) {
			digitSet.add(c);
		}
		boolean test= digitSet.size() == 10;
		return test;
	}

	public static long winningLotteryTicket(List<String> tickets) {
		long result = 0;
		String input = null;
		for (int i = 0; i < tickets.size(); i++) {
			for (int j = i + 1; j < tickets.size(); j++) {
				input = tickets.get(i) + tickets.get(j);
				if (test(input)) {
					result++;
				}
			}
		}
		return result;
	}
}

public class Solution2 {

	public static void main(String[] args) throws IOException {
		long startTime = System.nanoTime();

		List<String> tickets = new ArrayList<String>();

		// lecture d'un fichier test.txt
		// Chargez le fichier en utilisant une URL relative à la classe
		URL resource = Solution.class.getResource("test2.txt");

		if (resource == null) {
			System.err.println("Fichier introuvable.");
			return;
		}

		// Imprimez le chemin du fichier pour le test
		System.out.println("Chemin du fichier : " + resource.getPath());

		try (InputStream inputStream = resource.openStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

			String firstLine = reader.readLine();
			if (firstLine != null) {
				int n = Integer.parseInt(firstLine);
				System.out.println("nb de tickets: " + n);
			}

			String ligne;
			while ((ligne = reader.readLine()) != null) {

				// System.out.println(ligne);
				String num = ligne;
				tickets.add(num);
			}

		} catch (IOException e) {
			System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
		}

		long result = Result2.winningLotteryTicket(tickets);
		System.out.println(result + " combinaison(s) gagnante(s)");

		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1_000_000; // Convertir en millisecondes
		System.out.println("Temps d'exécution : " + duration + " ms");
	}
}
