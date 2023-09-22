package com.kn.arrays;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Array Declaration
		int[] arr;
	
		// Array 	creation 
		System.out.println("Enter the size of array");
		arr= new int[scan.nextInt()];
		
		//Arr Initialization
		
		System.out.println( "Enter The value for Array" );
		for (int i=0; i<arr.length;i++) {
			
			arr[i]= scan.nextInt();
		}
		
		 // Sum of Array
		 int sum=0;
		for(int i=0; i<arr.length;i++) {
		  sum= sum+arr[i];
		 
		}
		System.out.println("Sum="+ sum);
	}
}