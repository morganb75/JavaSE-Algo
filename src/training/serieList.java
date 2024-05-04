package training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class serieList {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("entrer t:");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("entrer a:");
        	int a = in.nextInt();
        	System.out.println("entrer b:");
            int b = in.nextInt();
            System.out.println("entrer n:");
            int n = in.nextInt();
        List<Integer> nbList = new ArrayList<Integer>();
        for (int j=0;j<n;j++) {
        	double term = (a + b*(Math.pow(2, j+1)-1));
        	nbList.add((int) term);
        }
        System.out.println("t "+t+"a "+a+"b "+b+"n "+n);
        System.out.println(nbList);
        
        }
        in.close();
    }
}
