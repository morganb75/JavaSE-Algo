package training;

import java.util.Scanner;

public class intToString {
	public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
        System.out.println("Entrer n");
        int n = scan.nextInt();
        scan.close();
        String s = Integer.toString(n);
        if (s != null) {
        		System.out.println("Good job");
        	} else {
        		System.out.println("Wrong answer");	
        	}
    }
}
