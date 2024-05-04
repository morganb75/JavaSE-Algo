package javaRegex;

import java.util.Scanner;

public class Solution {

	
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
            String IP = "121.234.12.12";
            System.out.println(IP.matches(new MyRegex().getPattern()));
        }
	
}
