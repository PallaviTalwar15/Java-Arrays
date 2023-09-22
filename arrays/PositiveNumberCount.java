package com.kn.arrays;

import java.util.Scanner;



public class PositiveNumberCount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Array Declaration and Creation
		System.out.println("Enter the Size of Array");
		 int[] arr= new int[scan.nextInt()]; 
		
		// Array Intialization
		 System.out.println("Enter the Elements of array");
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=scan.nextInt();
		 }
		
		//Call a method to find the count of Positive number 
		 int result = findPositiveElement(arr);
		 
		 System.out.println("Count of Positive="+result);
		 

	}
	//Method to find the Count of Positive Number

	public static int findPositiveElement(int[] arr) {
		 int count=0; //to Count positive Element 
		 
		 for(int i=0;i<arr.length;i++) {
			 if (arr[i]>0)
			 {
				 count=count+1;
				 
			 }
		 }
		 return count; 
	}
}
