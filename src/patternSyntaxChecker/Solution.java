package patternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {

	public static void main(String[] args){
//		Scanner in = new Scanner(System.in);
//		int testCases = Integer.parseInt(in.nextLine());
//		while(testCases>0){
//			String pattern = in.nextLine();
//          	Pattern regex = Pattern.compile(pattern);
//		}
		//expression reguliere à tester
//		String regex="([A-Z])(.+)";
//		String regex="[AZ[a-z](a-z)";
		String regex="batcatpat(nat";
		//test de la validité
		try {
			Pattern pattern=Pattern.compile(regex);
			System.out.println("Valid");
		} catch (PatternSyntaxException e) {
			System.out.println("Invalid: "+e.getMessage());
		}
	}
}
