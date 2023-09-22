package com.kn.arrays;
import java.util.Scanner;

public class SearchElementArray {

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
		
		System.out.println("Engter a number to find in array");
		int num= scan.nextInt();
		
		boolean isNumberFound= findNumberInArray(arr, num);
		System.out.println("The number"+num+"is found="+ isNumberFound);
	}
	
	// Method to find the given number in array
	public static boolean findNumberInArray(int[] arr, int num) {
		for(int i=0; i<arr.length;i++) {
			if(num==arr[i]) {
				return true;
			}
		}
	}
}