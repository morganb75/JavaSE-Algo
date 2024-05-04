package TheGridSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOccurencesIndices {

	public static void main(String[] args) {
		  String inputString = "1111111";
	        //String regex = "11"; // ne detecte pas si les occurences se chevauchent
	        String regex = "(?=11)"; //detecte quand les occurences se chevauchent "positive lookahead"

	        // Appel de la fonction pour obtenir le nombre d'occurrences et les indices
	        ResultatOccurrences resultat = trouverOccurrencesEtIndices(inputString, regex);

	        // Affichage des résultats
	        System.out.println("Nombre d'occurrences : " + resultat.getNombreOccurrences());
	        System.out.println("Indices de début : " + resultat.getIndicesDebut());
	    }

	    private static class ResultatOccurrences {
	        private int nombreOccurrences;
	        private List<Integer> indicesDebut;

	        ResultatOccurrences(int nombreOccurrences, List<Integer> indicesDebut) {
	            this.nombreOccurrences = nombreOccurrences;
	            this.indicesDebut = indicesDebut;
	        }
//	        ResultatOccurrences(int nombreOccurrences, StringBuilder indicesDebut) {
//	        	this.nombreOccurrences = nombreOccurrences;
//	        	this.indicesDebut = indicesDebut;
//	        }

	        int getNombreOccurrences() {
	            return nombreOccurrences;
	        }

	        List<Integer> getIndicesDebut() {
	            return indicesDebut;
	        }
	    }

	    private static ResultatOccurrences trouverOccurrencesEtIndices(String input, String regex) {
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(input);

	        int nombreOccurrences = 0;
	        List<Integer> indicesDebut = new ArrayList<Integer>();

	        while (matcher.find()) {
	            int debut = matcher.start();
	            indicesDebut.add(debut);
	            nombreOccurrences++;
	        }
	        System.out.println(indicesDebut);
	        return new ResultatOccurrences(nombreOccurrences, indicesDebut);
	    }
	}
