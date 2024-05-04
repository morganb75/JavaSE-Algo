package day17MoreExceptions;

import java.util.Scanner;

class Calculator{

	public int power(int n,int p) throws Exception {
		if(n<0 || p<0) {
			throw new Exception("n and p should be non-negative");
		}
		return (int) Math.pow(n,p);
	}
}


public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("entrer n puis p:");
		int n = scan.nextInt();
		int p = scan.nextInt();
		scan.close();
		
		Calculator myCalculator = new Calculator();
		int ans;
		try {
			ans = myCalculator.power(n, p);
			System.out.println(ans);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
