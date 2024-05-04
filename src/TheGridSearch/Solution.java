package TheGridSearch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ResRegex {
	private boolean trouve;
	// private StringBuilder indices;
	private List<Integer> indices;
	private int nbOcc;

	public ResRegex(boolean trouve, List<Integer> indices, int nbOcc) {
		super();
		this.trouve = trouve;
		this.indices = indices;
		this.nbOcc = nbOcc;
	}

	public boolean isTrouve() {
		return trouve;
	}

	public List<Integer> getIndices() {
		return indices;
	}

	public int getNbOcc() {
		return nbOcc;
	}
}

class Result {

	static ResRegex findRegex(String s, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		int nbOccurences = 0;
		List<Integer> indices = new ArrayList<Integer>();

		while (matcher.find()) {
			int indice = matcher.start();
			
			indices.add(indice);
			nbOccurences++;
		}

		if (nbOccurences == 0) {
			return new ResRegex(false, null, 0);
		}

		return new ResRegex(true, indices, nbOccurences);
	}

	public static String gridSearch(List<String> G, List<String> P) {

		String regex = "(?="+P.get(0)+")"; //(?=regex) => positive lookahead pour detecter les occurences meme si chevauchement(testcase9)
		String result = "";

		for (int i = 0; i <= G.size() - P.size(); i++) {
			int k = 0; //variable de controle du regex2
			if (result == "YES") {
				return result;
			} else {

				ResRegex resRegexi = findRegex(G.get(i), regex);

				if (!resRegexi.isTrouve()) {
					// on ne fait rien et on laisse tourner la boucle sur i
				} else {
					// le motif est present et on va aller tester la ligne suivante
					List<Integer> indicesi = resRegexi.getIndices();
					for (int j = i + 1; j < i + P.size(); j++) {

						k++;
						String regex1 = "(?="+P.get(k)+")";
						ResRegex resRegexj = findRegex(G.get(j), regex1);
						List<Integer> indicesj = resRegexj.getIndices();
						if (!resRegexj.isTrouve()) {
							// motif absent d'une des lignes suivantes on sort de la boucle
							result="NO";
							break;
						} else {
							// le motif est present on checke l'index
							for (int ind : indicesj) {
								if (indicesi.contains(ind)) {
									result = "YES"; // meme index on sort
									break;
								} else {
									result = "NO"; // index different on continue le check
								}
							}
						}
					}
				}
			}
		}
		return result;
	}
}

public class Solution {

	public static void main(String[] args) {
		List<String> G = new ArrayList<String>();
		List<String> P = new ArrayList<String>();
		// String pathFile = "input.txt";
		String pathFile = "source/TheGridSearch/testCase9.txt";
		String result = "";

		try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
			String row = "";
			int t = Integer.parseInt(reader.readLine());

			for (int i = 1; i <= t; i++) {
				G.clear();
				P.clear();
				String[] dimG = (reader.readLine()).split(" ");
				for (int j = 0; j < Integer.parseInt(dimG[0]); j++) {
					row = reader.readLine();
					G.add(row);
				}

				String[] dimP = (reader.readLine()).split(" ");

				for (int k = 0; k < Integer.parseInt(dimP[0]); k++) {
					row = reader.readLine();
					P.add(row);
				}
				result = Result.gridSearch(G, P);
				System.out.println(result);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
