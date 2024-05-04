package substringComparisons;

import java.util.Scanner;

public class solution {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = smallest;
         // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i=0;i<=s.length()-k;i++) {
        	String subS = s.substring(i,i+k);
        	//System.out.println(subS);
        	
        	if (subS.compareTo(largest)>0) {
        		largest=subS;
        	}
        	if(subS.compareTo(smallest)<0) {
        		smallest=subS;
        	} 
        	
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();
    	String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
    	int k = 30;
      
        System.out.println(getSmallestAndLargest(s, k));
    	//Test compareTo
//    	String s1="ba";
//    	String s2="a";
//    	
//    	int res = s1.compareTo(s2);
//    	System.out.println(res);
    }
}

