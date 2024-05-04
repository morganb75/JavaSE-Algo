package training;

public class appendAndDelete {

	class Result {
		public static String appendAndDelete(String s, String t, int k) {
			
			int count = 0; //compteur de caracteres identiques en partant du debut de chaine
			int minLength = Math.min(s.length(),t.length());
			int minOfOperations=0;
			
			//length of the common prefix
			for(int i=0;i<minLength;i++) {
				if (s.charAt(i)==t.charAt(i)) {
					count++;
				} else {
					break;
				}
			}
			
			minOfOperations = (s.length()-count)+(t.length()-count);
			
			if(k >= minOfOperations && (k - minOfOperations) % 2 == 0 || k >= s.length() + t.length()) {
				return "Yes";
			} else {
				return "No";
			}
			
		    }
	}
	public static void main(String[] args) {
		String s = "y";
		String t = "yu";
		int k = 2;
		String result = Result.appendAndDelete(s, t, k);
		System.out.println(result);
	}

}
