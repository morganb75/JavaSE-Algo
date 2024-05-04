package minmaxsum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxArray {

	public static void miniMaxSum(List<Integer> arr) {
		long min = 0, max = 0;
		Collections.sort(arr);
		// List<Integer>resList=new ArrayList<Integer>();

		for (int i = 1; i <= arr.size()-1; i++) {
			max = max + arr.get(i);
		}
		for (int j = 0; j <= arr.size() - 2; j++) {
			min = min + arr.get(j);
		}
		// resList.add(minSum,maxSum);
		System.out.println(min + " " + max);

	}

	public static void main(String[] args) {
		List<Integer> testTab = new ArrayList<Integer>();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("entrer N");
//		int n =scan.nextInt();
//		scan.close;
//		for (int i=0;i<n;i++) {
//		int nRandom = (int) (Math.random()*Math.pow(10, 2));
//		testTab.add(nRandom);
		testTab.add(256741038);
		testTab.add(623958417);
		testTab.add(467905213);
		testTab.add(714532089);
		testTab.add(938071625);
//		testTab.add(1);
//		testTab.add(2);
//		testTab.add(3);
//		testTab.add(4);
//		testTab.add(5);
//		}
		// Affichage testTab
//		for (int element:testTab) {
//			System.out.print(" "+element);
//		}
//		Collections.sort(testTab);
		miniMaxSum(testTab);
		System.out.println(testTab);

	}
}
