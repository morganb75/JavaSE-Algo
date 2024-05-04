package day29BitwiseAnd;

import java.util.Scanner;

class Result {

	/*
	 * Complete the 'bitwiseAnd' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER N 2. INTEGER K
	 */

//	public static int bitwiseAnd(int N, int K) {
//		int max = 0;
//		for (int i = 1; i <= N; i++) {
//			for (int j = i + 1; j <= N; j++) {
//				System.out.println(i+"&"+j+"="+ (i&j));
//				if (max < (i & j) && (i&j) < K) {
//					max = (i & j);
//				}
//			}
//		}
//		return max;
//
//	}
//
//}
	public static int bitwiseAnd(int N, int K) {
	    int max = 0;

	    for (int i = 1; i <= N; i++) {
	        for (int j = i + 1; j <= N; j++) {
	            int currentAnd = i & j;

	            if (currentAnd < K && currentAnd > max) {
	                max = currentAnd;
	            }

	            // Si le résultat actuel est déjà inférieur à l'actuel maximum possible,
	            // inutile de continuer avec les valeurs suivantes de j.
	            if (max == K - 1) {
	                break;
	            }
	        }
	    }

	    return max;
	}
	
}
	

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("entrer N");
		int N = scan.nextInt();
		System.out.println("entrer K");
		int K = scan.nextInt();
		int res = Result.bitwiseAnd(N, K);
		System.out.println(res);
	}
}
