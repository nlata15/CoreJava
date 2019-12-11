package com.arrayQues;

/**
 * 
 * @author Nidhi Lata
 * An array contains (n-1) elements, where the value of the elements is 1 to n.
 * One of the element is missing. Find the missing element.
 *
 */
public class MissingNumberInArray01 {

	public static void main(String[] args) {
		
		int missingNumber = -1;
		int temp;
		int arr[]= {10,2,5,4,6,3,7,9,1};
		
		// sort the array
		for(int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		//print the sorted array
		for (int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		
		System.out.println();
		
		//Finding the missing Number
		for (int i=0; i< arr.length-1; i++) {
			if (arr[i+1] == arr[i] + 1) {
				continue;
			} else {
				missingNumber = arr[i] + 1;
				break;
			}
		}
		
		System.out.println("Missing Number:" + missingNumber);
	}

}
