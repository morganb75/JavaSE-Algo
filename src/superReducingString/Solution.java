package superReducingString;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;

class Result {

	public static String superReducedString(String s) {
		//System.out.println("fctn appele");
		String regex = "(.)\\1";
		Pattern pattern = Pattern.compile(regex);
		//Matcher matcher;// = pattern.matcher(s);
		
		while (pattern.matcher(s).find()) {
			s = s.replaceAll(regex, "");
		}
		
		if (s.isEmpty()) {
			return "Empty String";
		} else {
			return s;
		}
	}
}

public class Solution {

	public static void main(String[] args) {
		String pathFile = "source/superReducedString/input.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
			String s = reader.readLine();
			System.out.println(s);
			String sFinale = Result.superReducedString(s);
			System.out.println(sFinale);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
