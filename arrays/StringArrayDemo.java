package com.kn.arrays;
import java.util.Scanner;

public class StringArrayDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Array Declaration
		String[] arr;
		
		// Array  Initilization
		System.out.println("Enter the size of array");
		arr= new String[scan.nextInt()];
		
		//Arr Initialization
		
		for (int i=0; i< arr.length;i++) {
			System.out.println("Enter"+ (i+1)+" String data=");
			arr[i]= scan.next();
		
		}
		
		// Arr Traversing
		System.out.println("Array data is as follows");
		for( int i=0;i< arr.length;i++) {
			
			System.out.println(arr[i]);
		}
			
	}

}
