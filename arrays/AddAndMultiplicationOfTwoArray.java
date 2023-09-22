package com.kn.arrays;
import java.util.Scanner;
public class AddAndMultiplicationOfTwoArray {
	public static void main(String[] args){
		
		Scanner scan= new Scanner(System.in);
		
		// Array Declaration and Creation
		System.out.println("Enter the Size of Array");
		int sizeOfArray= scan.nextInt();
		
		int[] arr = new int[sizeOfArray];
		int[] brr = new int[sizeOfArray];
		int[] crr = new int[sizeOfArray];
		int[] drr = new int[sizeOfArray];
		
		// 1st Array Intialization 
		System.out.println("Enter the Value for 1st Array");
		 for(int i=0;i<arr.length;i++) {
			 
			 arr[i]=scan.nextInt();
		 }
		 
		// 2nd Array Intialization 
			System.out.println("Enter the Value for 2nd Array");
			 for(int i=0;i<arr.length;i++) {
				 
				 brr[i]=scan.nextInt();	 
			 }
			 
			// Addition result
			System.out.println("======Addtion====");
			
			for(int i=0;i<arr.length;i++) {
			
				crr[i]=arr[i]+brr[i];
				System.out.print(crr[i]+" ");
			}
			
			// Multiplication result
						System.out.println("\n======Multiplication====");
						for(int i=0;i<arr.length;i++) {
						
							drr[i]=arr[i]*brr[i];
							
							System.out.print(drr[i]+" ");
						}
				
	}

}
