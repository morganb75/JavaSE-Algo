package TheGridSearch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ResRegexVO {
    private boolean trouve;
    private int indiceDebut;

    public ResRegexVO(boolean trouve, int indiceDebut) {
        super();
        this.trouve = trouve;
        this.indiceDebut = indiceDebut;
    }

    public boolean isTrouve() {
        return trouve;
    }

    public int getIndiceDebut() {
        return indiceDebut;
    }

}
class ResultV0 {

    static ResRegexVO findRegex(String s, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            return new ResRegexVO(true, matcher.start());
        } else {
            return new ResRegexVO(false, -1);
        }
    }

    public static String gridSearch(List<String> G, List<String> P) {
    String regex = P.get(0);
        String result = "";
        for (int i = 0; i <= G.size() - P.size(); i++) {
            if (findRegex(G.get(i), regex).isTrouve()) {
                // boolean testRegex;
                result = "YES";
                int indexCtrl = findRegex(G.get(i), regex).getIndiceDebut();
                int k = 0;
                for (int j = i + 1; j <= (i - 1 + P.size()); j++) {
                    k++;
                    String regex2 = P.get(k);
                    if (findRegex(G.get(j), regex2).isTrouve()
                            && findRegex(G.get(j), regex2).getIndiceDebut() == indexCtrl) {
                        // ne fait rien laissant donc result =YES
                    } else {
                        result = "NO"; // si une seule ligne manque le test==>result NO
                    }

                }

            }

        }
        return result;
    }

    }

public class SolutionV0 {

	public static void main(String[] args) {
		List<String> G = new ArrayList<String>();
		List<String> P = new ArrayList<String>();
		// String pathFile = "input.txt";
		String pathFile = "source/TheGridSearch/input1.txt";
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
				result = ResultV0.gridSearch(G, P);
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
