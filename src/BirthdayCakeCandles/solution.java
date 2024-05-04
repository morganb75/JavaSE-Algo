package BirthdayCakeCandles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class solution {

	public static int birthdayCakeCandles(List<Integer> candles) {
		Collections.sort(candles, Collections.reverseOrder());
		int maxHeight = candles.get(0);
		int count = 0;

		for (int element : candles) {
			if (element == maxHeight) {
				count++;
			}
		}
		System.out.println("MaxHeight= " + maxHeight);
		return count;
	}

	public static void main(String[] args) {
		List<Integer> candles = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("entrer N");
		int n =scan.nextInt();
		scan.close();
		
		for (int i=0;i<n;i++) {
		int nRandom = (int) (Math.random()*Math.pow(10, 2));
		candles.add(nRandom);
		}
		int result = birthdayCakeCandles(candles);
		System.out.println(candles);
		System.out.println(result);
}
}

