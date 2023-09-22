package com.kn.arrays;
import java.util.Scanner;
public class TwoDJagArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		// array Declaration
		int[][] arr;
		
		// array Creation
		System.out.println("Enter the Size of Base Array");
		 int baseArray= scan.nextInt();
		 arr =new int[baseArray][]; // Size of Base array
		
		 
		 for (int i=0;i<arr.length;i++) {
				System.out.println("Enter the size of "+(i+1)+" Array of 2D array");
				int subArray=scan.nextInt(); // Size for SubArray
				arr[i]=new int[subArray]; 
		 }
	
		 
		
		// array initialization
		 
		 for (int i=0;i<arr.length;i++) {
			 System.out.println("Enter the values of "+(i+1)+"Array");
			 for (int j=0;j<arr[i].length;j++) {
			
				 arr[i][j]=scan.nextInt();
				 
			 }
		 }
		
		// Array Traversing
		 
		 for (int i=0;i<arr.length;i++) {
			 System.out.println(" ======The values of "+(i+1)+" Array=====");
			 for (int j=0;j<arr[i].length;j++) {
			
			System.out.println(arr[i][j]);
		
			 }
		 }
	}
}
	
