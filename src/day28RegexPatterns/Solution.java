package day28RegexPatterns;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

//	private static List<String> extractFirstName(String firstName, String emailID) {
//		List<String> liste = new ArrayList<String>();
//		String regex = ".*@gmail\\.com$";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(emailID);
//		if (matcher.find()) {
//			liste.add(firstName);
//		}
//		return liste;
//	}

	private static boolean extractFirstName(String firstName, String emailID) {
		String regex = ".*@gmail\\.com$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailID);
		if (matcher.find()) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) throws IOException {
		String filePath = "source/day28RegexPatterns/input.txt";
		List<String> liste = new ArrayList<String>();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {

			int N = Integer.parseInt(bufferedReader.readLine().trim());

			for (int NItr = 0; NItr < N; NItr++) {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				String firstName = firstMultipleInput[0];

				String emailID = firstMultipleInput[1];
				
				
				if(extractFirstName(firstName, emailID)) {
					liste.add(firstName);
				}
				
			}
			Collections.sort(liste);
			for (String element:liste) {
				System.out.println(element);
			}
			

			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
