package com.kn.arrays;

public class DuplicateElement {

	public static void main(String[] args) {
		 // Array Declaration,creation and initialization
		
		int[] arr = {23,43,23,26,23};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Found a Duplicate Value"+ arr[j]);
				    break;
				}
				
				
			}
			
			
			break;
			

		}
		
	}

}
