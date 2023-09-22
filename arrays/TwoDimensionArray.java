package com.kn.arrays;
import java.util.Scanner;
public class TwoDimensionArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Take input for number of Students
		System.out.println("Engter the number of Students=");
		int numberOfStudents = scan.nextInt();
		
		//Take input for number of Subjects
		System.out.println("Engter the number of Subjects=");
		int numberOfSubjects = scan.nextInt();
				
		// Array Declaration
		int[][] arr= new int[numberOfStudents][numberOfSubjects];
		
		// Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the data for Students"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter Subject"+(j+1)+"marks=");
				arr[i][j]=scan.nextInt();
				
			}
		}
		
		// array Traversing
		for(int i=0;i<arr.length;i++) {
			System.out.println("============Student"(i+1)+"Data=========");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Subject"+(j+1)+"Marks=");
	}
}
