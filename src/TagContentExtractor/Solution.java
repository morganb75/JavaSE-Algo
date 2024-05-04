package TagContentExtractor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	private static void extractContent(String line) {
		// Définir le motif d'expression régulière pour extraire le contenu entre les
		// balises
//		String regex = "<([a-zA-Z0-9]+)[^>]*>(.*?)</\\1>"; //regex fonctionnant quand les balises sont correctement imbriquees
		String regex = "<([^>]+)>([^<]+)</\\1>"; // regex pour balises mal imbriquees
//		String regex = "<([^>]+)>(.*?)</\\1>";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(line);
		int count = 0;
		// Extraire le contenu entre les balises
		while (matcher.find()) {
			count++;
//			String tagName = matcher.group(1);
			String content = matcher.group(2).trim();
//			System.out.println(tagName);
			System.out.println(content);

		}
		if (count == 0) {
			System.out.println("None");
		}

	}

	public static void main(String[] args) {
		String line0 = "<h1>Nayeem loves counseling</h1>";
		String line1 = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
		String line2 = "<Amee>safat codes like a ninja</amee>";
		String line3 = "<SA premium>Imtiaz has a secret crush</SA premium>";

		extractContent(line0);
		extractContent(line1);
		extractContent(line2);
		extractContent(line3);

	}

}
