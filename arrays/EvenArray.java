package com.kn.arrays;
import java.util.Scanner;

public class EvenArray {

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
		
		//Even Checking
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+"Is Even");	
			
			}
		
		
		
	}
		System.out.println("The End");
}
	
	
}
