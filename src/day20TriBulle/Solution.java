package day20TriBulle;

import java.util.List;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class Solution {

	static List<Integer> triBulle(int n, List<Integer> tab) {
		int swapCount=0;
		boolean swapped;

		do {
			swapped = false;
			

			for (int i = 0; i < tab.size()-1; i++) {
				if (tab.get(i) > tab.get(i + 1)) {
					int temp = tab.get(i + 1);
					tab.set(i + 1, tab.get(i));
					tab.set(i, temp);
					swapped = true;
					swapCount++;
				}
			}
		} while (swapped);
		
		System.out.println("Array is sorted in "+swapCount+" swaps.");
		return tab;

	}

	public static void main(String[] args) {
		String pathFile = "source/day20TriBulle/input.txt";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile))) {
			;

			int n = Integer.parseInt(bufferedReader.readLine().trim());

			List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
					.map(Integer::parseInt).collect(Collectors.toList());
			bufferedReader.close();
			// System.out.println(a);
			List<Integer> tab = triBulle(n, a);
			System.out.println("First Element: "+tab.get(0));
			System.out.println("Last Element: "+tab.get(n-1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
