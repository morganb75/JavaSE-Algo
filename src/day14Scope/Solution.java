package day14Scope;

import AbstractClass.main;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] elements) {
		super();
		this.elements = elements;
	}

	public int computeDifference() {
		maximumDifference = 0;
		for (int i = 0; i < elements.length; i++) {
			for (int j = i + 1; j < elements.length; j++) {
				int diff = Math.abs(elements[i] - elements[j]);
				if (maximumDifference < diff) {
					maximumDifference = diff;
				}
			}
		}
		return maximumDifference;
	}
}

public class Solution {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5 };
		Difference difference = new Difference(a);
		difference.computeDifference();
		System.out.println(difference.maximumDifference);
	}
}
