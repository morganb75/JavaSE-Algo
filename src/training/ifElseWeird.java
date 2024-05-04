package training;

import java.util.Scanner;

public class ifElseWeird {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Entrer nombre entier");
    	int N = scanner.nextInt();
    	scanner.close();
    	
    	if((N % 2)!= 0 || (N>=6 && N<=20)) { 
    		System.out.println("Weird");
    	} else { 
    		System.out.println("Not Weird");
    	}
        
    }
}
