package com.kn.arrays;
import java.util.Scanner;

public class CarModel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Array Declaration
		
		String[][] arr;
		
		// Array Creation
		System.out.println("Enter the Brand Names");
		arr= new String[4][];
		for (int i=0; i<arr.length;i++)
		{
			System.out.println("Enter the Company"+(i+1)+ "Name");
			arr[i]=arr[scan.nextLine()];
			
			}
		
		
		// Array intialization
		
		arr[0][]= "Tata";
		arr[1][]= "Maruti";
		arr[2][]= "Hyundai";
		arr[3][]= "Mahindra";
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the number of models in"+arr[i]+"Company");
			
		}
		
		

	}

}
