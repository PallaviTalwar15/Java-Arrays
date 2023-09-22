package com.kn.arrays;

import java.util.Scanner;

public class BatchFriends {
	

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		// array Declaration
		String[][] arr;
		
		// array Creation
		System.out.println("Enter the Number of Batches");
		 int numberOfBatches= scan.nextInt();
		 arr =new String[numberOfBatches][]; // Size of Base array for Batches
		
		 
		 for (int i=0;i<arr.length;i++) {
				System.out.println("Enter the number  of friends in A"+(i+1)+" Batch");
				int numberOfFriends=scan.nextInt(); // Size for SubArray For number of Friends in Batch
				arr[i]=new String[numberOfFriends]; 
		 }	
		 
		// array initialization
		 
				 for (int i=0;i<arr.length;i++) {
					 System.out.println("\nEnter the names of friends in A"+(i+1)+" Batch");
					 for (int j=0;j<arr[i].length;j++) {
					
						 arr[i][j]=scan.next();
						 
					 }
				 }
				
		// Array Traversing
				 
				 for (int i=0;i<arr.length;i++) {
					 System.out.println("\n ======Your Friends  Name of Batch A"+(i+1)+" are as Follows=====");
					 for (int j=0;j<arr[i].length;j++) {
					
					System.out.println(arr[i][j]);
				
					 }
				 }				 

      }
}



