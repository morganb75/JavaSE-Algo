package training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarkAndToysArrays {

	public static int maximumToys(List<Integer> prices,int k) {
		// rangement de la liste par ordre croissant
		Collections.sort(prices);
		System.out.println(prices);
		int sumPrices =prices.get(0);
		int i =0;
		int count = 1;
		while (k>sumPrices && i< prices.size()-1) {
			i++;
			count++;
			sumPrices = sumPrices + prices.get(i);
			System.out.println(sumPrices+" i="+i+" k="+k);
			if(sumPrices>k) {
				count--;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		List<Integer> prices = new ArrayList<Integer>();
		//TEST CASE0
//		prices.add(1);
//		prices.add(12);
//		prices.add(5);
//		prices.add(111);
//		prices.add(200);
//		prices.add(1000);
//		prices.add(10);
//		int k = 50;
		//TEST CASE2
		prices.add(3);
		prices.add(7);
		prices.add(2);
		prices.add(9);
		prices.add(4);
		int k = 15;		
		
		System.out.println(maximumToys(prices, k)+" jouet(s) achetables au maximum");
	}
}
