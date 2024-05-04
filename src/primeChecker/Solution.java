package primeChecker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Prime {

	public boolean isPrime(int n) {
		int count = 0;
		double racN = Math.sqrt((double) n);
		if (n == 1) {
			return false;
		} else {
			for (int i = 2; i <= racN; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				return true;
			} else {
				return false;
			}
		}
	}

	public void checkPrime(int... args) {
		List<Integer> liste = new ArrayList<>();
		for (int arg:args) {
			if(isPrime(arg)) {
				liste.add(arg);
			}
		}
		if(!liste.isEmpty()) {
		for(int nb:liste) {
			System.out.print(nb+" ");
		}
		} else { 
			System.out.print("*");
		}
		System.out.println();
	}

}

public class Solution {
	public static void main(String[] args) {
		String pathFile = "source/primeChecker/input.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(pathFile));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			Prime ob = new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
