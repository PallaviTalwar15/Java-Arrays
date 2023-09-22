package com.kn.arrays;
import java.util.Scanner;
public class AdditionOfTwoDArray {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		// Array Declaration and Creation
		System.out.println("Enter the Size of 2D Array");
		int baseSize= scan.nextInt();
		int subSize=scan.nextInt();
		
		int[][] arr = new int[baseSize][subSize];
		int[][] brr = new int[baseSize][subSize];
		int[][] crr = new int[baseSize][subSize];
		
		// 1st Array Initialization
		
		System.out.println(" Enter The values for 1st array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				arr[i][j]=scan.nextInt();
				
			}
		}
		
		
		// 2nd Array Initialization
		
				System.out.println(" Enter The values for 2nd array");
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						
						brr[i][j]=scan.nextInt();
						
					}
				}
				
		// Addition of Arrays
				System.out.println(" \n==========Addition=======");
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						
						crr[i][j]=arr[i][j]+brr[i][j];
						
						System.out.print(crr[i][j]+" ");
					}
				}
		
		

	}

}
