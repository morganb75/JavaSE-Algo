package day19Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface AdvancedArithmetic {
	int divisorSum(int n);
	
	List<Integer> divisorList(int n);
}
	

class Calculator implements AdvancedArithmetic {
	
	public int divisorSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	@Override
	public List<Integer> divisorList(int n) {
		List<Integer> liste = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				liste.add(i);
			}
		}
		return liste;
	}
	
	
}



public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator();
		List<Integer> liste = myCalculator.divisorList(n);
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println("Liste des diviseurs de " + n+": "+liste);
		System.out.println("Somme des diviseurs de "+n+":"+sum);
		
	}
}
