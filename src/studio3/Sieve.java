package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 

		int totalNumber;
	
		System.out.print("input n value between 2 and 40 :  ");
		totalNumber = in.nextInt();
		
		
		boolean [] prime = new boolean [totalNumber+1] ;  
		for (int i=2; i<totalNumber; ++i) {
				prime [i] = true ;}
		
		for (int i=2; i*i <= totalNumber; ++i ) {
			if (prime [i] == true) {
			for (int j = i*i; j<=totalNumber; j=j+i) {
				prime [j] = false;}
			}
			
		}
		for (int i=2; i<totalNumber; ++i)
		{	if (prime [i] == true) { 
		System.out.print(i + " ");}
	}
}
}
