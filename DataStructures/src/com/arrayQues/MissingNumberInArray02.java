package com.arrayQues;

public class MissingNumberInArray02 {

	public static void main(String[] args) {
		int arr[]= {10,2,5,4,6,3,7,9,1};
		
		boolean missingNumber = false;
		
		for(int i=1; i <= arr.length; i++) {
			
			for (int j=0; j < arr.length; j++) {
				
				if (arr[j] == i) {
					break;
				}
				
				if (j == arr.length - 1) {
					missingNumber = true;
					break;
				}
			}
			
			if (missingNumber) {
				System.out.println("Missing Number:" + i);
				break;
			}
			
		}

	}

}
