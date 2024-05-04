package NewYearChaos;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void minimumBribes(List<Integer> q) {
		Integer count = 0;
		for (int num : q) {
			if (num - q.indexOf(num) <= 3 && num - q.indexOf(num) != 0) {
				count = count + (num - (q.indexOf(num) + 1));
			} else if (num - q.indexOf(num) == 0) {
				// ne rien faire
			} else {
				System.out.println("Too chaotic");
				count = null;
				break;
			}

		}
		if (count != null) {
			System.out.println(count);
		} 
	}

	public static void main(String[] args) {
		List<Integer> q = new ArrayList<Integer>();
		q.add(1);
		q.add(2);
		q.add(5);
		q.add(3);
		q.add(7);
		q.add(8);
		q.add(6);
		q.add(4);
		System.out.println(q);
		minimumBribes(q);

	}
}
