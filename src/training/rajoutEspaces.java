package training;

import java.text.DecimalFormat;
import java.util.Scanner;

public class rajoutEspaces {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            int spaceToAdd = 15 - s1.length();
            for (int j=0;j<spaceToAdd;j++) {
            	s1 += " ";
            }
            DecimalFormat df = new DecimalFormat("000");
            String zeroAjoutes = df.format(x);
            System.out.println(s1 + zeroAjoutes);
            
        }
        System.out.println("================================");

}
}
