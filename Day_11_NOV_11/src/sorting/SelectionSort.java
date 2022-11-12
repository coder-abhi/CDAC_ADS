package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void swapData(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void main(String[] args) {
		int arr[] = {12,3,54,21,90,01};
		int smallElePost;
		int elementPos = 0;
		
		while(elementPos < arr.length-1) {
			smallElePost = elementPos;
			int currentPos = elementPos + 1;
			while(currentPos < arr.length) {
				if(arr[currentPos] < arr[smallElePost]) smallElePost = currentPos;
				currentPos++;
			}
			
			if(smallElePost != elementPos) swapData(arr, smallElePost, elementPos);
			elementPos++;
		
		}


		System.out.println(Arrays.toString(arr));
	}

}
