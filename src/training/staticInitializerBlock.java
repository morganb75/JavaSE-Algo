package training;

import java.util.Scanner;

public class staticInitializerBlock {

	static int B,H;
	static boolean flag;
	
	static {
		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();
		scan.close();
		
		if (B<=0 || H<=0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive" );
			flag = false;
		} else {
			flag = true;
		}
	}
	
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

