package com.kn.arrays;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int num= scan.nextInt();
	int result=calculateFactorial(num);
	System.out.println(" Factorial: "+result);
	}

	public static int calculateFactorial(int num) {
	int fact=1;
	
	for(int i=num;i>=1;i--) {
		fact=fact*i;
	}
		
		return fact;
	}
	

}
