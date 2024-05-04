package day25RunningTimeAndComplexity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

public class Solution {

	public static void prime(int n) {
		
		// Complexité temporelle O(n)
//		int count = 0;
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0) {
//				count++; 
//			}

		// Complexité temporelle 0(rac(n)) crible d'Eratosthene
		int count = 0;
		double racN = Math.sqrt((double) n);
		if (n == 1) {
			System.out.println("Not prime");
		} else {
			for (int i = 2; i <= racN; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			System.out.println((count == 0) ? "Prime" : "Not prime");
		}
	}

	public static void main(String[] args) {
		String pathFile = "source/day25RunningTimeAndComplexity/input09.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(pathFile))) {
			String ligne;
			String firstLine = reader.readLine();
			while ((ligne = reader.readLine()) != null) {
				int n = Integer.parseInt(ligne);

//				System.out.println(n);
				prime(n);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
