package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {12,3,54,21,90,01};
		
		for(int i=1 ; i< arr.length ; i++) {
			for(int j=0 ; j < arr.length-i ; j++) {
				if(arr[j] > arr[j+1]) {
					
					// Swapping of data
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
